package solucraft.items;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import solucraft.SoluCraft;
import solucraft.lib.Metadata;
import solucraft.lib.Module;
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
			hoeGreenSapphire, macerator, rubberRaw, rubberSmelted,  lambRaw, lambCooked, stickIron;
	public static Item chest, legs, boots, glass;
	public static ToolMaterial material = EnumHelper.addToolMaterial(
			"material", 3, 30000, 8.0F, 3.0F, 10);
    public static ArmorMaterial smoking = EnumHelper.addArmorMaterial("smoking", 0, new int[]{0,0,0,0}, 0);

	
	public static void init() {
	

		gemSapphire = new Item().setUnlocalizedName("gemSapphire").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:gemSapphire");
		GameRegistry.registerItem(gemSapphire, "gemSapphire");
		gemGreenSapphire = new Item().setUnlocalizedName("gemGreenSapphire").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:gemGreenSapphire");
		GameRegistry.registerItem(gemGreenSapphire, "gemGreenSapphire");
		gemRuby = new Item().setUnlocalizedName("gemRuby").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:gemRuby");
		GameRegistry.registerItem(gemRuby, "gemRuby");
		ingotCopper = new Item().setUnlocalizedName("ingotCopper").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:ingotCopper");
		GameRegistry.registerItem(ingotCopper, "ingotCopper");
		ingotTin = new Item().setUnlocalizedName("ingotTin").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:ingotTin");
		GameRegistry.registerItem(ingotTin, "ingotTin");
		ingotSilver = new Item().setUnlocalizedName("ingotSilver").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:ingotSilver");
		GameRegistry.registerItem(ingotSilver, "ingotSilver");
		dustNikolite = new Item().setUnlocalizedName("dustNikolite").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:dustNikolite");
		GameRegistry.registerItem(dustNikolite, "dustNikolite");
		ingotTungsten = new Item().setUnlocalizedName("ingotTungsten").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:ingotTungsten");
		GameRegistry.registerItem(ingotTungsten, "ingotTungsten");
		
		axeRuby = new axe(material).setUnlocalizedName("axeRuby").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:axeRuby");
		GameRegistry.registerItem(axeRuby, "axeRuby");
		axeGreenSapphire = new axe(material).setUnlocalizedName("axeGreenSapphire").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:axeGreenSapphire");
		GameRegistry.registerItem(axeGreenSapphire, "axeGreenSapphire");
		axeSapphire = new axe(material).setUnlocalizedName("axeSapphire").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:axeSapphire");
		GameRegistry.registerItem(axeSapphire, "axeSapphire");
		
		shovelRuby = new shovel(material).setUnlocalizedName("shovelRuby").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:shovelRuby");
		GameRegistry.registerItem(shovelRuby, "shovelRuby");
		shovelGreenSapphire = new shovel(material).setUnlocalizedName("shovelGreenSapphire").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:shovelGreenSapphire");
		GameRegistry.registerItem(shovelGreenSapphire, "shovelGreenSapphire");
		shovelSapphire = new shovel(material).setUnlocalizedName("shovelSapphire").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:shovelSapphire");
		GameRegistry.registerItem(shovelSapphire, "shovelSapphire");

		hoeRuby = new hoe(material).setUnlocalizedName("hoeRuby").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:hoeRuby");
		GameRegistry.registerItem(hoeRuby, "hoeRuby");
		hoeGreenSapphire = new hoe(material).setUnlocalizedName("hoeGreenSapphire").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:hoeGreenSapphire");
		GameRegistry.registerItem(hoeGreenSapphire, "hoeGreenSapphire");
		hoeSapphire = new hoe(material).setUnlocalizedName("hoeSapphire").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:hoeSapphire");
		GameRegistry.registerItem(hoeSapphire, "hoeSapphire");
		
		pickaxeRuby = new pickaxe(material).setUnlocalizedName("pickaxeRuby").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:pickaxeRuby");
		GameRegistry.registerItem(pickaxeRuby, "pickaxeRuby");
		pickaxeGreenSapphire = new pickaxe(material).setUnlocalizedName("pickaxeGreenSapphire").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:pickaxeGreenSapphire");
		GameRegistry.registerItem(pickaxeGreenSapphire, "pickaxeGreenSapphire");
		pickaxeSapphire = new pickaxe(material).setUnlocalizedName("pickaxeSapphire").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:pickaxeSapphire");
		GameRegistry.registerItem(pickaxeSapphire, "pickaxeSapphire");
		
		/*macerator = new Item().setUnlocalizedName("macerator").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:macerator").setMaxDamage(128).setMaxStackSize(1);
		GameRegistry.registerItem(macerator, "macerator");*/
		
		rubberRaw = new Item().setUnlocalizedName("rubberRaw").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:rubberRaw").setMaxStackSize(64);
		GameRegistry.registerItem(rubberRaw, "rubberRaw");
		rubberSmelted = new Item().setUnlocalizedName("rubberSmelted").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:rubberSmelted").setMaxStackSize(16);
		GameRegistry.registerItem(rubberSmelted, "rubberSmelted");
		
		lambRaw = new ItemFood(1, true).setUnlocalizedName("lambRaw").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:lambRaw").setMaxStackSize(64);
		GameRegistry.registerItem(lambRaw, "lambRaw");
		lambCooked = new ItemFood(4, true).setUnlocalizedName("lambCooked").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:lambCooked").setMaxStackSize(64);
		GameRegistry.registerItem(lambCooked, "lambCooked");
		
		
		stickIron = new Item().setUnlocalizedName("stickIron").setCreativeTab(SoluCraft.tabSoluCraft).setTextureName("solucraft:stickIron").setMaxStackSize(64);
		GameRegistry.registerItem(stickIron, "stickIron");
		

		glass = new smoking (smoking , 0, 0).setUnlocalizedName("glass").setCreativeTab(SoluCraft.tabSoluCraft);
		chest = new smoking (smoking , 0, 1).setUnlocalizedName("chest").setCreativeTab(SoluCraft.tabSoluCraft);
		legs = new smoking (smoking , 0, 2).setUnlocalizedName("legs").setCreativeTab(SoluCraft.tabSoluCraft);
		boots = new smoking (smoking , 0, 3).setUnlocalizedName("boots").setCreativeTab(SoluCraft.tabSoluCraft);
        GameRegistry.registerItem(chest , "Chest");
        GameRegistry.registerItem(legs , "legs");
        GameRegistry.registerItem(boots , "Boots");
        GameRegistry.registerItem(glass , "Glass");
        
		
		
	}	
}



