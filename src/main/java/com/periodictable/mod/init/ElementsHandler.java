package com.periodictable.mod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.periodictable.mod.Main;
import com.periodictable.mod.Reference;

public class ElementsHandler {
	
	public static Item Hydrogen;
	public static Item Helium;
	public static Item Lithium;
	public static Item Beryllium;
	public static Item Boron;
	public static Item Carbon;
	
	public static void init(){
		Hydrogen = new Item().setUnlocalizedName("Hydrogen").setCreativeTab(Main.tabPeriodicBasics);
		Helium = new Item().setUnlocalizedName("Helium").setCreativeTab(Main.tabPeriodicBasics);
		Lithium = new Item().setUnlocalizedName("Lithium").setCreativeTab(Main.tabPeriodicBasics);
		Beryllium = new Item().setUnlocalizedName("Beryllium").setCreativeTab(Main.tabPeriodicBasics);
		Boron = new Item().setUnlocalizedName("Boron").setCreativeTab(Main.tabPeriodicBasics);
		Carbon = new Item().setUnlocalizedName("Carbon").setCreativeTab(Main.tabPeriodicBasics);
	}
public static void register(){
	GameRegistry.registerItem(Hydrogen, Hydrogen.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Helium, Helium.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Lithium, Lithium.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Beryllium, Beryllium.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Boron, Boron.getUnlocalizedName().substring(5));
	GameRegistry.registerItem(Carbon, Carbon.getUnlocalizedName().substring(5));
}
public static void registerRenders(){
	registerRender(Hydrogen);
	registerRender(Helium);
	registerRender(Lithium);
	registerRender(Beryllium);
	registerRender(Boron);
	registerRender(Carbon);
}
public static void registerRender(Item item){
	Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item	, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5),"inventory"));
}
}
