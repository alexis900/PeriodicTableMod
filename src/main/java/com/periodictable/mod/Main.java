package com.periodictable.mod;

import net.minecraft.item.Item;

import com.periodictable.mod.CreativeTabs.periodicTabBasics;
import com.periodictable.mod.CreativeTabs.periodicTabItems;
import com.periodictable.mod.CreativeTabs.periodicTabMachines;
import com.periodictable.mod.items.Elements;
import com.periodictable.mod.items.test_tube;
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
	public static Item Neon;
	public static Item Sodium;
	public static Item Magnesium;
	public static Item Aluminium;
	public static Item Silicon;
	public static Item Phosphorus;
	public static Item Sulfur;
	public static Item Chlorine;
	public static Item Argon;
	public static Item Potassium;
	public static Item Calcium;
	public static Item Scandium;
	public static Item Titanium;
	public static Item Vanadium;
	public static Item Chromium;
	public static Item Manganese;
	public static Item Iron;
	public static Item Cobalt;
	public static Item Nickel;
	public static Item Copper;
	public static Item Zinc;
	public static Item Gallium;
	public static Item Germanium;
	public static Item Arsenic;
	public static Item Selenium;
	public static Item Bromine;
	public static Item Krypton;
	public static Item Rubidium;
	public static Item Strontium;
	public static Item Yttrium;
	public static Item Zirconium;
	public static Item Niobium;
	public static Item Molybdenum;
	public static Item Technetium;
	public static Item Ruthenium;
	public static Item Rhodium;
	public static Item Palladium;
	public static Item Silver;
	public static Item Cadmium;
	public static Item Indium;
	public static Item Tin;
	public static Item Antimony;
	public static Item Tellurium;
	public static Item Iodine;
	public static Item Xenon;
	//en_US

	@EventHandler
