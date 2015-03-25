package com.periodictable.mod.proxy;

import com.periodictable.mod.init.ItemHandler;

public class ClientProxy extends CommonProxy{
	@Override
	public void registerRenders(){
		ItemHandler.registerRenders();
		
	}
}
