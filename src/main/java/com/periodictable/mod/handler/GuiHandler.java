package com.periodictable.mod.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

import com.periodictable.mod.Main;
import com.periodictable.mod.container.ContainerWorkSurface;
import com.periodictable.mod.gui.GuiBook;
import com.periodictable.mod.gui.GuiWorkSurface;
import com.periodictable.mod.items.help_book;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
	
	
		if(ID == Main.guiIDWorkSurface) {
			return ID == Main.guiIDWorkSurface && world.getBlock(x, y, z) == MachinesHandler.blockWorkSurface ? new ContainerWorkSurface(player.inventory, world, x, y, z) : null;
		}
		else
		return null;
		
		  
			
	

	}
	
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
	
		if(id == Main.guiIDWorkSurface) {
			return id == Main.guiIDWorkSurface && world.getBlock(x, y, z) == MachinesHandler.blockWorkSurface ? new GuiWorkSurface(player.inventory, world, x, y, z) : null;
		}
		
	
			 else
				
			  return null;
	}
	

}
