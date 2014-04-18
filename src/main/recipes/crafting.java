package solucraft.recipes;

import java.util.ArrayList;

import solucraft.SoluCraft;
import solucraft.blocks.ModBlocks;
import solucraft.items.ModItems;
import solucraft.lib.Reference;
import solucraft.lib.Strings;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

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
    	GameRegistry.addRecipe(new ItemStack (ModItems.chestDoctor, 1), new Object[] {"XIX", "XXX", "XXX" , 'X', Items.leather, 'I', Blocks.wool});

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
    
    	 ArrayList<IRecipe> recipes = new ArrayList<IRecipe>();

         // Camo gate
         recipes.add(new ShapedOreRecipe(ModBlocks.camoGate, new Object[] {
                 "#0#",
                 "0A0",
                 "#@#",
                 '#', Blocks.planks,
                 '0', Reference.CAMO_PASTE,
                 '@', Items.redstone,
                 'A', Items.ender_pearl
         }));

         // TorchLever
         recipes.add(new ShapedOreRecipe(ModBlocks.torchLever, new Object[] {
                 "#",
                 "X",
                 '#', Blocks.torch,
                 'X', Items.redstone
         }));

         // CamoDoors
         recipes.add(new ShapelessOreRecipe(ModItems.camoDoorWoodItem,
                 new Object[] {
        		 Reference.CAMO_PASTE,
                         Items.wooden_door
                 }));
         recipes.add(new ShapelessOreRecipe(ModItems.camoDoorIronItem,
                 new Object[] {
        		 Reference.CAMO_PASTE,
                         Items.iron_door
                 }));
         recipes.add(new ShapelessOreRecipe(ModBlocks.camoTrapDoor,
                 new Object[] {
        		 Reference.CAMO_PASTE,
                         Blocks.trapdoor
                 }));

         // CAMO_PASTE
         recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.camoPaste, 9), new Object[] {
                 "XXX",
                 "X0X",
                 "XXX",
                 'X', new ItemStack(Items.dye, 1, OreDictionary.WILDCARD_VALUE),
                 '0', Blocks.dirt
         }));
         recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.camoPaste, 9), new Object[] {
                 "XXX",
                 "X0X",
                 "XXX",
                 'X', new ItemStack(Items.dye, 1, OreDictionary.WILDCARD_VALUE),
                 '0', Blocks.sand
         }));
         recipes.add(new ShapedOreRecipe(new ItemStack(ModItems.camoPaste, 9), new Object[] {
                 "XXX",
                 "X0X",
                 "XXX",
                 'X', new ItemStack(Items.dye, 1, OreDictionary.WILDCARD_VALUE),
                 '0', Items.clay_ball
         }));

         // Camo OneWay
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.oneWay, 9), new Object[] {
                 "X00",
                 "X00",
                 "X00",
                 'X', Reference.CAMO_PASTE,
                 '0', Blocks.glass
         }));
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.oneWay, 9), new Object[] {
                 "00X",
                 "00X",
                 "00X",
                 'X', Reference.CAMO_PASTE,
                 '0', Blocks.glass
         }));
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.oneWay, 9), new Object[] { "XXX",
                 "000",
                 "000",
                 'X', Reference.CAMO_PASTE,
                 '0', Blocks.glass
         }));
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.oneWay, 9), new Object[] { "000",
                 "000",
                 "XXX",
                 'X', Reference.CAMO_PASTE,
                 '0', Blocks.glass
         }));
         recipes.add(new ShapelessOreRecipe(ModBlocks.oneWay, new Object[] {
        		 Reference.CAMO_PASTE, Blocks.glass }));

         // CamoGhost
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoGhost, 4), new Object[] {
                 "X0X",
                 "0 0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh
         }));
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoGhost, 4), new Object[] {
                 "X0X",
                 "0 0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE)
         }));

         // Camo-Redstone
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoCurrent, 4), new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh,
                 '@', Items.redstone
         }));
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoCurrent, 4), new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE),
                 '@', Items.redstone
         }));

         // Camo-Lever
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoLever, 4), new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh,
                 '@', Blocks.lever
         }));
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoLever, 4), new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE),
                 '@', Blocks.lever
         }));

         // Camo-Button Stone stuff
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoButton, 4, 0), new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh,
                 '@', Blocks.stone_button
         }));
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoButton, 4, 0), new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE),
                 '@', Blocks.stone_button
         }));

         // Camo-Button Wood stuff
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoButton, 4, 1), new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh,
                 '@', Blocks.wooden_button
         }));
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoButton, 4, 1), new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE),
                 '@', Blocks.wooden_button
         }));

         // pressure plates
         recipes.add(new ShapedOreRecipe(ModBlocks.camoPlateAll, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh,
                 '@', Blocks.stone_pressure_plate
         }));
         recipes.add(new ShapedOreRecipe(ModBlocks.camoPlateAll, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE),
                 '@', Blocks.stone_pressure_plate
         }));

         recipes.add(new ShapedOreRecipe(ModBlocks.camoPlatePlayer, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh,
                 '@', Blocks.stone_pressure_plate,
         }));
         recipes.add(new ShapedOreRecipe(ModBlocks.camoPlatePlayer, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE),
                 '@', Blocks.stone_pressure_plate,
         }));

         // weighted pressure plates
         recipes.add(new ShapedOreRecipe(ModBlocks.camoPlateLight, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh,
                 '@', Blocks.light_weighted_pressure_plate,
         }));
         recipes.add(new ShapedOreRecipe(ModBlocks.camoPlateLight, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE),
                 // new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE)
                 '@', Blocks.light_weighted_pressure_plate,
         }));

         recipes.add(new ShapedOreRecipe(ModBlocks.camoPlateHeavy, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh,
                 '@', Blocks.heavy_weighted_pressure_plate,
         }));
         recipes.add(new ShapedOreRecipe(ModBlocks.camoPlateHeavy, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE),
                 '@', Blocks.heavy_weighted_pressure_plate,
         }));

         // CamoStairs
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoStairs, 4), new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh,
                 '@', "stairWood"
         }));
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoStairs, 4), new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE),
                 '@', "stairWood"
         }));
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoStairs, 4), new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh,
                 '@', Blocks.stone_stairs
         }));
         recipes.add(new ShapedOreRecipe(new ItemStack(ModBlocks.camoStairs, 4), new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE),
                 '@', Blocks.stone_stairs
         }));

         // CamoChests
         recipes.add(new ShapedOreRecipe(ModBlocks.camoChest, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh,
                 '@', Blocks.chest
         }));
         recipes.add(new ShapedOreRecipe(ModBlocks.camoChest, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE),
                 '@', Blocks.chest
         }));

         // Trapped Chests
         recipes.add(new ShapedOreRecipe(ModBlocks.camoTrappedChest, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh,
                 '@', Blocks.trapped_chest
         }));
         recipes.add(new ShapedOreRecipe(ModBlocks.camoTrappedChest, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE),
                 '@', Blocks.trapped_chest
         }));

         // Trapped Chests
         recipes.add(new ShapedOreRecipe(ModBlocks.camoLightDetector, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', Items.rotten_flesh,
                 '@', Blocks.daylight_detector
         }));
         recipes.add(new ShapedOreRecipe(ModBlocks.camoLightDetector, new Object[] {
                 "X0X",
                 "0@0",
                 "X0X",
                 'X', Reference.CAMO_PASTE,
                 '0', new ItemStack(Blocks.wool, 1, OreDictionary.WILDCARD_VALUE),
                 '@', Blocks.daylight_detector
         }));

         // Solid Air
         recipes.add(new ShapelessOreRecipe(ModBlocks.solidAir,
                 new Object[] {
        		 Reference.CAMO_PASTE,
                         Items.blaze_powder,
                         Items.water_bucket
                 }));
         recipes.add(new ShapelessOreRecipe(ModBlocks.solidAir,
                 new Object[] {
        		 Reference.CAMO_PASTE,
                         Items.blaze_rod,
                         Items.water_bucket
                 }));
         recipes.add(new ShapelessOreRecipe(ModBlocks.solidAir,
                 new Object[] {
        		 Reference.CAMO_PASTE,
                         Items.magma_cream,
                         Items.water_bucket
                 }));
         recipes.add(new ShapelessOreRecipe(ModBlocks.solidAir,
                 new Object[] {
        		 Reference.CAMO_PASTE,
                         Items.blaze_powder,
                         Items.potionitem
                 }));
         recipes.add(new ShapelessOreRecipe(ModBlocks.solidAir,
                 new Object[] {
        		 Reference.CAMO_PASTE,
                         Items.blaze_rod,
                         Items.potionitem
                 }));
         recipes.add(new ShapelessOreRecipe(ModBlocks.solidAir,
                 new Object[] {
        		 Reference.CAMO_PASTE,
                         Items.magma_cream,
                         Items.potionitem
                 }));

         // actually add the recipe
         for (IRecipe r : recipes)
         {
             GameRegistry.addRecipe(r);
         }
    	
    }

}
