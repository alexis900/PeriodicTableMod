package com.periodictable.mod.items.elements;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.periodictable.mod.Main;
import com.periodictable.mod.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Carbon extends Item{
	public Carbon(){
		this.setCreativeTab(Main.tabPeriodicBasics);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}

}
