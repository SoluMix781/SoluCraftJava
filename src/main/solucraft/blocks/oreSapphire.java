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

public class oreSapphire extends Block {

	public oreSapphire() {
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
	
	@Override
	public int quantityDropped(Random random)
	{
		return 2;
	}

	@Override
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
		return ModItems.gemSapphire;
    }

	
}
