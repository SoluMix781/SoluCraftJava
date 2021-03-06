
package solucraft.ironchest.client;

import solucraft.ironchest.CommonProxy;
import solucraft.ironchest.IronChestType;
import solucraft.ironchest.TileEntityIronChest;
import net.minecraft.client.renderer.tileentity.TileEntityRendererChestHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {
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
