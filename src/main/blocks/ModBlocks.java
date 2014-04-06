package solucraft.blocks;

import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import solucraft.SoluCraft;
import solucraft.lib.Metadata;
import solucraft.lib.Module;
import solucraft.lib.Reference;
import solucraft.lib.Strings;
import solucraft.world.WorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class ModBlocks {
	public static WorldGenerator worldgen = new WorldGenerator();
	public static Block
	// Ores
			oreSapphire,
			oreGreenSapphire,
			oreRuby,
			oreCopper,
			oreTin,
			oreSilver,
			oreNikolite,
			oreTungsten,
			// block storage
			blockStorageSapphire,
			blockStorageGreenSapphire,
			blockStorageRuby,
			blockStorageCopper,
			blockStorageTin,
			blockStorageSilver,
			blockStorageNikolite,
			blockStorageTungsten,
			// Marble and Basalt
			blockMarble,
			blockBasalt,
			blockMarbleBrick,
			blockBasaltCobble,
			blockBasaltBrick,
			blockBasaltChiseled,
			blockBasaltPaver,
			// Lamp
			blockLampNormal,
			blockLampNormalActive,
			blockLampInverted,
			blockLampInvertedActive,
			// slabs
			slabDia, slabIron, slabGold, slabRuby, slabSapp,
			slabGreen,
			slabEmerald, slabLapis, slabMarble, slabMarbleBrick,
			slabBasalt,
			slabBasaltBrick,
			slabBasaltChiseled,
			slabBasaltPaver,
			slabWool,
			slabGlow,
			// stairs
			stairDia, stairsGold, stairsIron, stairsRuby,
			stairsSapp,
			stairsGreen, stairsEmerald, stairsLapis,
			stairsMarble,
			stairsMarbleBrick, stairsBasalt,
			stairsBasaltBrick,
			stairsBasaltChiseled, stairsBasaltPaver, stairsWool, stairsGlow, stairsClay,
			stairsSand;

	// Lamps
	public static ItemStack blockLampWhite, blockLampOrange, blockLampMagenta,
			blockLampLBlue, blockLampYellow, blockLampLime, blockLampPink,
			blockLampGray, blockLampLGray, blockLampCyan, blockLampPurple,
			blockLampBlue, blockLampBrown, blockLampGreen, blockLampRed,
			blockLampBlack, blockLampInvertedWhite, blockLampInvertedOrange,
			blockLampInvertedMagenta, blockLampInvertedLBlue,
			blockLampInvertedYellow, blockLampInvertedLime,
			blockLampInvertedPink, blockLampInvertedGray,
			blockLampInvertedLGray, blockLampInvertedCyan,
			blockLampInvertedPurple, blockLampInvertedBlue,
			blockLampInvertedBrown, blockLampInvertedGreen,
			blockLampInvertedRed, blockLampInvertedBlack;
	public static final int guiIdMacerator = 8;

	public static void init() {

		// Ores
		oreSapphire = new oreSapphire().setBlockName("oreSapphire")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:oreSapphire");
		GameRegistry.registerBlock(oreSapphire, "oreSapphire");
		oreGreenSapphire = new oreGreenSapphire()
				.setBlockName("oreGreenSapphire")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:oreGreenSapphire");
		GameRegistry.registerBlock(oreGreenSapphire, "oreGreenSapphire");
		oreRuby = new oreRuby().setBlockName("oreRuby")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:oreRuby");
		GameRegistry.registerBlock(oreRuby, "oreRuby");
		oreNikolite = new oreNikolite().setBlockName("oreNikolite")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:oreNikolite");
		GameRegistry.registerBlock(oreNikolite, "oreNikolite");
		oreTungsten = new oreTungsten().setBlockName("oreTungsten")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:oreTungsten");
		GameRegistry.registerBlock(oreTungsten, "oreTungsten");
		oreTin = new oreTin().setBlockName("oreTin")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:oreTin");
		GameRegistry.registerBlock(oreTin, "oreTin");
		oreSilver = new oreSilver().setBlockName("oreSilver")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:oreSilver");
		GameRegistry.registerBlock(oreSilver, "oreSilver");
		oreCopper = new oreCopper().setBlockName("oreCopper")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:oreCopper");
		GameRegistry.registerBlock(oreCopper, "oreCopper");

		// storage
		blockStorageSapphire = new blockStorageSapphire()
				.setBlockName("blockStorageSapphire")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockStorageSapphire");
		GameRegistry
				.registerBlock(blockStorageSapphire, "blockStorageSapphire");
		blockStorageGreenSapphire = new blockStorageGreenSapphire()
				.setBlockName("blockStorageGreenSapphire")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockStorageGreenSapphire");
		GameRegistry.registerBlock(blockStorageGreenSapphire,
				"blockStorageGreenSapphire");
		blockStorageRuby = new blockStorageRuby()
				.setBlockName("blockStorageRuby")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockStorageRuby");
		GameRegistry.registerBlock(blockStorageRuby, "blockStorageRuby");
		blockStorageNikolite = new blockStorageNikolite()
				.setBlockName("blockStorageNikolite")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockStorageNikolite");
		GameRegistry
				.registerBlock(blockStorageNikolite, "blockStorageNikolite");
		blockStorageTungsten = new blockStorageTungsten()
				.setBlockName("blockStorageTungsten")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockStorageTungsten");
		GameRegistry
				.registerBlock(blockStorageTungsten, "blockStorageTungsten");
		blockStorageTin = new blockStorageTin().setBlockName("blockStorageTin")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockStorageTin");
		GameRegistry.registerBlock(blockStorageTin, "blockStorageTin");
		blockStorageSilver = new blockStorageSilver()
				.setBlockName("blockStorageSilver")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockStorageSilver");
		GameRegistry.registerBlock(blockStorageSilver, "blockStorageSilver");
		blockStorageCopper = new blockStorageCopper()
				.setBlockName("blockStorageCopper")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockStorageCopper");
		GameRegistry.registerBlock(blockStorageCopper, "blockStorageCopper");

		// Basalt and Marble
		blockMarble = new blockMarble().setBlockName("blockMarble")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockMarble");
		GameRegistry.registerBlock(blockMarble, "blockMarble");
		blockBasalt = new blockBasalt().setBlockName("blockBasalt")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockBasalt");
		GameRegistry.registerBlock(blockBasalt, "blockBasalt");
		blockMarbleBrick = new blockMarbleBrick()
				.setBlockName("blockMarbleBrick")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockMarbleBrick");
		GameRegistry.registerBlock(blockMarbleBrick, "blockMarbleBrick");
		blockBasaltCobble = new blockBassaltCobble()
				.setBlockName("blockBasaltCobble")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockBasaltCobble");
		GameRegistry.registerBlock(blockBasaltCobble, "blockBasaltCobble");
		blockBasaltPaver = new blockBasaltPaver()
				.setBlockName("blockBasaltPaver")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockBasaltPaver");
		GameRegistry.registerBlock(blockBasaltPaver, "blockBasaltPaver");
		blockBasaltChiseled = new blockBasaltChiseled()
				.setBlockName("blockBasaltChiseled")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockBasaltChiseled");
		GameRegistry.registerBlock(blockBasaltChiseled, "blockBasaltChiseled");
		blockBasaltBrick = new blockBasaltBrick()
				.setBlockName("blockBasaltBrick")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockBasaltBrick");
		GameRegistry.registerBlock(blockBasaltBrick, "blockBasaltBrick");
		// SLABS
		slabDia = new slab(false).setBlockName("slabDia")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("minecraft:diamond_block");
		GameRegistry.registerBlock(slabDia, "slabDia");
		slabIron = new slab(false).setBlockName("slabIron")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("minecraft:iron_block");
		GameRegistry.registerBlock(slabIron, "slabIron");
		slabGold = new slab(false).setBlockName("slabGold")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("minecraft:gold_block");
		GameRegistry.registerBlock(slabGold, "slabGold");
		slabRuby = new slab(false).setBlockName("slabRuby")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockStorageRuby");
		GameRegistry.registerBlock(slabRuby, "slabRuby");
		slabSapp = new slab(false).setBlockName("slabSapp")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockStorageSapphire");
		GameRegistry.registerBlock(slabSapp, "slabSapp");
		slabGreen = new slab(false).setBlockName("slabGreen")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockStorageGreenSapphire");
		GameRegistry.registerBlock(slabGreen, "slabGreen");

		slabEmerald = new slab(false).setBlockName("slabEmerald")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("minecraft:emerald_block");
		GameRegistry.registerBlock(slabEmerald, "slabEmerald");

		slabLapis = new slab(false).setBlockName("slabLapis")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("minecraft:lapis_block");
		GameRegistry.registerBlock(slabLapis, "slabLapis");

		slabMarble = new slab(false).setBlockName("slabMarble")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockMarble")
				.setBlockTextureName("solucraft:blockMarble");
		GameRegistry.registerBlock(slabMarble, "slabMarble");

		slabMarbleBrick = new slab(false).setBlockName("slabMarbleBrick")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockMarbleBrick");
		GameRegistry.registerBlock(slabMarbleBrick, "slabMarbleBrick");

		slabBasalt = new slab(false).setBlockName("slabBasalt")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockBasalt");
		GameRegistry.registerBlock(slabBasalt, "slabBasalt");

		slabBasaltBrick = new slab(false).setBlockName("slabBasaltBrick")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockBasaltBrick");
		GameRegistry.registerBlock(slabBasaltBrick, "slabBasaltBrick");

		slabBasaltPaver = new slab(false).setBlockName("slabBasaltPaver")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockBasaltPaver");
		GameRegistry.registerBlock(slabBasaltPaver, "slabBasaltPaver");

		slabBasaltChiseled = new slab(false).setBlockName("slabBasaltChiseled")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("solucraft:blockBasaltChiseled");
		GameRegistry.registerBlock(slabBasaltChiseled, "slabBasaltChiseled");
		
		slabGlow = new slab(false).setBlockName("slabGlow")
				.setCreativeTab(SoluCraft.tabSoluCraft)
				.setBlockTextureName("minecraft:glowstone");
		GameRegistry.registerBlock(slabGlow, "slabGlow");
		
		// stairs
		stairDia = new stairs(Blocks.diamond_block).setBlockName("stairDia")
				.setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairDia, "stairDia");

		stairsGold = new stairs(Blocks.gold_block).setBlockName("stairsGold")
				.setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsGold, "stairsGold");

		stairsIron = new stairs(Blocks.iron_block).setBlockName("stairsIron")
				.setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsIron, "stairsIron");

		stairsRuby = new stairs(blockStorageRuby).setBlockName("stairsRuby")
				.setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsRuby, "stairsRuby");

		stairsSapp = new stairs(blockStorageSapphire)
				.setBlockName("stairsSapp").setCreativeTab(
						SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsSapp, "stairsSapp");

		stairsGreen = new stairs(blockStorageGreenSapphire).setBlockName(
				"stairsGreen").setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsGreen, "stairsGreen");

		stairsEmerald = new stairs(Blocks.emerald_block).setBlockName(
				"stairsEmerald").setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsEmerald, "stairsEmerald");

		stairsLapis = new stairs(Blocks.lapis_block)
				.setBlockName("stairsLapis").setCreativeTab(
						SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsLapis, "stairsLapis");

		stairsMarble = new stairs(blockMarble).setBlockName("stairsMarble")
				.setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsMarble, "stairsMarble");

		stairsMarbleBrick = new stairs(blockBasaltBrick).setBlockName(
				"stairsMarbleBrick").setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsMarbleBrick, "stairsMarbleBrick");

		stairsBasalt = new stairs(blockBasalt).setBlockName("stairsBasalt")
				.setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsBasalt, "stairsBasalt");

		stairsBasaltBrick = new stairs(blockBasaltBrick).setBlockName(
				"stairsBasaltBrick").setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsBasaltBrick, "stairsBasaltBrick");

		stairsBasaltPaver = new stairs(blockBasaltPaver).setBlockName(
				"stairsBasaltPaver").setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsBasaltPaver, "stairsBasaltPaver");

		stairsBasaltChiseled = new stairs(blockBasaltChiseled).setBlockName(
				"stairsBasaltChiseled").setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry
				.registerBlock(stairsBasaltChiseled, "stairsBasaltChiseled");

		stairsGlow = new stairs(Blocks.glowstone).setBlockName("stairsGlow")
				.setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsGlow, "stairsGlow");
		
		stairsClay = new stairs(Blocks.clay).setBlockName("stairsClay")
				.setCreativeTab(SoluCraft.tabSoluCraft);
		GameRegistry.registerBlock(stairsClay, "stairsClay");
		
		

	}

	public static void registerBlock(Block block, String name) {
		GameRegistry.registerBlock(block, block.getUnlocalizedName());
		LanguageRegistry.addName(block, name);
	}

	public static void registerItem(Item item, String name) {
		GameRegistry.registerItem(item, item.getUnlocalizedName());
		LanguageRegistry.addName(item, name);
	}

}
