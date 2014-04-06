package solucraft;

import org.apache.logging.log4j.Level;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import solucraft.lib.*;
import solucraft.proxy.*;
import solucraft.recipes.*;
import solucraft.blocks.*;
import solucraft.entity.SEntity;
import solucraft.events.MobDrop;
import solucraft.ironchest.BlockIronChest;
import solucraft.ironchest.ChestChangerType;
import solucraft.ironchest.IronChestType;
import solucraft.ironchest.ItemIronChest;
import solucraft.ironchest.OcelotsSitOnChestsHandler;
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
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

//MOD
@Mod(name = Reference.MOD_NAME, version = Reference.MOD_VERSION, modid = Reference.MOD_ID)


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
	

	@Instance(Reference.MOD_ID)
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
       if (OCELOTS_SITONCHESTS)
        {
            MinecraftForge.EVENT_BUS.register(new OcelotsSitOnChestsHandler());
       }
        MinecraftForge.EVENT_BUS.register(this);
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
     Configuration cfg = new Configuration(event.getSuggestedConfigurationFile());
     try
     {
         cfg.load();
         ChestChangerType.buildItems(cfg);
         CACHE_RENDER = cfg.get(Configuration.CATEGORY_GENERAL, "cacheRenderingInformation", true).getBoolean(true);
         OCELOTS_SITONCHESTS = cfg.get(Configuration.CATEGORY_GENERAL, "ocelotsSitOnChests", true).getBoolean(true);
     }
     catch (Exception e)
     {
         FMLLog.log(Level.ERROR, e, "IronChest has a problem loading it's configuration");
     }
     finally
     {
         if (cfg.hasChanged())
             cfg.save();
     }
     ironChestBlock = new BlockIronChest();
     GameRegistry.registerBlock(ironChestBlock, ItemIronChest.class, "BlockIronChest");
     PacketHandler.INSTANCE.ordinal();
    }
   
 
}



