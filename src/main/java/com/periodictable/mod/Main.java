package com.periodictable.mod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.periodictable.mod.CreativeTabs.periodicTabBasics;
import com.periodictable.mod.CreativeTabs.periodicTabItems;
import com.periodictable.mod.CreativeTabs.periodicTabMachines;
import com.periodictable.mod.blocks.WorkSurface;
import com.periodictable.mod.handler.GuiHandler;
import com.periodictable.mod.items.test_tube;
import com.periodictable.mod.items.elements.Aluminium;
import com.periodictable.mod.items.elements.Antimony;
import com.periodictable.mod.items.elements.Argon;
import com.periodictable.mod.items.elements.Arsenic;
import com.periodictable.mod.items.elements.Astatine;
import com.periodictable.mod.items.elements.Barium;
import com.periodictable.mod.items.elements.Beryllium;
import com.periodictable.mod.items.elements.Bismuth;
import com.periodictable.mod.items.elements.Boron;
import com.periodictable.mod.items.elements.Bromine;
import com.periodictable.mod.items.elements.Cadmium;
import com.periodictable.mod.items.elements.Caesium;
import com.periodictable.mod.items.elements.Calcium;
import com.periodictable.mod.items.elements.Carbon;
import com.periodictable.mod.items.elements.Chlorine;
import com.periodictable.mod.items.elements.Chromium;
import com.periodictable.mod.items.elements.Cobalt;
import com.periodictable.mod.items.elements.Copper;
import com.periodictable.mod.items.elements.Fluorine;
import com.periodictable.mod.items.elements.Francium;
import com.periodictable.mod.items.elements.Gallium;
import com.periodictable.mod.items.elements.Germanium;
import com.periodictable.mod.items.elements.Gold;
import com.periodictable.mod.items.elements.Helium;
import com.periodictable.mod.items.elements.Hydrogen;
import com.periodictable.mod.items.elements.Indium;
import com.periodictable.mod.items.elements.Iodine;
import com.periodictable.mod.items.elements.Iridium;
import com.periodictable.mod.items.elements.Iron;
import com.periodictable.mod.items.elements.Krypton;
import com.periodictable.mod.items.elements.Lead;
import com.periodictable.mod.items.elements.Lithium;
import com.periodictable.mod.items.elements.Lutetium;
import com.periodictable.mod.items.elements.Magnesium;
import com.periodictable.mod.items.elements.Manganese;
import com.periodictable.mod.items.elements.Mercury;
import com.periodictable.mod.items.elements.Molybdenum;
import com.periodictable.mod.items.elements.Neon;
import com.periodictable.mod.items.elements.Nickel;
import com.periodictable.mod.items.elements.Niobium;
import com.periodictable.mod.items.elements.Nitrogen;
import com.periodictable.mod.items.elements.Osmium;
import com.periodictable.mod.items.elements.Oxygen;
import com.periodictable.mod.items.elements.Palladium;
import com.periodictable.mod.items.elements.Phosphorus;
import com.periodictable.mod.items.elements.Platinum;
import com.periodictable.mod.items.elements.Polonium;
import com.periodictable.mod.items.elements.Potassium;
import com.periodictable.mod.items.elements.Radium;
import com.periodictable.mod.items.elements.Radon;
import com.periodictable.mod.items.elements.Rhenium;
import com.periodictable.mod.items.elements.Rhodium;
import com.periodictable.mod.items.elements.Rubidium;
import com.periodictable.mod.items.elements.Ruthenium;
import com.periodictable.mod.items.elements.Scandium;
import com.periodictable.mod.items.elements.Selenium;
import com.periodictable.mod.items.elements.Silicon;
import com.periodictable.mod.items.elements.Silver;
import com.periodictable.mod.items.elements.Sodium;
import com.periodictable.mod.items.elements.Strontium;
import com.periodictable.mod.items.elements.Sulfur;
import com.periodictable.mod.items.elements.Tantalum;
import com.periodictable.mod.items.elements.Technetium;
import com.periodictable.mod.items.elements.Tellurium;
import com.periodictable.mod.items.elements.Thallium;
import com.periodictable.mod.items.elements.Tin;
import com.periodictable.mod.items.elements.Titanium;
import com.periodictable.mod.items.elements.Tungsten;
import com.periodictable.mod.items.elements.Vanadium;
import com.periodictable.mod.items.elements.Xenon;
import com.periodictable.mod.items.elements.Yttrium;
import com.periodictable.mod.items.elements.Zinc;
import com.periodictable.mod.items.elements.Zirconium;
import com.periodictable.mod.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
	

public class Main {
	@SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide=Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@Instance(Reference.MOD_ID)
	public static Main instance;
	
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
	public static Item Caesium;
	public static Item Barium;
	public static Item Lutetium;
	public static Item Tantalum;
	public static Item Tungsten;
	public static Item Rhenium;
	public static Item Osmium;
	public static Item Iridium;
	public static Item Platinum;
	public static Item Gold;
	public static Item Mercury;
	public static Item Thallium;
	public static Item Lead;
	public static Item Bismuth;
	public static Item Polonium;
	public static Item Astatine;
	public static Item Radon;
	public static Item Francium;
	public static Item Radium;
	
