package com.periodictable.mod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.periodictable.mod.Main;
import com.periodictable.mod.Reference;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class Elements extends Item{
	public Elements(){
		this.setCreativeTab(Main.tabPeriodicBasics);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister iconRegister){
		this.itemIcon = iconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(5));
	}


}
