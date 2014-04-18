package solucraft.proxy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.UUID;

import cpw.mods.fml.common.event.FMLServerStoppingEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.event.world.WorldEvent.Load;
import net.minecraftforge.event.world.WorldEvent.Unload;
import solucraft.common.FakeWorld;
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

    private HashMap<Integer, FakeWorld>	fakes;
    private HashSet<UUID>				awaySet;

    public CommonProxy()
    {
    	fakes = new HashMap<Integer, FakeWorld>();
    	awaySet = new HashSet<UUID>();
    }

    public void loadRenderStuff()
    {
    	// client only
    }

    public void loadKeyStuff()
    {
    	// client only...
    }

    public void onServerStop(FMLServerStoppingEvent e)
    {
    	fakes.clear();
    	awaySet.clear();
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void onWorldLoad(Load event)
    {
    	int dim = event.world.provider.dimensionId;
    	fakes.put(dim, new FakeWorld(event.world));
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public void onWorldUnLoad(Unload event)
    {
    	int dim = event.world.provider.dimensionId;
    	fakes.remove(dim);
    }

    public FakeWorld getFakeWorld(World world)
    {
    	int dim = world.provider.dimensionId;
    	return fakes.get(dim);
    }

    public void onKeyPress(UUID uuid)
    {
    	if (awaySet.contains(uuid))
    	{
    		awaySet.remove(uuid);
    	}
    	else
    	{
    		awaySet.add(uuid);
    	}
    }

    public boolean getFaceTowards(UUID uuid)
    {
    	return !awaySet.contains(uuid);
    }


}


