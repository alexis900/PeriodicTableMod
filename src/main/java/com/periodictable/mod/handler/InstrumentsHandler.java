package com.periodictable.mod.handler;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.periodictable.mod.items.help_book;
import com.periodictable.mod.items.test_tube;

public class InstrumentsHandler {
	public static void mainRegistry(){
		initElement();
	}
	public static Item test_tube;
	public static Item help_book;
	
	public static void initElement(){
		test_tube = new test_tube().setUnlocalizedName("test_tube");
		help_book = new help_book().setUnlocalizedName("help_book");
	}

}
