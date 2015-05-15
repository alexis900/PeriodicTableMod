package com.periodictable.mod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import com.periodictable.mod.Main;
import com.periodictable.mod.Reference;

public class WorkSurface extends Block {


	
	public WorkSurface() {
		super(Material.iron);
		
		this.setHardness(3.5F);
		this.setResistance(5.0F);
		this.setCreativeTab(Main.tabPeriodicMachines);
		
	}
	
	
	public boolean onBlockActivated (World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		
		if (!player.isSneaking()) {
			player.openGui(Main.instance, Main.guiIDWorkSurface, world, x, y, z);
			return true;
		}else{
			return false;
		}
	}
	

}
