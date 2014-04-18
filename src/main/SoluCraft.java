package solucraft;

import java.util.ArrayList;

import org.apache.logging.log4j.Level;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;
import solucraft.lib.*;
import solucraft.network.PacketManager;
import solucraft.proxy.*;
import solucraft.recipes.*;
import solucraft.blocks.*;
import solucraft.common.CommandShow;
import solucraft.common.CreativeTabCamo;
import solucraft.common.MaterialFakeAir;
import solucraft.entity.SEntity;
import solucraft.events.MobDrop;
import solucraft.ironchest.BlockIronChest;
import solucraft.ironchest.ChestChangerType;
import solucraft.ironchest.IronChestType;
import solucraft.ironchest.ItemIronChest;
import solucraft.ironchest.PacketHandler;
import solucraft.ironchest.Version;
import solucraft.items.*;
import solucraft.world.WorldGenerator;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.event.FMLServerStoppingEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

//MOD
@Mod(name = Reference.MOD_NAME, version = Reference.MOD_VERSION, modid = Reference.MODID)


public class SoluCraft {

	public static BlockIronChest ironChestBlock;
    @Instance("IronChest")
    public static boolean CACHE_RENDER = true;
    public static boolean OCELOTS_SITONCHESTS = true;
 
	//creativetabs
	public static CreativeTabs tabSoluCraft = new CreativeTabs("SoluCraft"){
		public Item getTabIconItem() {
			return Item.getItemFromBlock(ModBlocks.blockBasalt);
		}	
	};
	
	public static CreativeTabs tabSoluCraftItems = new CreativeTabs("SoluCraftItems"){
		public Item getTabIconItem() {
			return ModItems.glass;
		}	
	};
	

	@Instance(Reference.MODID)
	public static SoluCraft instance;

	//Proxy
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	
    public static CommonProxy proxy;

	@EventHandler
	public void Load(FMLInitializationEvent evt){
		for (IronChestType typ : IronChestType.values())
        {
            GameRegistry.registerTileEntityWithAlternatives(typ.clazz, "IronChest."+typ.name(), typ.name());
            proxy.registerTileEntitySpecialRenderer(typ);
        }
        IronChestType.registerBlocksAndRecipes(ironChestBlock);
        ChestChangerType.generateRecipes();
        NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
        proxy.registerRenderInformation();
     
        MinecraftForge.EVENT_BUS.register(this);
        
PacketManager.init();
        
        // key Events
        proxy.loadKeyStuff();
        
        // ore dictionary
        OreDictionary.registerOre(Reference.CAMO_PASTE, ModItems.camoPaste);

        // Renders
        proxy.loadRenderStuff();

        addrecipes();
	}
	
	@EventHandler
    public void registerCommand(FMLServerStartingEvent e)
    {
        e.registerServerCommand(new CommandShow());
    }

    @EventHandler
    public void registerCommand(FMLServerStoppingEvent e)
    {
        proxy.onServerStop(e);
    }

    public static void addrecipes()
    {
       
    }
	 @EventHandler
	    public void preLoad(FMLPreInitializationEvent e)
	    {
	        // Tile Entities
	        GameRegistry.registerTileEntity(TileEntityCamo.class, "TE_CamoFull");
	        GameRegistry.registerTileEntity(TileEntityCamoChest.class, "TE_CamoChest");
	        GameRegistry.registerTileEntity(TileEntityCamoDetector.class, "TE_CamoDetector");
	    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    ModBlocks.init();
    ModItems.init();
    crafting.init();
    smelting.init();
    GameRegistry.registerWorldGenerator(WorldGenerator.instance, 0);
	MinecraftForge.EVENT_BUS.register(new MobDrop());
	int RenderArmor = proxy.addArmor("smoking");
	SEntity.init();
	proxy.registerRenderThings(); 
	
	
	 Version.init(event.getVersionProperties());
     event.getModMetadata().version = Version.fullVersionString();

    
     ironChestBlock = new BlockIronChest();
     GameRegistry.registerBlock(ironChestBlock, ItemIronChest.class, "BlockIronChest");
     PacketHandler.INSTANCE.ordinal();
    }
   
 
}



