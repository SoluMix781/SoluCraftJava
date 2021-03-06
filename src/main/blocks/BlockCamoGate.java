package solucraft.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;
import solucraft.SoluCraft;
import solucraft.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockCamoGate extends BlockCamoFull
{
    private static final int MAX_SIZE = 10;

    public BlockCamoGate()
    {
        super();
        setHardness(1.5F);
        setStepSound(Block.soundTypeWood);
    }

    @Override
    public void breakBlock(World world, int i, int j, int k, Block block, int metadata)
    {
        destroyGate(world, i, j, k);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        blockIcon = par1IconRegister.registerIcon(Reference.TEXTURE_BLOCK_GATE);
    }

    @Override
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block)
    {
        boolean powerred = world.isBlockIndirectlyGettingPowered(x, y, z) || world.isBlockIndirectlyGettingPowered(x, y + 1, z);
        int meta = world.getBlockMetadata(x, y, z);
        int direction = meta & 7;
        boolean oldState = (world.getBlockMetadata(x, y, z) & 8) > 1;

        if (powerred && !oldState)
        {
            world.scheduleBlockUpdate(x, y, z, this, 1);
            world.setBlockMetadataWithNotify(x, y, z, direction + 8, 4);
        }
        else if (!powerred && oldState)
        {
            world.scheduleBlockUpdate(x, y, z, this, 1);
            world.setBlockMetadataWithNotify(x, y, z, direction, 4);
        }
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack)
    {
        int metadata = setDefaultDirection(world, x, y, z, (EntityPlayer) entity);
        world.setBlockMetadataWithNotify(x, y, z, metadata, 2);
    }

    private static int setDefaultDirection(World world, int i, int j, int k, EntityPlayer entityplayer)
    {
        int l = MathHelper.floor_double(entityplayer.rotationYaw * 4F / 360F + 0.5D) & 3;
        double d = entityplayer.posY + 1.82D - entityplayer.yOffset;

        if (MathHelper.abs((float) entityplayer.posX - i) < 2.0F && MathHelper.abs((float) entityplayer.posZ - k) < 2.0F)
        {
            if (d - j > 2D)
                return 1;

            if (j - d > 0.0D)
                return 0;
        }

        if (l == 0)
            return 2;

        if (l == 1)
            return 5;

        if (l == 2)
            return 3;

        if (l == 3)
            return 4;
        else
            return 0;
    }

    @Override
    public void updateTick(World world, int i, int j, int k, Random random)
    {
        if (world.isRemote)
            return;

        boolean flag = world.isBlockIndirectlyGettingPowered(i, j, k) || world.isBlockIndirectlyGettingPowered(i, j + 1, k);

        if (flag)
        {
            buildGate(world, i, j, k);
        }
        else
        {
            destroyGate(world, i, j, k);
        }
    }

    public void buildGate(World world, int x, int y, int z)
    {
        int data = world.getBlockMetadata(x, y, z) & 7;
        boolean stop = false;
        ForgeDirection dir = ForgeDirection.getOrientation(data);
        int xOffset, yOffset, zOffset, addX, addY, addZ;

        for (int i = 1; i <= MAX_SIZE && stop == false; i++)
        {
            addX = dir.offsetX * i;
            addY = dir.offsetY * i;
            addZ = dir.offsetZ * i;
            xOffset = x + addX;
            yOffset = y + addY;
            zOffset = z + addZ;

            if (!world.isSideSolid(xOffset, yOffset, zOffset, dir.getOpposite()))
            {
                world.setBlockToAir(xOffset, yOffset, zOffset);
                world.setBlock(xOffset, yOffset, zOffset, ModBlocks.camoGateExt);
            }
            else
            {
                stop = true;
            }
        }
    }

    public void destroyGate(World world, int x, int y, int z)
    {
        int data = world.getBlockMetadata(x, y, z) & 7;
        ForgeDirection dir = ForgeDirection.getOrientation(data);
        int xOffset, yOffset, zOffset;

        for (int i = 1; i <= MAX_SIZE; i++)
        {
            xOffset = x + dir.offsetX * i;
            yOffset = y + dir.offsetY * i;
            zOffset = z + dir.offsetZ * i;

            if (world.getBlock(xOffset, yOffset, zOffset) == ModBlocks.camoGateExt)
            {
                world.setBlockToAir(xOffset, yOffset, zOffset);
            }
        }
    }
}
