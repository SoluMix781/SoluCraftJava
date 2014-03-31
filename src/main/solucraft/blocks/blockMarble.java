package solucraft.blocks;

import java.util.Random;

import solucraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class blockMarble extends Block {
	
	public blockMarble() {
		super(Material.rock);
		this.setHardness(3F);
		this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 0);

	}
	
	@Override
	public int damageDropped(int meta)
	{
		return meta;
	}
	
	@Override
	public int quantityDropped(Random random)
	{
		return 1;
	}



}
