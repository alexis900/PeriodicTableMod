package com.periodictable.mod.proxy;

import com.periodictable.mod.init.ElementsHandler;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		ElementsHandler.registerRenders();
		
	}
}
