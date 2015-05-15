package com.periodictable.mod.handler;

import com.periodictable.mod.items.elements.Aluminium;
import com.periodictable.mod.items.elements.Antimony;
import com.periodictable.mod.items.elements.Argon;
import com.periodictable.mod.items.elements.Arsenic;
import com.periodictable.mod.items.elements.Astatine;
import com.periodictable.mod.items.elements.Barium;
import com.periodictable.mod.items.elements.Beryllium;
import com.periodictable.mod.items.elements.Bismuth;
import com.periodictable.mod.items.elements.Boron;
import com.periodictable.mod.items.elements.Bromine;
import com.periodictable.mod.items.elements.Cadmium;
import com.periodictable.mod.items.elements.Caesium;
import com.periodictable.mod.items.elements.Calcium;
import com.periodictable.mod.items.elements.Carbon;
import com.periodictable.mod.items.elements.Chlorine;
import com.periodictable.mod.items.elements.Chromium;
import com.periodictable.mod.items.elements.Cobalt;
import com.periodictable.mod.items.elements.Copper;
import com.periodictable.mod.items.elements.Fluorine;
import com.periodictable.mod.items.elements.Francium;
import com.periodictable.mod.items.elements.Gallium;
import com.periodictable.mod.items.elements.Germanium;
import com.periodictable.mod.items.elements.Gold;
import com.periodictable.mod.items.elements.Helium;
import com.periodictable.mod.items.elements.Hydrogen;
import com.periodictable.mod.items.elements.Indium;
import com.periodictable.mod.items.elements.Iodine;
import com.periodictable.mod.items.elements.Iridium;
import com.periodictable.mod.items.elements.Iron;
import com.periodictable.mod.items.elements.Krypton;
import com.periodictable.mod.items.elements.Lead;
import com.periodictable.mod.items.elements.Lithium;
import com.periodictable.mod.items.elements.Lutetium;
import com.periodictable.mod.items.elements.Magnesium;
import com.periodictable.mod.items.elements.Manganese;
import com.periodictable.mod.items.elements.Mercury;
import com.periodictable.mod.items.elements.Molybdenum;
import com.periodictable.mod.items.elements.Neon;
import com.periodictable.mod.items.elements.Nickel;
import com.periodictable.mod.items.elements.Niobium;
import com.periodictable.mod.items.elements.Nitrogen;
import com.periodictable.mod.items.elements.Osmium;
import com.periodictable.mod.items.elements.Oxygen;
import com.periodictable.mod.items.elements.Palladium;
import com.periodictable.mod.items.elements.Phosphorus;
import com.periodictable.mod.items.elements.Platinum;
import com.periodictable.mod.items.elements.Polonium;
import com.periodictable.mod.items.elements.Potassium;
import com.periodictable.mod.items.elements.Radium;
import com.periodictable.mod.items.elements.Radon;
import com.periodictable.mod.items.elements.Rhenium;
import com.periodictable.mod.items.elements.Rhodium;
import com.periodictable.mod.items.elements.Rubidium;
import com.periodictable.mod.items.elements.Ruthenium;
import com.periodictable.mod.items.elements.Scandium;
import com.periodictable.mod.items.elements.Selenium;
import com.periodictable.mod.items.elements.Silicon;
import com.periodictable.mod.items.elements.Silver;
import com.periodictable.mod.items.elements.Sodium;
import com.periodictable.mod.items.elements.Strontium;
import com.periodictable.mod.items.elements.Sulfur;
import com.periodictable.mod.items.elements.Tantalum;
import com.periodictable.mod.items.elements.Technetium;
import com.periodictable.mod.items.elements.Tellurium;
import com.periodictable.mod.items.elements.Thallium;
import com.periodictable.mod.items.elements.Tin;
import com.periodictable.mod.items.elements.Titanium;
import com.periodictable.mod.items.elements.Tungsten;
import com.periodictable.mod.items.elements.Vanadium;
import com.periodictable.mod.items.elements.Xenon;
import com.periodictable.mod.items.elements.Yttrium;
import com.periodictable.mod.items.elements.Zinc;
import com.periodictable.mod.items.elements.Zirconium;

import net.minecraft.item.Item;

public class ElementsHandler {
	
