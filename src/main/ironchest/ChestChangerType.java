
package solucraft.ironchest;

import static solucraft.ironchest.IronChestType.*;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.registry.GameRegistry;

public enum ChestChangerType {
    IRONGOLD(IRON, GOLD, "ironGoldUpgrade", "Iron to Gold Chest Upgrade", "mmm", "msm", "mmm"),
    GOLDDIAMOND(GOLD, DIAMOND, "goldDiamondUpgrade", "Gold to Diamond Chest Upgrade", "GGG", "msm", "GGG"),
    DIAMONDCRYSTAL(DIAMOND, CRYSTAL, "diamondCrystalUpgrade", "Diamond to Crystal Chest Upgrade", "GGG", "GOG", "GGG"),
    WOODIRON(WOOD, IRON, "woodIronUpgrade", "Normal chest to Iron Chest Upgrade", "mmm", "msm", "mmm"),
    DIAMONDOBSIDIAN(DIAMOND, OBSIDIAN, "diamondObsidianUpgrade", "Diamond to Obsidian Chest Upgrade", "mmm", "mGm", "mmm");

    private IronChestType source;
    private IronChestType target;
    public String itemName;
    public String descriptiveName;
    private ItemChestChanger item;
    private String[] recipe;

    private ChestChangerType(IronChestType source, IronChestType target, String itemName, String descriptiveName, String... recipe)
    {
        this.source = source;
        this.target = target;
        this.itemName = itemName;
        this.descriptiveName = descriptiveName;
        this.recipe = recipe;
    }

    public boolean canUpgrade(IronChestType from)
    {
        return from == this.source;
    }

    public int getTarget()
    {
        return this.target.ordinal();
    }

    public ItemChestChanger buildItem(Configuration cfg)
    {
        item = new ItemChestChanger(this);
        GameRegistry.registerItem(item, itemName);
        return item;
    }

    public void addRecipes()
    {
        for (String sourceMat : source.getMatList())
        {
            for (String targetMat : target.getMatList())
            {
                Object targetMaterial = IronChestType.translateOreName(targetMat);
                Object sourceMaterial = IronChestType.translateOreName(sourceMat);
                IronChestType.addRecipe(new ItemStack(item), recipe, 'm', targetMaterial, 's', sourceMaterial, 'G', Blocks.glass, 'O', Blocks.obsidian);
            }
        }
    }

    public static void buildItems(Configuration cfg)
    {
        for (ChestChangerType type : values())
        {
            type.buildItem(cfg);
        }
    }

    public static void generateRecipes()
    {
        for (ChestChangerType item : values())
        {
            item.addRecipes();
        }
    }
}
