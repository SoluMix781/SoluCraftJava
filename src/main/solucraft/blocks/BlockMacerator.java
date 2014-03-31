package solucraft.blocks;

import java.util.Random;

import javax.swing.Icon;

import solucraft.SoluCraft;
import solucraft.items.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMacerator extends BlockContainer{

	private final Random maceratorRand = new Random();

	private final boolean isActive;

	private static boolean keepMaceratorInventory;
	@SideOnly(Side.CLIENT)
	private IIcon maceratorIconTop;
	
	public BlockMacerator(boolean isActive) {
		super(Material.rock);
		
		this.isActive = isActive;
	}
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon("solucraft" + ":" + "macerator_side");
		this.maceratorIconTop = iconRegister.registerIcon("solucraft" + ":" + (this.isActive ? "macerator_front_lit" : "macerator_front_idle"));
	}
	
	@SideOnly(Side.CLIENT)

	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	public IIcon getIcon(int par1, int par2)
	{
		return par1 == 1 ? this.blockIcon : (par1 == 0 ? this.blockIcon : (par1 != par2 ? this.blockIcon : this.maceratorIconTop));
	}
	
	/**
	 * Returns the ID of the items to drop on destruction.
	 */ 
	public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
		return Item.getItemFromBlock(ModBlock.blockMaceratorIdle);
    }

	/**
	 * Called whenever the block is added into the world. Args: world, x, y, z
	 */
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
	{
		super.onBlockAdded(par1World, par2, par3, par4);
		this.setDefaultDirection(par1World, par2, par3, par4);
	}

	/**
	 * set a blocks direction
	 */
	private void setDefaultDirection(World world, int par2, int par3, int par4)
	{
		if (!world.isRemote)
		{
			Block Block1 = world.getBlock(par2, par3, par4 - 1);
			Block Block2 = world.getBlock(par2, par3, par4 + 1);
			Block Block3 = world.getBlock(par2 - 1, par3, par4);
			Block Block4 = world.getBlock(par2 + 1, par3, par4);
			byte b0 = 3;

			if (Block1.func_149730_j()&& !Block2.func_149730_j())
			{
				b0 = 3;
			}

			if (Block2.func_149730_j() && !Block1.func_149730_j())
			{
				b0 = 2;
			}

			if (Block3.func_149730_j() && !Block4.func_149730_j())
			{
				b0 = 5;
			}

			if (Block4.func_149730_j() && !Block3.func_149730_j())
			{
				b0 = 4;
			}

			world.setBlockMetadataWithNotify(par2, par3, par4, b0, 2);
		}
	}

	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if(!world.isRemote) {
			FMLNetworkHandler.openGui(player, SoluCraft.instance, ModBlock.guiIdMacerator, world, x, y, z);
		}
		
		return true;
	}

	/**
	 * Update which block ID the furnace is using depending on whether or not it is burning
	 */
	public static void updateFurnaceBlockState(boolean par0, World world, int par2, int par3, int par4)
	{
		int l = world.getBlockMetadata(par2, par3, par4);
		TileEntity tileentity = world.getTileEntity(par2, par3, par4);
		keepMaceratorInventory = true;

		if (par0)
		{
			world.setBlock(par2, par3, par4, ModBlock.blockMaceratorActive);
		}
		else
		{
			world.setBlock(par2, par3, par4, ModBlock.blockMaceratorIdle);
		}

		keepMaceratorInventory = false;
		world.setBlockMetadataWithNotify(par2, par3, par4, l, 2);

		if (tileentity != null)
		{
			tileentity.validate();
			world.setTileEntity(par2, par3, par4, tileentity);
		}
	}

	/**
	 * Returns a new instance of a block's tile entity class. Called on placing the block.
	 */
	public TileEntity createNewTileEntity(World par1World, int i)
	{
		return new TileEntityMacerator();
	}

	/**
	 * Called when the block is placed in the world.
	 */
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLivingBase par5EntityLivingBase, ItemStack par6ItemStack)
	{
		int l = MathHelper.floor_double((double)(par5EntityLivingBase.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

		if (l == 0)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 2, 2);
		}

		if (l == 1)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 5, 2);
		}

		if (l == 2)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 3, 2);
		}

		if (l == 3)
		{
			par1World.setBlockMetadataWithNotify(par2, par3, par4, 4, 2);
		}

		if (par6ItemStack.hasDisplayName())
		{
			((TileEntityMacerator)par1World.getTileEntity(par2, par3, par4)).setGuiDisplayName(par6ItemStack.getDisplayName());
		}
	}

	/**
	 * ejects contained items into the world, and notifies neighbours of an update, as appropriate
	 */
	public void breakBlock(World par1World, int par2, int par3, int par4, Block oldBlock, int par6)
	{
		if (!keepMaceratorInventory)
		{
			TileEntityMacerator TileEntityMacerator = (TileEntityMacerator)par1World.getTileEntity(par2, par3, par4);

			if (TileEntityMacerator != null)
			{
				for (int j1 = 0; j1 < TileEntityMacerator.getSizeInventory(); ++j1)
				{
					ItemStack itemstack = TileEntityMacerator.getStackInSlot(j1);

					if (itemstack != null)
					{
						float f = this.maceratorRand.nextFloat() * 0.8F + 0.1F;
						float f1 = this.maceratorRand.nextFloat() * 0.8F + 0.1F;
						float f2 = this.maceratorRand.nextFloat() * 0.8F + 0.1F;

						while (itemstack.stackSize > 0)
						{
							int k1 = this.maceratorRand.nextInt(21) + 10;

							if (k1 > itemstack.stackSize)
							{
								k1 = itemstack.stackSize;
							}

							itemstack.stackSize -= k1;
							EntityItem entityitem = new EntityItem(par1World, (double)((float)par2 + f), (double)((float)par3 + f1), (double)((float)par4 + f2), new ItemStack(itemstack.getItem(), k1, itemstack.getItemDamage()));

							if (itemstack.hasTagCompound())
							{
								entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
							}

							float f3 = 0.05F;
							entityitem.motionX = (double)((float)this.maceratorRand.nextGaussian() * f3);
							entityitem.motionY = (double)((float)this.maceratorRand.nextGaussian() * f3 + 0.2F);
							entityitem.motionZ = (double)((float)this.maceratorRand.nextGaussian() * f3);
							par1World.spawnEntityInWorld(entityitem);
						}
					}
				}

				par1World.func_147453_f(par2, par3, par4, oldBlock);
			}
		}

		super.breakBlock(par1World, par2, par3, par4 , oldBlock, par6);
	}

	/**
	 * If this returns true, then comparators facing away from this block will use the value from
	 * getComparatorInputOverride instead of the actual redstone signal strength.
	 */
	public boolean hasComparatorInputOverride()
	{
		return true;
	}

	/**
	 * If hasComparatorInputOverride returns true, the return value from this is used instead of the redstone signal
	 * strength when this block inputs to a comparator.
	 */
	public int getComparatorInputOverride(World par1World, int par2, int par3, int par4, int par5)
	{
		return Container.calcRedstoneFromInventory((IInventory)par1World.getTileEntity(par2, par3, par4));
	}

	@SideOnly(Side.CLIENT)

	/**
	 * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
	 */
	public Block idPicked(World par1World, int par2, int par3, int par4)
	{
		return ModBlock.blockMaceratorIdle;
	}
	
}