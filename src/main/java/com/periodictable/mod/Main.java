package com.periodictable.mod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.periodictable.mod.CreativeTabs.periodicTabBasics;
import com.periodictable.mod.init.ElementsHandler;
import com.periodictable.mod.init.MachinesHandler;
import com.periodictable.mod.proxy.CommonProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
	

public class Main {
	@SidedProxy(clientSide=Reference.CLIENT_PROXY, serverSide=Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	public static final periodicTabBasics tabPeriodicBasics = new periodicTabBasics("tabPeriodic");
	
	@EventHandler
public void preInit(FMLPreInitializationEvent event){
	ElementsHandler.init();
	ElementsHandler.register();
	MachinesHandler.init();
	MachinesHandler.register();
	
}
	@EventHandler
public void Init(FMLInitializationEvent event){
	proxy.registerRenders();
}
	@EventHandler
public void postInit(FMLPostInitializationEvent event){
	
}
}

