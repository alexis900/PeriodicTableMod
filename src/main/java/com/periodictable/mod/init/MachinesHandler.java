package com.periodictable.mod.init;

import com.periodictable.mod.Reference;
import com.periodictable.mod.blocks.periodic_table_chest;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class MachinesHandler {
	
	public static Block periodic_table_chest;
	
	public static void init(){
	periodic_table_chest = new periodic_table_chest(Material.barrier).setUnlocalizedName("periodic_table_chest");
	}
	public static void register(){
		GameRegistry.registerBlock(periodic_table_chest, periodic_table_chest.getUnlocalizedName().substring(5));
	}
	public static void registerRenders(){
		registerRender(periodic_table_chest);
	}
	public static void registerRender(Block block){
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item	, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
	}
}
