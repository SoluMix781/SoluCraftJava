package solucraft.items;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import solucraft.SoluCraft;
import solucraft.blocks.BlockCamoDoor;
import solucraft.blocks.ModBlocks;
import solucraft.lib.Metadata;
import solucraft.lib.Module;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.oredict.OreDictionary;
import solucraft.lib.*;


public class ModItems {
	
	public static Item gemSapphire, gemGreenSapphire, gemRuby, ingotCopper,
			ingotTin, ingotSilver, dustNikolite, ingotTungsten, woolCard;
	public static Item axeRuby, axeGreenSapphire, axeSapphire, shovelRuby,
			shovelSapphire, shovelGreenSapphire, pickaxeRuby,
			pickaxeGreenSapphire, pickaxeSapphire, hoeRuby, hoeSapphire,
			hoeGreenSapphire, macerator, rubberRaw, rubberSmelted,  lambRaw, lambCooked, stickIron,
			grenade, chestDoctor,camoDoorWoodItem, camoDoorIronItem,camoPaste;
	public static Item chest, legs, boots, glass;
	public static ToolMaterial material = EnumHelper.addToolMaterial(
			"material", 3, 30000, 8.0F, 3.0F, 10);
    public static ArmorMaterial smoking = EnumHelper.addArmorMaterial(
    		"smoking", 0, new int[]{0,0,0,0}, 0);

	
	public static void init() {
	

		gemSapphire = new Item().setUnlocalizedName("gemSapphire").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:gemSapphire");
		GameRegistry.registerItem(gemSapphire, "gemSapphire");
		gemGreenSapphire = new Item().setUnlocalizedName("gemGreenSapphire").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:gemGreenSapphire");
		GameRegistry.registerItem(gemGreenSapphire, "gemGreenSapphire");
		gemRuby = new Item().setUnlocalizedName("gemRuby").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:gemRuby");
		GameRegistry.registerItem(gemRuby, "gemRuby");
		ingotCopper = new Item().setUnlocalizedName("ingotCopper").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:ingotCopper");
		GameRegistry.registerItem(ingotCopper, "ingotCopper");
		ingotTin = new Item().setUnlocalizedName("ingotTin").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:ingotTin");
		GameRegistry.registerItem(ingotTin, "ingotTin");
		ingotSilver = new Item().setUnlocalizedName("ingotSilver").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:ingotSilver");
		GameRegistry.registerItem(ingotSilver, "ingotSilver");
		dustNikolite = new Item().setUnlocalizedName("dustNikolite").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:dustNikolite");
		GameRegistry.registerItem(dustNikolite, "dustNikolite");
		ingotTungsten = new Item().setUnlocalizedName("ingotTungsten").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:ingotTungsten");
		GameRegistry.registerItem(ingotTungsten, "ingotTungsten");
		
		axeRuby = new axe(material).setUnlocalizedName("axeRuby").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:axeRuby");
		GameRegistry.registerItem(axeRuby, "axeRuby");
		axeGreenSapphire = new axe(material).setUnlocalizedName("axeGreenSapphire").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:axeGreenSapphire");
		GameRegistry.registerItem(axeGreenSapphire, "axeGreenSapphire");
		axeSapphire = new axe(material).setUnlocalizedName("axeSapphire").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:axeSapphire");
		GameRegistry.registerItem(axeSapphire, "axeSapphire");
		
		shovelRuby = new shovel(material).setUnlocalizedName("shovelRuby").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:shovelRuby");
		GameRegistry.registerItem(shovelRuby, "shovelRuby");
		shovelGreenSapphire = new shovel(material).setUnlocalizedName("shovelGreenSapphire").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:shovelGreenSapphire");
		GameRegistry.registerItem(shovelGreenSapphire, "shovelGreenSapphire");
		shovelSapphire = new shovel(material).setUnlocalizedName("shovelSapphire").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:shovelSapphire");
		GameRegistry.registerItem(shovelSapphire, "shovelSapphire");

		hoeRuby = new hoe(material).setUnlocalizedName("hoeRuby").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:hoeRuby");
		GameRegistry.registerItem(hoeRuby, "hoeRuby");
		hoeGreenSapphire = new hoe(material).setUnlocalizedName("hoeGreenSapphire").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:hoeGreenSapphire");
		GameRegistry.registerItem(hoeGreenSapphire, "hoeGreenSapphire");
		hoeSapphire = new hoe(material).setUnlocalizedName("hoeSapphire").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:hoeSapphire");
		GameRegistry.registerItem(hoeSapphire, "hoeSapphire");
		
		pickaxeRuby = new pickaxe(material).setUnlocalizedName("pickaxeRuby").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:pickaxeRuby");
		GameRegistry.registerItem(pickaxeRuby, "pickaxeRuby");
		pickaxeGreenSapphire = new pickaxe(material).setUnlocalizedName("pickaxeGreenSapphire").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:pickaxeGreenSapphire");
		GameRegistry.registerItem(pickaxeGreenSapphire, "pickaxeGreenSapphire");
		pickaxeSapphire = new pickaxe(material).setUnlocalizedName("pickaxeSapphire").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:pickaxeSapphire");
		GameRegistry.registerItem(pickaxeSapphire, "pickaxeSapphire");
		
		rubberRaw = new Item().setUnlocalizedName("rubberRaw").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:rubberRaw").setMaxStackSize(64);
		GameRegistry.registerItem(rubberRaw, "rubberRaw");
		rubberSmelted = new Item().setUnlocalizedName("rubberSmelted").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:rubberSmelted").setMaxStackSize(16);
		GameRegistry.registerItem(rubberSmelted, "rubberSmelted");
		
		lambRaw = new ItemFood(1, true).setUnlocalizedName("lambRaw").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:lambRaw").setMaxStackSize(64);
		GameRegistry.registerItem(lambRaw, "lambRaw");
		lambCooked = new ItemFood(4, true).setUnlocalizedName("lambCooked").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:lambCooked").setMaxStackSize(64);
		GameRegistry.registerItem(lambCooked, "lambCooked");
		
		
		stickIron = new Item().setUnlocalizedName("stickIron").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:stickIron").setMaxStackSize(64);
		GameRegistry.registerItem(stickIron, "stickIron");
		

		glass = new smoking (smoking , 0, 0, 0).setUnlocalizedName("glass").setCreativeTab(SoluCraft.tabSoluCraftItems);
		chest = new smoking (smoking , 0, 1, 0).setUnlocalizedName("chest").setCreativeTab(SoluCraft.tabSoluCraftItems);
		legs = new smoking (smoking , 0, 2, 0).setUnlocalizedName("legs").setCreativeTab(SoluCraft.tabSoluCraftItems);
		boots = new smoking (smoking , 0, 3, 0).setUnlocalizedName("boots").setCreativeTab(SoluCraft.tabSoluCraftItems);
		chestDoctor = new smoking (smoking , 0, 1, 1).setUnlocalizedName("doctor").setCreativeTab(SoluCraft.tabSoluCraftItems);
        GameRegistry.registerItem(chest , "Chest");
        GameRegistry.registerItem(legs , "legs");
        GameRegistry.registerItem(boots , "Boots");
        GameRegistry.registerItem(glass , "Glass");
        GameRegistry.registerItem(chestDoctor,"chestDoctor");
        
        camoDoorWoodItem = new ItemCamoDoor(Material.wood).setUnlocalizedName("SecretWoodenDoorItem");
        camoDoorIronItem = new ItemCamoDoor(Material.iron).setUnlocalizedName("SecretIronDoorItem");
        camoPaste = new Item().setUnlocalizedName("CamoflaugePaste").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName(Reference.TEXTURE_ITEM_PASTE);
        GameRegistry.registerItem(camoDoorWoodItem, "SecretWoodenDoorItem");
        GameRegistry.registerItem(camoDoorIronItem, "SecretWoodenIronItem");
        GameRegistry.registerItem(camoPaste, "CamoflaugePaste");
        OreDictionary.registerOre(Reference.CAMO_PASTE, camoPaste);

        
        grenade = new Grenate().setUnlocalizedName("Grenade").setCreativeTab(SoluCraft.tabSoluCraftItems).setTextureName("solucraft:grenade");
        GameRegistry.registerItem(grenade, "grenade");
		
		
	}	
}



