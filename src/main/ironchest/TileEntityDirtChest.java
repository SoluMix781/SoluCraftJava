package solucraft.ironchest;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.util.StatCollector;

public class TileEntityDirtChest extends TileEntityIronChest {

    static {

        NBTTagList pages = new NBTTagList();
        pages.appendTag(new NBTTagString(StatCollector.translateToLocal("book.ironchest:dirtchest9000.page1")));
        pages.appendTag(new NBTTagString(StatCollector.translateToLocal("book.ironchest:dirtchest9000.page2")));
        pages.appendTag(new NBTTagString(StatCollector.translateToLocal("book.ironchest:dirtchest9000.page3")));
        pages.appendTag(new NBTTagString(StatCollector.translateToLocal("book.ironchest:dirtchest9000.page4")));
        pages.appendTag(new NBTTagString(StatCollector.translateToLocal("book.ironchest:dirtchest9000.page5")));

    }
    public TileEntityDirtChest() {
        super(IronChestType.DIRTCHEST9000);
    }

    @Override
    public void wasPlaced(EntityLivingBase entityliving, ItemStack itemStack)
    {
        if (!(itemStack.hasTagCompound() && itemStack.getTagCompound().getBoolean("dirtchest"))) {

        }
    }

    @Override
    public void removeAdornments()
    {
        if (chestContents[0] != null) {
            chestContents[0] = null;
        }
    }
}
