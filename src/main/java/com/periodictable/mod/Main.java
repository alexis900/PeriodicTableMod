package com.periodictable.mod;

import net.minecraft.item.Item;

import com.periodictable.mod.CreativeTabs.periodicTabBasics;
import com.periodictable.mod.CreativeTabs.periodicTabItems;
import com.periodictable.mod.CreativeTabs.periodicTabMachines;
import com.periodictable.mod.items.test_tube;
import com.periodictable.mod.items.elements.Hydrogen;
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

	@EventHandler
public void preInit(FMLPreInitializationEvent event){
		//Instruments
		test_tube = new test_tube().setUnlocalizedName("test_tube");
		GameRegistry.registerItem(test_tube, "test_tube");
		//Elements
		Hydrogen = new Hydrogen().setUnlocalizedName("Hydrogen");
		GameRegistry.registerItem(Hydrogen, "Hydrogen");
		/*Helium = new Item().setUnlocalizedName("Helium");
		GameRegistry.registerItem(Helium, "Helium");
		Lithium = new Item().setUnlocalizedName("Lithium");
		Beryllium = new Item().setUnlocalizedName("Beryllium");
		Boron = new Item().setUnlocalizedName("Boron");
		Carbon = new Item().setUnlocalizedName("Carbon");*/
}
	@EventHandler
public void Init(FMLInitializationEvent event){
	proxy.registerRenders();
}
	@EventHandler
public void postInit(FMLPostInitializationEvent event){
	
}
}

