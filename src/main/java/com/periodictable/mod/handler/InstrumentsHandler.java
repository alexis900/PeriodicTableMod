package com.periodictable.mod.handler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.periodictable.mod.items.help_book;
import com.periodictable.mod.items.test_tube;

import cpw.mods.fml.common.registry.GameRegistry;

public class InstrumentsHandler {
	public static void mainRegistry(){
		initElement();
	}
	public static Item test_tube;
	public static Item help_book;
	
	public static void initElement(){
		test_tube = new test_tube().setUnlocalizedName("test_tube");
		GameRegistry.registerItem(test_tube, "test_tube");
		help_book = new help_book().setUnlocalizedName("help_book");
		GameRegistry.registerItem(help_book, "help_book");
	}

}
