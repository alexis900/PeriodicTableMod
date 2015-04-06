package com.periodictable.mod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

import com.periodictable.mod.CreativeTabs.periodicTabBasics;
import com.periodictable.mod.CreativeTabs.periodicTabItems;
import com.periodictable.mod.CreativeTabs.periodicTabMachines;
import com.periodictable.mod.CreativeTabs.periodicTabMaterials;
import com.periodictable.mod.handler.ElementsHandler;
import com.periodictable.mod.handler.GuiHandler;
import com.periodictable.mod.handler.InstrumentsHandler;
import com.periodictable.mod.handler.MachinesHandler;
import com.periodictable.mod.handler.metalsHandler;
import com.periodictable.mod.items.help_book;
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
import com.sun.beans.decoder.ElementHandler;

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
	public static final periodicTabMaterials tabPeriodicMaterials = new periodicTabMaterials("tabPeriodicMaterials");
	public static final periodicTabMachines tabPeriodicMachines = new periodicTabMachines("tabPeriodicMachines");
	
	//Instruments
	public static final int guiIDHelpBook = 0;
	//Machines
	public static final int guiIDWorkSurface = 1;
	public static final int guiChest = 2;

	@EventHandler
public void preInit(FMLPreInitializationEvent event){
		
		ElementsHandler.mainRegistry();
		InstrumentsHandler.mainRegistry();
		metalsHandler.mainRegistry();
		MachinesHandler.mainRegistry();
		
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

