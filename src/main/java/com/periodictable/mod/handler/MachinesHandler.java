package com.periodictable.mod.handler;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import com.periodictable.mod.blocks.WorkSurface;

import cpw.mods.fml.common.registry.GameRegistry;

public class MachinesHandler {
	public static void mainRegistry(){
		initElement();
	}
	public static Block blockWorkSurface;
	
	
	public static void initElement(){
		blockWorkSurface = new WorkSurface().setBlockName("WorkSurface");
		GameRegistry.registerBlock(blockWorkSurface, "WorkSurface");
	
	}

}
