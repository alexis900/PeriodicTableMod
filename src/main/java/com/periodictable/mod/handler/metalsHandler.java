package com.periodictable.mod.handler;

import net.minecraft.item.Item;

import com.periodictable.mod.items.ingot.ironNugget;
import com.periodictable.mod.items.ingot.tinNugget;

import cpw.mods.fml.common.registry.GameRegistry;

public class metalsHandler {
	
	public static void mainRegistry(){
		initIngot();
		Register();
		}
	
	public static Item iron_nugget;
	public static Item tin_nugget;
	
	public static void initIngot(){
		iron_nugget = new ironNugget().setUnlocalizedName("iron_nugget");
		tin_nugget = new tinNugget().setUnlocalizedName("tin_nugget");
}
	public static void Register(){
		GameRegistry.registerItem(iron_nugget, "iron_nugget");
		GameRegistry.registerItem(tin_nugget, "tin_nugget");
	}
}

