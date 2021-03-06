package solucraft.items;

import solucraft.SoluCraft;
import solucraft.entity.EntityGrenade;
import solucraft.entity.SEntity;
import solucraft.ironchest.TileEntityIronChest;
import ibxm.Player;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public class Grenate extends Item {
	
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer pl){
		if(!pl.capabilities.isCreativeMode){
			--stack.stackSize;
		}
		world.playSoundAtEntity(pl, "random.fizz", 0.7F, 0.8F);
		
		if(!world.isRemote){
			world.spawnEntityInWorld(new EntityGrenade(world,pl));
		}
		return stack;
	}
	

}