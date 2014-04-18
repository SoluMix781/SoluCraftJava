package solucraft.proxy;

import java.util.UUID;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.tileentity.TileEntityRendererChestHelper;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSnowball;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import solucraft.SoluCraft;
import solucraft.blocks.ModBlocks;
import solucraft.client.BlockRenderer;
import solucraft.client.SecretKeyHandler;
import solucraft.entity.EntityGrenade;
import solucraft.ironchest.IronChestType;
import solucraft.ironchest.TileEntityIronChest;
import solucraft.ironchest.client.GUIChest;
import solucraft.ironchest.client.IronChestRenderHelper;
import solucraft.ironchest.client.TileEntityIronChestRenderer;
import solucraft.items.ModItems;
import solucraft.lib.Reference;
import solucraft.network.PacketKey;
import solucraft.network.PacketManager;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;

public class ClientProxy extends CommonProxy{
	

    public void registerRenderThings(){
    	RenderingRegistry.registerEntityRenderingHandler(EntityGrenade.class, new RenderSnowball(ModItems.grenade));
	}
	
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	
	@Override
    public void registerRenderInformation()
    {
        TileEntityRendererChestHelper.instance = new IronChestRenderHelper();
    }

    @Override
    public void registerTileEntitySpecialRenderer(IronChestType typ)
    {
        ClientRegistry.bindTileEntitySpecialRenderer(typ.clazz, new TileEntityIronChestRenderer());
    }

    @Override
    public World getClientWorld()
    {
        return FMLClientHandler.instance().getClient().theWorld;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity te = world.getTileEntity(x, y, z);
        if (te != null && te instanceof TileEntityIronChest)
        {
            return GUIChest.GUI.buildGUI(IronChestType.values()[ID], player.inventory, (TileEntityIronChest) te);
        }
        else
        {
            return null;
        }
    }
	
    public static KeyBinding	key_OneWayFace;
	private boolean				oneWayFaceTowards	= true;

	public ClientProxy()
	{
		key_OneWayFace = new KeyBinding("key.secretroomsmod.oneWayface", Keyboard.KEY_BACKSLASH, "key.categories.gameplay");
		//MinecraftForge.EVENT_BUS.register(this);
	}

	@Override
	public void loadRenderStuff()
	{
		ModBlocks.render3DId = RenderingRegistry.getNextAvailableRenderId();
		ModBlocks.renderFlatId = RenderingRegistry.getNextAvailableRenderId();
		RenderingRegistry.registerBlockHandler(new BlockRenderer(ModBlocks.render3DId));
		RenderingRegistry.registerBlockHandler(new BlockRenderer(ModBlocks.renderFlatId));
	}

	@Override
	public void loadKeyStuff()
	{
		ClientRegistry.registerKeyBinding(key_OneWayFace);
		FMLCommonHandler.instance().bus().register(new SecretKeyHandler());
	}

	@Override
	public void onServerStop(FMLServerStoppingEvent e)
	{
		super.onServerStop(e);
		oneWayFaceTowards = true;
	}

	@Override
	public void onKeyPress(UUID uuid)
	{
		oneWayFaceTowards = !oneWayFaceTowards;
		PacketManager.sendToServer(new PacketKey());
	}

	@Override
	public boolean getFaceTowards(UUID uuid)
	{
		return oneWayFaceTowards;
	}

}
