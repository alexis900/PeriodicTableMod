package com.periodictable.mod.blocks;

import com.periodictable.mod.Main;
import com.periodictable.mod.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class WorkSurface extends Block {

	@SideOnly(Side.CLIENT)
	private IIcon workSurfaceTop;
	private IIcon workSurfaceFront;
	
	public WorkSurface() {
		super(Material.iron);
		
		this.setHardness(3.5F);
		this.setResistance(5.0F);
		this.setCreativeTab(Main.tabPeriodicMachines);
		
	}
	
	@SideOnly(Side.CLIENT)
	public IIcon getIcon (int side, int metadata) {
		
		return side == 1 ? this.workSurfaceTop : (side == 0 ? Blocks.iron_block.getBlockTextureFromSide(side) : (side != 2 && side != 4 ? this.blockIcon : this.workSurfaceFront));
		
	}
	
	
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons (IIconRegister iconRegister) {
		this.blockIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + "WorkSurfaceSide");
		this.workSurfaceTop = iconRegister.registerIcon(Reference.MOD_ID + ":" + "WorkSurfaceTop");
		this.workSurfaceFront = iconRegister.registerIcon(Reference.MOD_ID + ":" + "WorkSurfaceFront");
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
