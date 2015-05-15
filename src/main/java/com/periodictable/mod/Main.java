package com.periodictable.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import com.periodictable.mod.CreativeTabs.periodicTabBasics;
import com.periodictable.mod.CreativeTabs.periodicTabItems;
import com.periodictable.mod.CreativeTabs.periodicTabMachines;
import com.periodictable.mod.CreativeTabs.periodicTabMaterials;
import com.periodictable.mod.handler.ElementsHandler;
import com.periodictable.mod.handler.GuiHandler;
import com.periodictable.mod.handler.InstrumentsHandler;
import com.periodictable.mod.handler.MachinesHandler;
import com.periodictable.mod.handler.metalsHandler;
import com.periodictable.mod.proxy.CommonProxy;

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

	@EventHandler
public void preInit(FMLPreInitializationEvent event){
		
		ElementsHandler.mainRegistry();
		InstrumentsHandler.mainRegistry();
		metalsHandler.mainRegistry();
		MachinesHandler.mainRegistry();
		
}
	@EventHandler
public void Init(FMLInitializationEvent event){
		//NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());
	proxy.registerRenders();
}
	@EventHandler
public void postInit(FMLPostInitializationEvent event){
	
}
}

