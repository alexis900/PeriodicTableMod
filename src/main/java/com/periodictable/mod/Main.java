package com.periodictable.mod;

import net.minecraft.item.Item;

import com.periodictable.mod.CreativeTabs.periodicTabBasics;
import com.periodictable.mod.CreativeTabs.periodicTabItems;
import com.periodictable.mod.CreativeTabs.periodicTabMachines;
import com.periodictable.mod.items.test_tube;
import com.periodictable.mod.items.elements.Beryllium;
import com.periodictable.mod.items.elements.Boron;
import com.periodictable.mod.items.elements.Carbon;
import com.periodictable.mod.items.elements.Fluorine;
import com.periodictable.mod.items.elements.Hydrogen;
import com.periodictable.mod.items.elements.Lithium;
import com.periodictable.mod.items.elements.Nitrogen;
import com.periodictable.mod.items.elements.Oxygen;
import com.periodictable.mod.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
	

public class Main {
	@SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide=Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	//CreativeTabs
	public static final periodicTabItems tabPeriodicItems = new periodicTabItems("tabPeriodicItems");
	public static final periodicTabBasics tabPeriodicBasics = new periodicTabBasics("tabPeriodicElements");
	public static final periodicTabMachines tabPeriodicMachines = new periodicTabMachines("tabPeriodicMachines");
	
	
	
	//Instruments
	public static Item test_tube;
	//Elements
	public static Item Hydrogen;
	public static Item Helium;
	public static Item Lithium;
	public static Item Beryllium;
	public static Item Boron;
	public static Item Carbon;
	public static Item Nitrogen;
	public static Item Oxygen;
	public static Item Fluorine;

	@EventHandler
public void preInit(FMLPreInitializationEvent event){
		//Instruments
		test_tube = new test_tube().setUnlocalizedName("test_tube");
		GameRegistry.registerItem(test_tube, "test_tube");
		//Elements
		Hydrogen = new Hydrogen().setUnlocalizedName("Hydrogen");
		GameRegistry.registerItem(Hydrogen, "Hydrogen");
		Helium = new Hydrogen().setUnlocalizedName("Helium");
		GameRegistry.registerItem(Helium, "Helium");
		Lithium = new Lithium().setUnlocalizedName("Lithium");
		GameRegistry.registerItem(Lithium, "Lithium");
		Beryllium = new Beryllium().setUnlocalizedName("Beryllium");
		GameRegistry.registerItem(Beryllium, "Beryllium");
		Boron = new Boron().setUnlocalizedName("Boron");
		GameRegistry.registerItem(Boron, "Boron");
		Carbon = new Carbon().setUnlocalizedName("Carbon");
		GameRegistry.registerItem(Carbon, "Carbon");
		Nitrogen = new Nitrogen().setUnlocalizedName("Nitrogen");
		GameRegistry.registerItem(Nitrogen, "Nitrogen");
		Oxygen = new Oxygen().setUnlocalizedName("Oxygen");
		GameRegistry.registerItem(Oxygen, "Oxygen");
		Fluorine = new Fluorine().setUnlocalizedName("Fluorine");
		GameRegistry.registerItem(Fluorine, "Fluorine");
}
	@EventHandler
public void Init(FMLInitializationEvent event){
	proxy.registerRenders();
}
	@EventHandler
public void postInit(FMLPostInitializationEvent event){
	
}
}

