package solucraft.recipes;

import solucraft.blocks.ModBlock;
import solucraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class smelting {
	
	public static void init(){
		
		//ores_Dusts/Ingots/Gems
		GameRegistry.addSmelting(ModBlock.oreNikolite, new ItemStack(ModItems.dustNikolite, 3), 0.1f);
		GameRegistry.addSmelting(ModBlock.oreTungsten, new ItemStack(ModItems.ingotTungsten, 1), 0.1f);
		GameRegistry.addSmelting(ModBlock.oreSapphire, new ItemStack(ModItems.gemSapphire, 2), 0.1f);
		GameRegistry.addSmelting(ModBlock.oreGreenSapphire, new ItemStack(ModItems.gemGreenSapphire, 2), 0.1f);
		GameRegistry.addSmelting(ModBlock.oreRuby, new ItemStack(ModItems.gemRuby, 2), 0.1f);
		GameRegistry.addSmelting(ModBlock.oreTin, new ItemStack(ModItems.ingotTin, 1), 0.1f);
		GameRegistry.addSmelting(ModBlock.oreSilver, new ItemStack(ModItems.ingotSilver, 1), 0.1f);
		GameRegistry.addSmelting(ModBlock.oreCopper, new ItemStack(ModItems.ingotCopper, 1), 0.1f);
		//Storage_Gems/Ingots/Dusts
		GameRegistry.addSmelting(ModBlock.blockStorageSapphire, new ItemStack(ModItems.gemSapphire, 1), 0.1f);
		GameRegistry.addSmelting(ModBlock.blockStorageGreenSapphire, new ItemStack(ModItems.gemGreenSapphire, 1), 0.1f);
		GameRegistry.addSmelting(ModBlock.blockStorageRuby, new ItemStack(ModItems.gemRuby, 1), 0.1f);
		GameRegistry.addSmelting(ModBlock.blockStorageNikolite, new ItemStack(ModItems.dustNikolite, 1), 0.1f);
		GameRegistry.addSmelting(ModBlock.blockStorageTungsten, new ItemStack(ModItems.ingotTungsten, 1), 0.1f);
		GameRegistry.addSmelting(ModBlock.blockStorageTin, new ItemStack(ModItems.ingotTin, 1), 0.1f);
		GameRegistry.addSmelting(ModBlock.blockStorageSilver, new ItemStack(ModItems.ingotSilver, 1), 0.1f);
		GameRegistry.addSmelting(ModBlock.blockStorageCopper, new ItemStack(ModItems.ingotCopper, 1), 0.1f);
		//basalt
		GameRegistry.addSmelting(ModBlock.blockBasaltCobble, new ItemStack(ModBlock.blockBasalt, 1), 0.1f);
		//rubber
		GameRegistry.addSmelting(ModItems.rubberSmelted, new ItemStack(ModItems.rubberRaw, 1), 0.1f);
		//lamb
		GameRegistry.addSmelting(ModItems.lambRaw, new ItemStack(ModItems.lambCooked, 1), 0.1f);
		
	}

}
