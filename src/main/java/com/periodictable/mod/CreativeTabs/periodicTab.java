package com.periodictable.mod.CreativeTabs;

import com.periodictable.mod.init.ItemHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class periodicTab extends CreativeTabs{

	public periodicTab(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ItemHandler.Hydrogen;
	}

}
