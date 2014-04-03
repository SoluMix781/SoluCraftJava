package solucraft.recipes;

import solucraft.blocks.ModBlocks;
import solucraft.items.ModItems;
import solucraft.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class crafting {
	
    public static void init(){
   
    	
    	
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockStorageSapphire, 1), new Object[] {"XXX","XXX","XXX",'X', ModItems.gemSapphire});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockStorageGreenSapphire, 1), new Object[] {"XXX","XXX","XXX",'X', ModItems.gemGreenSapphire});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockStorageRuby, 1), new Object[] {"XXX","XXX","XXX",'X', ModItems.gemRuby});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockStorageNikolite, 1), new Object[] {"XXX","XXX","XXX",'X', ModItems.dustNikolite});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockStorageTungsten, 1), new Object[] {"XXX","XXX","XXX",'X', ModItems.ingotTungsten});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockStorageTin, 1), new Object[] {"XXX","XXX","XXX",'X', ModItems.ingotTin});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockStorageSilver, 1), new Object[] {"XXX","XXX","XXX",'X', ModItems.ingotSilver});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockStorageCopper, 1), new Object[] {"XXX","XXX","XXX",'X', ModItems.ingotCopper});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockMarbleBrick, 4), new Object[] {"XX","XX",'X', ModBlocks.blockMarble});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockBasaltBrick, 4), new Object[] {"XX","XX",'X', ModBlocks.blockBasalt});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockBasaltChiseled, 4), new Object[] {"XX","XX",'X', ModBlocks.blockBasaltBrick});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockBasaltPaver, 4), new Object[] {"XX","XX",'X', ModBlocks.blockBasaltChiseled});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockBasalt, 4), new Object[] {"XX","XX",'X', ModBlocks.blockBasaltPaver});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.blockMarble, 4), new Object[] {"XX","XX",'X', ModBlocks.blockMarbleBrick});
    	GameRegistry.addRecipe(new ItemStack (ModItems.axeRuby, 1), new Object[] {"XX ","XI ", " I " ,'X', ModItems.gemRuby, 'I', ModItems.stickIron});
    	GameRegistry.addRecipe(new ItemStack (ModItems.axeSapphire, 1), new Object[] {"XX ","XI ", " I " ,'X', ModItems.gemSapphire, 'I', ModItems.stickIron});
    	GameRegistry.addRecipe(new ItemStack (ModItems.axeGreenSapphire, 1), new Object[] {"XX ","XI " , " I " ,'X', ModItems.gemGreenSapphire, 'I', ModItems.stickIron});
    	GameRegistry.addRecipe(new ItemStack (ModItems.shovelRuby, 1), new Object[] {" X "," I ", " I " ,'X', ModItems.shovelRuby, 'I', ModItems.stickIron});
    	GameRegistry.addRecipe(new ItemStack (ModItems.shovelSapphire, 1), new Object[] {" X "," I ", " I " ,'X', ModItems.shovelSapphire, 'I', ModItems.stickIron});
    	GameRegistry.addRecipe(new ItemStack (ModItems.shovelGreenSapphire, 1), new Object[] {" X "," I ", " I " ,'X', ModItems.shovelGreenSapphire, 'I', ModItems.stickIron});
    	GameRegistry.addRecipe(new ItemStack (ModItems.hoeRuby, 1), new Object[] {"XX "," I ", " I " ,'X', ModItems.hoeRuby, 'I', ModItems.stickIron});
    	GameRegistry.addRecipe(new ItemStack (ModItems.hoeSapphire, 1), new Object[] {"XX "," I ", " I " ,'X', ModItems.hoeSapphire, 'I', ModItems.stickIron});
    	GameRegistry.addRecipe(new ItemStack (ModItems.hoeGreenSapphire, 1), new Object[] {"XX "," I ", " I " ,'X', ModItems.pickaxeRuby, 'I', ModItems.stickIron});
    	GameRegistry.addRecipe(new ItemStack (ModItems.pickaxeRuby, 1), new Object[] {"XXX"," I ", " I " ,'X', ModItems.hoeRuby, 'I', ModItems.stickIron});
    	GameRegistry.addRecipe(new ItemStack (ModItems.pickaxeSapphire, 1), new Object[] {"XXX"," I ", " I " ,'X', ModItems.pickaxeSapphire, 'I', ModItems.stickIron});
    	GameRegistry.addRecipe(new ItemStack (ModItems.pickaxeGreenSapphire, 1), new Object[] {"XXX"," I ", " I " ,'X', ModItems.pickaxeGreenSapphire, 'I', ModItems.stickIron});
    	
    	GameRegistry.addRecipe(new ItemStack (ModItems.glass, 1), new Object[] {"XXX","X X", "XXX" ,'X', Items.gold_ingot});
       	GameRegistry.addRecipe(new ItemStack (ModItems.chest, 1), new Object[] {"XIX","XXX", "XXX" ,'X', Items.leather, 'I', ModItems.rubberSmelted});
       	GameRegistry.addRecipe(new ItemStack (ModItems.legs, 1), new Object[] {"XXX","XIX", "XIX" ,'X', Items.leather, 'I', ModItems.rubberSmelted});
       	GameRegistry.addRecipe(new ItemStack (ModItems.boots, 1), new Object[] {"III","XIX", "XIX" ,'X', Items.leather, 'I', ModItems.rubberSmelted});

    	GameRegistry.addRecipe(new ItemStack (ModBlocks.slabDia, 6), new Object[] {"XXX",'X', Blocks.diamond_block});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.slabGold, 6), new Object[] {"XXX",'X', Blocks.gold_block});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.slabIron, 6), new Object[] {"XXX",'X', Blocks.iron_block});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.slabRuby, 6), new Object[] {"XXX",'X', ModBlocks.blockStorageRuby});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.slabSapp, 6), new Object[] {"XXX",'X', ModBlocks.blockStorageSapphire});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.slabGreen, 6), new Object[] {"XXX",'X', ModBlocks.blockStorageGreenSapphire});
    	
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.stairDia, 6), new Object[] {"X  ","XX ","XXX",'X', Blocks.diamond_block});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.stairsGold, 6), new Object[] {"X  ","XX ","XXX",'X', Blocks.gold_block});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.stairsIron, 6), new Object[] {"X  ","XX ","XXX",'X', Blocks.iron_block});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.stairsRuby, 6), new Object[] {"X  ","XX ","XXX",'X', ModBlocks.blockStorageRuby});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.stairsSapp, 6), new Object[] {"X  ","XX ","XXX",'X', ModBlocks.blockStorageSapphire});
    	GameRegistry.addRecipe(new ItemStack (ModBlocks.stairsGreen, 6), new Object[] {"X  ","XX ","XXX",'X', ModBlocks.blockStorageGreenSapphire});
    	
    	GameRegistry.addRecipe(new ItemStack (ModItems.grenade, 2), new Object[] {"XXI","XOX","XXX",'X', Blocks.wool, 'I' , Items.string, 'O' , Blocks.tnt});
    }

}
