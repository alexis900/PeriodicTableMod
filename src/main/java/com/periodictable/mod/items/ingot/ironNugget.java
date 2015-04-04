package com.periodictable.mod.items.ingot;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import com.periodictable.mod.Main;
import com.periodictable.mod.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ironNugget extends Item{
	public ironNugget(){
		this.setCreativeTab(Main.tabPeriodicMaterials);
		 this.setTextureName(Reference.MOD_ID + ":iron_nugget");
	}

}
