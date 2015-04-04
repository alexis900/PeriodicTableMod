package com.periodictable.mod.CreativeTabs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.periodictable.mod.handler.ElementsHandler;
import com.periodictable.mod.handler.metalsHandler;

public class periodicTabMaterials extends CreativeTabs{

	public periodicTabMaterials(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return metalsHandler.iron_nugget;
	}

}
