package com.periodictable.mod.handler;

import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.periodictable.mod.blocks.WorkSurface;

public class MachinesHandler {
	public static void mainRegistry(){
		initElement();
	}
	public static Block blockWorkSurface;
	
	
	public static void initElement(){
		blockWorkSurface = new WorkSurface().setUnlocalizedName("WorkSurface");
		GameRegistry.registerBlock(blockWorkSurface, "WorkSurface");
	
	}

}
