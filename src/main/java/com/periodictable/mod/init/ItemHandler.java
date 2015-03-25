package com.periodictable.mod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.periodictable.mod.Reference;

public class ItemHandler {
	
	public static Item Hydrogen;
	public static Item Helium;
	public static Item Lithium;
	
	public static void init(){
		Hydrogen = new Item().setUnlocalizedName("Hydrogen");
		Helium = new Item().setUnlocalizedName("Helium");
		Lithium = new Item().setUnlocalizedName("Lithium");

	}
public static void register(){
	GameRegistry.registerItem(Hydrogen, Hydrogen.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Helium, Helium.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Lithium, Lithium.getUnlocalizedName().substring(5));
}
public static void registerRenders(){
	registerRender(Hydrogen);
	registerRender(Helium);
	registerRender(Lithium);
}
public static void registerRender(Item item){
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item	, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
}
}