public void preInit(FMLPreInitializationEvent event){
		//Instruments
		test_tube = new test_tube().setUnlocalizedName("test_tube");
		GameRegistry.registerItem(test_tube, "test_tube");
		//Elements
		Hydrogen = new Elements().setUnlocalizedName("Hydrogen");
		GameRegistry.registerItem(Hydrogen, "Hydrogen");
		Helium = new Elements().setUnlocalizedName("Helium");
		GameRegistry.registerItem(Helium, "Helium");
		Lithium = new Elements().setUnlocalizedName("Lithium");
		GameRegistry.registerItem(Lithium, "Lithium");
		Beryllium = new Elements().setUnlocalizedName("Beryllium");
		GameRegistry.registerItem(Beryllium, "Beryllium");
		Boron = new Elements().setUnlocalizedName("Boron");
		GameRegistry.registerItem(Boron, "Boron");
		Carbon = new Elements().setUnlocalizedName("Carbon");
		GameRegistry.registerItem(Carbon, "Carbon");
		Nitrogen = new Elements().setUnlocalizedName("Nitrogen");
		GameRegistry.registerItem(Nitrogen, "Nitrogen");
		Oxygen = new Elements().setUnlocalizedName("Oxygen");
		GameRegistry.registerItem(Oxygen, "Oxygen");
		Fluorine = new Elements().setUnlocalizedName("Fluorine");
		GameRegistry.registerItem(Fluorine, "Fluorine");
		Neon = new Elements().setUnlocalizedName("Neon");
		GameRegistry.registerItem(Neon, "Neon");
		Sodium = new Elements().setUnlocalizedName("Sodium");
		GameRegistry.registerItem(Sodium, "Sodium");
		Magnesium = new Elements().setUnlocalizedName("Magnesium");
		GameRegistry.registerItem(Magnesium, "Magnesium");
		Aluminium = new Elements().setUnlocalizedName("Aluminium");
		GameRegistry.registerItem(Aluminium, "Aluminium");
		Silicon = new Elements().setUnlocalizedName("Silicon");
		GameRegistry.registerItem(Silicon, "Silicon");
		Phosphorus = new Elements().setUnlocalizedName("Phosphorus");
		GameRegistry.registerItem(Phosphorus, "Phosphorus");
		Sulfur = new Elements().setUnlocalizedName("Sulfur");
		GameRegistry.registerItem(Sulfur, "Sulfur");
		Chlorine = new Elements().setUnlocalizedName("Chlorine");
		GameRegistry.registerItem(Chlorine, "Chlorine");
		Argon = new Elements().setUnlocalizedName("Argon");
		GameRegistry.registerItem(Argon, "Argon");
		Potassium = new Elements().setUnlocalizedName("Potassium");
		GameRegistry.registerItem(Potassium, "Potassium");
		Calcium = new Elements().setUnlocalizedName("Calcium");
		GameRegistry.registerItem(Calcium, "Calcium");
		Scandium = new Elements().setUnlocalizedName("Scandium");
		GameRegistry.registerItem(Scandium, "Scandium");
		Titanium = new Elements().setUnlocalizedName("Titanium");
		GameRegistry.registerItem(Titanium, "Titanium");
		Vanadium = new Elements().setUnlocalizedName("Vanadium");
		GameRegistry.registerItem(Vanadium, "Vanadium");
		Chromium = new Elements().setUnlocalizedName("Chromium");
		GameRegistry.registerItem(Chromium, "Chromium");
		Manganese = new Elements().setUnlocalizedName("Manganese");
		GameRegistry.registerItem(Manganese, "Manganese");
		Iron = new Elements().setUnlocalizedName("Iron");
		GameRegistry.registerItem(Iron, "Iron");
		Cobalt = new Elements().setUnlocalizedName("Cobalt");
		GameRegistry.registerItem(Cobalt, "Cobalt");
		Nickel = new Elements().setUnlocalizedName("Nickel");
		GameRegistry.registerItem(Nickel, "Nickel");
		Copper = new Elements().setUnlocalizedName("Copper");
		GameRegistry.registerItem(Copper, "Copper");
		Zinc = new Elements().setUnlocalizedName("Zinc");
		GameRegistry.registerItem(Zinc, "Zinc");
		Gallium = new Elements().setUnlocalizedName("Gallium");
		GameRegistry.registerItem(Gallium, "Gallium");
		Germanium = new Elements().setUnlocalizedName("Germanium");
		GameRegistry.registerItem(Germanium, "Germanium");
		Arsenic = new Elements().setUnlocalizedName("Arsenic");
		GameRegistry.registerItem(Arsenic, "Arsenic");
		Selenium = new Elements().setUnlocalizedName("Selenium");
		GameRegistry.registerItem(Selenium, "Selenium");
		Bromine = new Elements().setUnlocalizedName("Bromine");
		GameRegistry.registerItem(Bromine, "Bromine");
		Krypton = new Elements().setUnlocalizedName("Krypton");
		GameRegistry.registerItem(Krypton, "Krypton");
		Rubidium = new Elements().setUnlocalizedName("Rubidium");
		GameRegistry.registerItem(Rubidium, "Rubidium");
		Strontium = new Elements().setUnlocalizedName("Strontium");
		GameRegistry.registerItem(Strontium, "Strontium");
		Yttrium = new Elements().setUnlocalizedName("Yttrium");
		GameRegistry.registerItem(Yttrium, "Yttrium");
		Zirconium = new Elements().setUnlocalizedName("Zirconium");
		GameRegistry.registerItem(Zirconium, "Zirconium");
		Niobium = new Elements().setUnlocalizedName("Niobium");
		GameRegistry.registerItem(Niobium, "Niobium");
		Molybdenum = new Elements().setUnlocalizedName("Molybdenum");
		GameRegistry.registerItem(Molybdenum, "Molybdenum");
		Technetium = new Elements().setUnlocalizedName("Technetium");
		GameRegistry.registerItem(Technetium, "Technetium");
		Ruthenium = new Elements().setUnlocalizedName("Ruthenium");
		GameRegistry.registerItem(Ruthenium, "Ruthenium");
		Rhodium = new Elements().setUnlocalizedName("Rhodium");
		GameRegistry.registerItem(Rhodium, "Rhodium");
		Palladium = new Elements().setUnlocalizedName("Palladium");
		GameRegistry.registerItem(Palladium, "Palladium");
		Silver = new Elements().setUnlocalizedName("Silver");
		GameRegistry.registerItem(Silver, "Silver");
		Cadmium = new Elements().setUnlocalizedName("Cadmium");
		GameRegistry.registerItem(Cadmium, "Cadmium");
		Indium = new Elements().setUnlocalizedName("Indium");
		GameRegistry.registerItem(Indium, "Indium");
		Tin = new Elements().setUnlocalizedName("Tin");
		GameRegistry.registerItem(Tin, "Tin");
		Antimony = new Elements().setUnlocalizedName("Antimony");
		GameRegistry.registerItem(Antimony, "Antimony");
		Tellurium = new Elements().setUnlocalizedName("Tellurium");
		GameRegistry.registerItem(Tellurium, "Tellurium");
		Iodine = new Elements().setUnlocalizedName("Iodine");
		GameRegistry.registerItem(Iodine, "Iodine");
		Xenon = new Elements().setUnlocalizedName("Xenon");
		GameRegistry.registerItem(Xenon, "Xenon");
}
	@EventHandler
public void Init(FMLInitializationEvent event){
	proxy.registerRenders();
}
	@EventHandler
public void postInit(FMLPostInitializationEvent event){
	
}
}

