package com.periodictable.mod.proxy;

import com.periodictable.mod.init.ElementsHandler;
import com.periodictable.mod.init.MachinesHandler;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		ElementsHandler.registerRenders();
		MachinesHandler.registerRenders();
	}
}
