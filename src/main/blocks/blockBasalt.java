package solucraft.blocks;

import java.util.Random;

import solucraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class blockBasalt extends Block {
	
	public blockBasalt() {
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

	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(ModBlocks.blockBasaltCobble);
    }
	
}
