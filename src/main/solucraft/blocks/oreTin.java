package solucraft.blocks;


import java.util.Random;

import solucraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;

public class oreTin extends Block {

	public oreTin() {
		super(Material.iron);
		this.setHardness(3F);
		this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 2);

	}
	
	@Override
	public int damageDropped(int meta)
	{
		return meta;
	}
	
	public int quantyDropped(Random random){
		return 1;
	}
}