	//Machines
	public static Block blockWorkSurface;
	public static final int guiIDWorkSurface = 1;

	@EventHandler
public void preInit(FMLPreInitializationEvent event){
		//Instruments
		test_tube = new test_tube().setUnlocalizedName("test_tube");
		GameRegistry.registerItem(test_tube, "test_tube");
		//Elements
		Hydrogen = new Hydrogen().setUnlocalizedName("Hydrogen");
		GameRegistry.registerItem(Hydrogen, "Hydrogen");
		Helium = new Helium().setUnlocalizedName("Helium");
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
		Neon = new Neon().setUnlocalizedName("Neon");
		GameRegistry.registerItem(Neon, "Neon");
		Sodium = new Sodium().setUnlocalizedName("Sodium");
		GameRegistry.registerItem(Sodium, "Sodium");
		Magnesium = new Magnesium().setUnlocalizedName("Magnesium");
		GameRegistry.registerItem(Magnesium, "Magnesium");
		Aluminium = new Aluminium().setUnlocalizedName("Aluminium");
		GameRegistry.registerItem(Aluminium, "Aluminium");
		Silicon = new Silicon().setUnlocalizedName("Silicon");
		GameRegistry.registerItem(Silicon, "Silicon");
		Phosphorus = new Phosphorus().setUnlocalizedName("Phosphorus");
		GameRegistry.registerItem(Phosphorus, "Phosphorus");
		Sulfur = new Sulfur().setUnlocalizedName("Sulfur");
		GameRegistry.registerItem(Sulfur, "Sulfur");
		Chlorine = new Chlorine().setUnlocalizedName("Chlorine");
		GameRegistry.registerItem(Chlorine, "Chlorine");
		Argon = new Argon().setUnlocalizedName("Argon");
		GameRegistry.registerItem(Argon, "Argon");
		Potassium = new Potassium().setUnlocalizedName("Potassium");
		GameRegistry.registerItem(Potassium, "Potassium");
		Calcium = new Calcium().setUnlocalizedName("Calcium");
		GameRegistry.registerItem(Calcium, "Calcium");
		Scandium = new Scandium().setUnlocalizedName("Scandium");
		GameRegistry.registerItem(Scandium, "Scandium");
		Titanium = new Titanium().setUnlocalizedName("Titanium");
		GameRegistry.registerItem(Titanium, "Titanium");
		Vanadium = new Vanadium().setUnlocalizedName("Vanadium");
		GameRegistry.registerItem(Vanadium, "Vanadium");
		Chromium = new Chromium().setUnlocalizedName("Chromium");
		GameRegistry.registerItem(Chromium, "Chromium");
		Manganese = new Manganese().setUnlocalizedName("Manganese");
		GameRegistry.registerItem(Manganese, "Manganese");
		Iron = new Iron().setUnlocalizedName("Iron");
		GameRegistry.registerItem(Iron, "Iron");
		Cobalt = new Cobalt().setUnlocalizedName("Cobalt");
		GameRegistry.registerItem(Cobalt, "Cobalt");
		Nickel = new Nickel().setUnlocalizedName("Nickel");
		GameRegistry.registerItem(Nickel, "Nickel");
		Copper = new Copper().setUnlocalizedName("Copper");
		GameRegistry.registerItem(Copper, "Copper");
		Zinc = new Zinc().setUnlocalizedName("Zinc");
		GameRegistry.registerItem(Zinc, "Zinc");
		Gallium = new Gallium().setUnlocalizedName("Gallium");
		GameRegistry.registerItem(Gallium, "Gallium");
		Germanium = new Germanium().setUnlocalizedName("Germanium");
		GameRegistry.registerItem(Germanium, "Germanium");
		Arsenic = new Arsenic().setUnlocalizedName("Arsenic");
		GameRegistry.registerItem(Arsenic, "Arsenic");
		Selenium = new Selenium().setUnlocalizedName("Selenium");
		GameRegistry.registerItem(Selenium, "Selenium");
		Bromine = new Bromine().setUnlocalizedName("Bromine");
		GameRegistry.registerItem(Bromine, "Bromine");
		Krypton = new Krypton().setUnlocalizedName("Krypton");
		GameRegistry.registerItem(Krypton, "Krypton");
		Rubidium = new Rubidium().setUnlocalizedName("Rubidium");
		GameRegistry.registerItem(Rubidium, "Rubidium");
		Strontium = new Strontium().setUnlocalizedName("Strontium");
		GameRegistry.registerItem(Strontium, "Strontium");
		Yttrium = new Yttrium().setUnlocalizedName("Yttrium");
		GameRegistry.registerItem(Yttrium, "Yttrium");
		Zirconium = new Zirconium().setUnlocalizedName("Zirconium");
		GameRegistry.registerItem(Zirconium, "Zirconium");
		Niobium = new Niobium().setUnlocalizedName("Niobium");
		GameRegistry.registerItem(Niobium, "Niobium");
		Molybdenum = new Molybdenum().setUnlocalizedName("Molybdenum");
		GameRegistry.registerItem(Molybdenum, "Molybdenum");
		Technetium = new Technetium().setUnlocalizedName("Technetium");
		GameRegistry.registerItem(Technetium, "Technetium");
		Ruthenium = new Ruthenium().setUnlocalizedName("Ruthenium");
		GameRegistry.registerItem(Ruthenium, "Ruthenium");
		Rhodium = new Rhodium().setUnlocalizedName("Rhodium");
		GameRegistry.registerItem(Rhodium, "Rhodium");
		Palladium = new Palladium().setUnlocalizedName("Palladium");
		GameRegistry.registerItem(Palladium, "Palladium");
		Silver = new Silver().setUnlocalizedName("Silver");
		GameRegistry.registerItem(Silver, "Silver");
		Cadmium = new Cadmium().setUnlocalizedName("Cadmium");
		GameRegistry.registerItem(Cadmium, "Cadmium");
		Indium = new Indium().setUnlocalizedName("Indium");
		GameRegistry.registerItem(Indium, "Indium");
		Tin = new Tin().setUnlocalizedName("Tin");
		GameRegistry.registerItem(Tin, "Tin");
		Antimony = new Antimony().setUnlocalizedName("Antimony");
		GameRegistry.registerItem(Antimony, "Antimony");
		Tellurium = new Tellurium().setUnlocalizedName("Tellurium");
		GameRegistry.registerItem(Tellurium, "Tellurium");
		Iodine = new Iodine().setUnlocalizedName("Iodine");
		GameRegistry.registerItem(Iodine, "Iodine");
		Xenon = new Xenon().setUnlocalizedName("Xenon");
		GameRegistry.registerItem(Xenon, "Xenon");
		Caesium = new Caesium().setUnlocalizedName("Caesium");
		GameRegistry.registerItem(Caesium, "Caesium");
		Barium = new Barium().setUnlocalizedName("Barium");
		GameRegistry.registerItem(Barium, "Barium");
		Lutetium = new Lutetium().setUnlocalizedName("Lutetium");
		GameRegistry.registerItem(Lutetium, "Lutetium");
		Tantalum = new Tantalum().setUnlocalizedName("Tantalum");
		GameRegistry.registerItem(Tantalum, "Tantalum");
		Tungsten = new Tungsten().setUnlocalizedName("Tungsten");
		GameRegistry.registerItem(Tungsten, "Tungsten");
		Rhenium = new Rhenium().setUnlocalizedName("Rhenium");
		GameRegistry.registerItem(Rhenium, "Rhenium");
		Osmium = new Osmium().setUnlocalizedName("Osmium");
		GameRegistry.registerItem(Osmium, "Osmium");
		Iridium = new Iridium().setUnlocalizedName("Iridium");
		GameRegistry.registerItem(Iridium, "Iridium");
		Platinum = new Platinum().setUnlocalizedName("Platinum");
		GameRegistry.registerItem(Platinum, "Platinum");
		Gold = new Gold().setUnlocalizedName("Gold");
		GameRegistry.registerItem(Gold, "Gold");
		Mercury = new Mercury().setUnlocalizedName("Mercury");
		GameRegistry.registerItem(Mercury, "Mercury");
		Thallium = new Thallium().setUnlocalizedName("Thallium");
		GameRegistry.registerItem(Thallium, "Thallium");
		Lead = new Lead().setUnlocalizedName("Lead");
		GameRegistry.registerItem(Lead, "Lead");
		Bismuth = new Bismuth().setUnlocalizedName("Bismuth");
		GameRegistry.registerItem(Bismuth, "Bismuth");
		Polonium = new Polonium().setUnlocalizedName("Polonium");
		GameRegistry.registerItem(Polonium, "Polonium");
		Astatine = new Astatine().setUnlocalizedName("Astatine");
		GameRegistry.registerItem(Astatine, "Astatine");
		Radon = new Radon().setUnlocalizedName("Radon");
		GameRegistry.registerItem(Radon, "Radon");
		Francium = new Francium().setUnlocalizedName("Francium");
		GameRegistry.registerItem(Francium, "Francium");
		Radium = new Radium().setUnlocalizedName("Radium");
		GameRegistry.registerItem(Radium, "Radium");
		
		//Machines
		blockWorkSurface = new WorkSurface().setBlockName("WorkSurface");
		GameRegistry.registerBlock(blockWorkSurface, "WorkSurface");
}
	@EventHandler
public void Init(FMLInitializationEvent event){
		NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
	proxy.registerRenders();
}
	@EventHandler
public void postInit(FMLPostInitializationEvent event){
	
}
}

