package com.periodictable.mod.CreativeTabs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class periodicTabBasics extends CreativeTabs{

	public periodicTabBasics(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Items.apple;
	}

}
