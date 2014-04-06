package solucraft.proxy;

import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraft.client.renderer.tileentity.TileEntityRendererChestHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSnowball;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import solucraft.entity.EntityGrenade;
import solucraft.ironchest.IronChestType;
import solucraft.ironchest.TileEntityIronChest;
import solucraft.ironchest.client.GUIChest;
import solucraft.ironchest.client.IronChestRenderHelper;
import solucraft.ironchest.client.TileEntityIronChestRenderer;
import solucraft.items.ModItems;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

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
	

}
