package solucraft.lib;

import java.util.Random;

import net.minecraft.world.World;

public class WorldGen {
    // WORLDGEN DEFAULT SETTINGS
    public static boolean WORLDGEN_RUBY_DEFAULT = true;
    public static boolean WORLDGEN_GREENSAPPHIRE_DEFAULT = true;
    public static boolean WORLDGEN_SAPPHIRE_DEFAULT = true;
    public static boolean WORLDGEN_TIN_DEFAULT = true;
    public static boolean WORLDGEN_COPPER_DEFAULT = true;
    public static boolean WORLDGEN_SILVER_DEFAULT = true;
    public static boolean WORLDGEN_NIKOLITE_DEFAULT = true;
    public static boolean WORLDGEN_TUNGSTEN_DEFAULT = true;
    public static boolean WORLDGEN_MARBLE_DEFAULT = true;
    public static boolean WORLDGEN_BASALT_DEFAULT = true;

    // WORLDGEN USED SETTINGS
    public static boolean WORLDGEN_RUBY;
    public static boolean WORLDGEN_GREENSAPPHIRE;
    public static boolean WORLDGEN_SAPPHIRE;
    public static boolean WORLDGEN_TIN;
    public static boolean WORLDGEN_COPPER;
    public static boolean WORLDGEN_SILVER;
    public static boolean WORLDGEN_NIKOLITE;
    public static boolean WORLDGEN_TUNGSTEN;
    public static boolean WORLDGEN_MARBLE;
    public static boolean WORLDGEN_BASALT;
	public void generate(World world, Random random, int posX, int posY,
			int posZ) {
	}
}