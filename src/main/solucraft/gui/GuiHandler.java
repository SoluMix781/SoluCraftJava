
	package solucraft.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import solucraft.SoluCraft;
import solucraft.blocks.ModBlock;
import solucraft.blocks.TileEntityMacerator;
import solucraft.container.ContainerMacerator;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.NetworkRegistry;

	public class GuiHandler implements IGuiHandler {
		public GuiHandler() {
		}

		@Override
		public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			TileEntity entity = world.getTileEntity(x, y, z);

			if(entity != null){
				switch (id) {
					case ModBlock.guiIdMacerator:
						if (entity instanceof TileEntityMacerator) {
							return new ContainerMacerator(player.inventory, (TileEntityMacerator) entity);
						} 
						
						return null;
					default:
						return null;
				}
			}
			
			return null;
		}

		@Override
		public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
			TileEntity entity = world.getTileEntity(x, y, z);

			if(entity != null){
				switch (id) {
					case ModBlock.guiIdMacerator:
						if (entity instanceof TileEntityMacerator) {
							return new GuiMacerator(player.inventory, (TileEntityMacerator) entity);
						} 
						
						return null;
					default:
						return null;
				}
			}

			return null;
		}	
		
		

	}
