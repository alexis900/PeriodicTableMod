package com.periodictable.mod.items;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.periodictable.mod.Main;
import com.periodictable.mod.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class test_tube extends Item{
	public test_tube(){
		this.setCreativeTab(Main.tabPeriodicItems);
		 this.setTextureName(Reference.MOD_ID + ":test_tube");
	}

}
