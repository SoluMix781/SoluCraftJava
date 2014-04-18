package solucraft.common;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import solucraft.SoluCraft;
import solucraft.items.ModItems;
import solucraft.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class CreativeTabCamo extends CreativeTabs
{
	public CreativeTabCamo()
	{
		super(Reference.MODID);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public Item getTabIconItem()
	{
		return ModItems.camoPaste;
	}

}
