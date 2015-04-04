package com.periodictable.mod.CreativeTabs;


import com.periodictable.mod.Main;
import com.periodictable.mod.handler.InstrumentsHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class periodicTabItems extends CreativeTabs{

	public periodicTabItems(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return InstrumentsHandler.test_tube;
	}

}
