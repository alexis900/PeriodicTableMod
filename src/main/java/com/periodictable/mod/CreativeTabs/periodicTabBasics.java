package com.periodictable.mod.CreativeTabs;

import com.periodictable.mod.init.ElementsHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class periodicTabBasics extends CreativeTabs{

	public periodicTabBasics(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ElementsHandler.Hydrogen;
	}

}
