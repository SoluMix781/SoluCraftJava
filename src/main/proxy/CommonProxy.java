package solucraft.proxy;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import solucraft.ironchest.ContainerIronChest;
import solucraft.ironchest.IronChestType;
import solucraft.ironchest.TileEntityIronChest;

public class CommonProxy implements IGuiHandler {

	public int addArmor(String armor) {
		return 0;
	}

	public void registerRenderThings() {

	}
	
	public void registerRenderInformation()
    {

    }

    public void registerTileEntitySpecialRenderer(IronChestType typ)
    {

    }

    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }

    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int X, int Y, int Z)
    {
        TileEntity te = world.getTileEntity(X, Y, Z);
        if (te != null && te instanceof TileEntityIronChest)
        {
            TileEntityIronChest icte = (TileEntityIronChest) te;
            return new ContainerIronChest(player.inventory, icte, icte.getType(), 0, 0);
        }
        else
        {
            return null;
        }
    }

    public World getClientWorld()
    {
        return null;
    }


}
