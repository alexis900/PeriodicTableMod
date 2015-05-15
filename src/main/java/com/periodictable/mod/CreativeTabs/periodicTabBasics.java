package com.periodictable.mod.CreativeTabs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.periodictable.mod.handler.ElementsHandler;
import com.periodictable.mod.handler.NameHandler;

public class periodicTabBasics extends CreativeTabs{

	public periodicTabBasics(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return NameHandler.Hydrogen;
	}

}
