package solucraft.events;


import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import solucraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class MobDrop {

	@SubscribeEvent
	public void onLivingDeathEvent(LivingDropsEvent event)
	{
		Entity e = event.entity;
		double rand = Math.random();
		
		
		if(e instanceof EntitySlime)
		{
			if(rand < 1D)
			{
				e.dropItem(ModItems.rubberRaw, 1);
			}
		}
		
		

		if(e instanceof EntitySheep)
		{
			if(rand < 1D)
			{
				e.dropItem(ModItems.lambRaw, 2);
			}
		}
		
		
		
		
		
	}
	
}