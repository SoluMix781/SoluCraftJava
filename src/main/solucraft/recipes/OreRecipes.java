package solucraft.recipes;

import java.util.HashMap;
import java.util.Map;

import solucraft.blocks.ModBlock;
import solucraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFishFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class OreRecipes{

	private static final FurnaceRecipes recipesRefiner = FurnaceRecipes.smelting();
	
	private Map refinerList = new HashMap();
	private Map refinerExperience = new HashMap();
	
	public static FurnaceRecipes ores(){
		return recipesRefiner;
	}
	
	public  OreRecipes() {
		this.addRefining(ModBlock.oreSapphire, new ItemStack(ModItems.gemSapphire, 1, 0), 1.0F);
	}
	
	public void addRefining(Block par1ItemID, ItemStack par2ItemStack, float par3Float) {
		refinerList.put(par1ItemID, par2ItemStack);

		this.refinerExperience.put(par2ItemStack, Float.valueOf(par3Float));

	}
	
}