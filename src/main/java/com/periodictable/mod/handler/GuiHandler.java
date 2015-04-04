package com.periodictable.mod.handler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

import com.periodictable.mod.Main;
import com.periodictable.mod.container.ContainerWorkSurface;
import com.periodictable.mod.gui.GuiBook;
import com.periodictable.mod.gui.GuiWorkSurface;
import com.periodictable.mod.items.help_book;

import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler {

	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
	
		
		if(ID == Main.guiIDWorkSurface) {
			return ID == Main.guiIDWorkSurface && world.getBlock(x, y, z) == MachinesHandler.blockWorkSurface ? new ContainerWorkSurface(player.inventory, world, x, y, z) : null;
		}if(ID == Main.guiIDHelpBook)
			return new GuiBook(player.inventory, (help_book)player.inventory.getCurrentItem().getItem());
		 else
		
		return null;
		
		  
			
	

	}
	
	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world,	int x, int y, int z) {
		TileEntity entity = world.getTileEntity(x, y, z);
		
	
		if(id == Main.guiIDWorkSurface) {
			return id == Main.guiIDWorkSurface && world.getBlock(x, y, z) == MachinesHandler.blockWorkSurface ? new GuiWorkSurface(player.inventory, world, x, y, z) : null;
		}
		
		
		if(id == Main.guiIDHelpBook)
			return new GuiBook(player.inventory, (help_book)player.inventory.getCurrentItem().getItem());
			 else
			  return null;
	}
	

}