	public static void mainRegistry(){
		initElement();
	}
	
	
	public static void initElement(){
		NameHandler.Hydrogen = new Hydrogen().setUnlocalizedName("Hydrogen");
		NameHandler.Helium = new Helium().setUnlocalizedName("Helium");
		NameHandler.Lithium = new Lithium().setUnlocalizedName("Lithium");
		NameHandler.Beryllium = new Beryllium().setUnlocalizedName("Beryllium");
		NameHandler.Boron = new Boron().setUnlocalizedName("Boron");
		NameHandler.Carbon = new Carbon().setUnlocalizedName("Carbon");
		NameHandler.Nitrogen = new Nitrogen().setUnlocalizedName("Nitrogen");
		NameHandler.Oxygen = new Oxygen().setUnlocalizedName("Oxygen");
		NameHandler.Fluorine = new Fluorine().setUnlocalizedName("Fluorine");
		NameHandler.Neon = new Neon().setUnlocalizedName("Neon");
		NameHandler.Sodium = new Sodium().setUnlocalizedName("Sodium");
		NameHandler.Magnesium = new Magnesium().setUnlocalizedName("Magnesium");
		NameHandler.Aluminium = new Aluminium().setUnlocalizedName("Aluminium");
		NameHandler.Silicon = new Silicon().setUnlocalizedName("Silicon");
		NameHandler.Phosphorus = new Phosphorus().setUnlocalizedName("Phosphorus");
		NameHandler.Sulfur = new Sulfur().setUnlocalizedName("Sulfur");
		NameHandler.Chlorine = new Chlorine().setUnlocalizedName("Chlorine");
		NameHandler.Argon = new Argon().setUnlocalizedName("Argon");
		NameHandler.Potassium = new Potassium().setUnlocalizedName("Potassium");
		NameHandler.Calcium = new Calcium().setUnlocalizedName("Calcium");
		NameHandler.Scandium = new Scandium().setUnlocalizedName("Scandium");
		NameHandler.Titanium = new Titanium().setUnlocalizedName("Titanium");
		NameHandler.Vanadium = new Vanadium().setUnlocalizedName("Vanadium");
		NameHandler.Chromium = new Chromium().setUnlocalizedName("Chromium");
		NameHandler.Manganese = new Manganese().setUnlocalizedName("Manganese");
		NameHandler.Iron = new Iron().setUnlocalizedName("Iron");
		NameHandler.Cobalt = new Cobalt().setUnlocalizedName("Cobalt");
		NameHandler.Nickel = new Nickel().setUnlocalizedName("Nickel");
		NameHandler.Copper = new Copper().setUnlocalizedName("Copper");
		NameHandler.Zinc = new Zinc().setUnlocalizedName("Zinc");
		NameHandler.Gallium = new Gallium().setUnlocalizedName("Gallium");
		NameHandler.Germanium = new Germanium().setUnlocalizedName("Germanium");
		NameHandler.Arsenic = new Arsenic().setUnlocalizedName("Arsenic");
		NameHandler.Selenium = new Selenium().setUnlocalizedName("Selenium");
		NameHandler.Bromine = new Bromine().setUnlocalizedName("Bromine");
		NameHandler.Krypton = new Krypton().setUnlocalizedName("Krypton");
		NameHandler.Rubidium = new Rubidium().setUnlocalizedName("Rubidium");
		NameHandler.Strontium = new Strontium().setUnlocalizedName("Strontium");
		NameHandler.Yttrium = new Yttrium().setUnlocalizedName("Yttrium");
		NameHandler.Zirconium = new Zirconium().setUnlocalizedName("Zirconium");
		NameHandler.Niobium = new Niobium().setUnlocalizedName("Niobium");
		NameHandler.Molybdenum = new Molybdenum().setUnlocalizedName("Molybdenum");
		NameHandler.Technetium = new Technetium().setUnlocalizedName("Technetium");
		NameHandler.Ruthenium = new Ruthenium().setUnlocalizedName("Ruthenium");
		NameHandler.Rhodium = new Rhodium().setUnlocalizedName("Rhodium");
		NameHandler.Palladium = new Palladium().setUnlocalizedName("Palladium");
		NameHandler.Silver = new Silver().setUnlocalizedName("Silver");
		NameHandler.Cadmium = new Cadmium().setUnlocalizedName("Cadmium");
		NameHandler.Indium = new Indium().setUnlocalizedName("Indium");
		NameHandler.Tin = new Tin().setUnlocalizedName("Tin");
		NameHandler.Antimony = new Antimony().setUnlocalizedName("Antimony");
		NameHandler.Tellurium = new Tellurium().setUnlocalizedName("Tellurium");
		NameHandler.Iodine = new Iodine().setUnlocalizedName("Iodine");
		NameHandler.Xenon = new Xenon().setUnlocalizedName("Xenon");
		NameHandler.Caesium = new Caesium().setUnlocalizedName("Caesium");
		NameHandler.Barium = new Barium().setUnlocalizedName("Barium");
		NameHandler.Lutetium = new Lutetium().setUnlocalizedName("Lutetium");
		NameHandler.Tantalum = new Tantalum().setUnlocalizedName("Tantalum");
		NameHandler.Tungsten = new Tungsten().setUnlocalizedName("Tungsten");
		NameHandler.Rhenium = new Rhenium().setUnlocalizedName("Rhenium");
		NameHandler.Osmium = new Osmium().setUnlocalizedName("Osmium");
		NameHandler.Iridium = new Iridium().setUnlocalizedName("Iridium");
		NameHandler.Platinum = new Platinum().setUnlocalizedName("Platinum");
		NameHandler.Gold = new Gold().setUnlocalizedName("Gold");
		NameHandler.Mercury = new Mercury().setUnlocalizedName("Mercury");
		NameHandler.Thallium = new Thallium().setUnlocalizedName("Thallium");
		NameHandler.Lead = new Lead().setUnlocalizedName("Lead");
		NameHandler.Bismuth = new Bismuth().setUnlocalizedName("Bismuth");
		NameHandler.Polonium = new Polonium().setUnlocalizedName("Polonium");
		NameHandler.Astatine = new Astatine().setUnlocalizedName("Astatine");
		NameHandler.Radon = new Radon().setUnlocalizedName("Radon");
		NameHandler.Francium = new Francium().setUnlocalizedName("Francium");
		NameHandler.Radium = new Radium().setUnlocalizedName("Radium");
	}
	

}
