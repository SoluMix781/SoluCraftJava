package solucraft.recipes;

import solucraft.blocks.ModBlocks;
import solucraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class smelting {
	
	public static void init(){
		
		//ores_Dusts/Ingots/Gems
		GameRegistry.addSmelting(ModBlocks.oreNikolite, new ItemStack(ModItems.dustNikolite, 3), 0.1f);
		GameRegistry.addSmelting(ModBlocks.oreTungsten, new ItemStack(ModItems.ingotTungsten, 1), 0.1f);
		GameRegistry.addSmelting(ModBlocks.oreSapphire, new ItemStack(ModItems.gemSapphire, 2), 0.1f);
		GameRegistry.addSmelting(ModBlocks.oreGreenSapphire, new ItemStack(ModItems.gemGreenSapphire, 2), 0.1f);
		GameRegistry.addSmelting(ModBlocks.oreRuby, new ItemStack(ModItems.gemRuby, 2), 0.1f);
		GameRegistry.addSmelting(ModBlocks.oreTin, new ItemStack(ModItems.ingotTin, 1), 0.1f);
		GameRegistry.addSmelting(ModBlocks.oreSilver, new ItemStack(ModItems.ingotSilver, 1), 0.1f);
		GameRegistry.addSmelting(ModBlocks.oreCopper, new ItemStack(ModItems.ingotCopper, 1), 0.1f);
		//Storage_Gems/Ingots/Dusts
		GameRegistry.addSmelting(ModBlocks.blockStorageSapphire, new ItemStack(ModItems.gemSapphire, 1), 0.1f);
		GameRegistry.addSmelting(ModBlocks.blockStorageGreenSapphire, new ItemStack(ModItems.gemGreenSapphire, 1), 0.1f);
		GameRegistry.addSmelting(ModBlocks.blockStorageRuby, new ItemStack(ModItems.gemRuby, 1), 0.1f);
		GameRegistry.addSmelting(ModBlocks.blockStorageNikolite, new ItemStack(ModItems.dustNikolite, 1), 0.1f);
		GameRegistry.addSmelting(ModBlocks.blockStorageTungsten, new ItemStack(ModItems.ingotTungsten, 1), 0.1f);
		GameRegistry.addSmelting(ModBlocks.blockStorageTin, new ItemStack(ModItems.ingotTin, 1), 0.1f);
		GameRegistry.addSmelting(ModBlocks.blockStorageSilver, new ItemStack(ModItems.ingotSilver, 1), 0.1f);
		GameRegistry.addSmelting(ModBlocks.blockStorageCopper, new ItemStack(ModItems.ingotCopper, 1), 0.1f);
		//basalt
		GameRegistry.addSmelting(ModBlocks.blockBasaltCobble, new ItemStack(ModBlocks.blockBasalt, 1), 0.1f);
		//rubber
		GameRegistry.addSmelting(ModItems.rubberSmelted, new ItemStack(ModItems.rubberRaw, 1), 0.1f);
		//lamb
		GameRegistry.addSmelting(ModItems.lambRaw, new ItemStack(ModItems.lambCooked, 1), 0.1f);
		
	}

}
