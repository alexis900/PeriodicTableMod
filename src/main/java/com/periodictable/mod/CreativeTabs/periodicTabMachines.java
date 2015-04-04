package com.periodictable.mod.CreativeTabs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.periodictable.mod.handler.MachinesHandler;

public class periodicTabMachines extends CreativeTabs{

	public periodicTabMachines(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(MachinesHandler.blockWorkSurface);
	}

}
