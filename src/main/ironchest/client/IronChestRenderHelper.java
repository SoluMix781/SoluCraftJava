
package solucraft.ironchest.client;

import java.util.Map;

import solucraft.SoluCraft;
import solucraft.ironchest.IronChestType;
import solucraft.ironchest.TileEntityIronChest;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.TileEntityRendererChestHelper;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;

import com.google.common.collect.Maps;

public class IronChestRenderHelper extends TileEntityRendererChestHelper {
    private Map<Integer, TileEntityIronChest> itemRenders = Maps.newHashMap();

    public IronChestRenderHelper()
    {
        for (IronChestType typ : IronChestType.values())
        {
            itemRenders.put(typ.ordinal(), (TileEntityIronChest) SoluCraft.ironChestBlock.createTileEntity(null, typ.ordinal()));
        }
    }

    @Override
    public void renderChest(Block block, int i, float f)
    {
        if (block == SoluCraft.ironChestBlock)
        {
            TileEntityRendererDispatcher.instance.renderTileEntityAt(itemRenders.get(i), 0.0D, 0.0D, 0.0D, 0.0F);
        }
        else
        {
            super.renderChest(block, i, f);
        }
    }
}
