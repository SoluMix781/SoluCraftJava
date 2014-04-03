package solucraft;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import solucraft.lib.*;
import solucraft.proxy.*;
import solucraft.recipes.*;
import solucraft.blocks.*;
import solucraft.entity.SEntity;
import solucraft.events.MobDrop;
import solucraft.items.*;
import solucraft.world.WorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

//MOD
@Mod(name = Reference.MOD_NAME, version = Reference.MOD_VERSION, modid = Reference.MOD_ID)

public class SoluCraft {
 
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
    }
   
 
}


