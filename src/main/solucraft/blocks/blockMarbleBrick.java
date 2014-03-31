package solucraft.blocks;

import java.util.Random;

import solucraft.items.ModItems;
import solucraft.lib.Metadata;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class blockMarbleBrick extends Block {
	
	public blockMarbleBrick() {
		super(Material.rock);
		this.setHardness(3F);
		this.setResistance(5.0F);
        this.setHarvestLevel("pickaxe", 0);

	}
	
	@Override
    public int damageDropped(int meta) {
        if (meta == Metadata.BASALT) {
            return Metadata.BASALTCOBBLE;
        } else {
            return meta;
        }
    }
	
	@Override
	public int quantityDropped(Random random)
	{
		return 1;
	}



}
