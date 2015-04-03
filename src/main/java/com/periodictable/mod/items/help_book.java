package com.periodictable.mod.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.periodictable.mod.Main;
import com.periodictable.mod.gui.GuiBook;

public class help_book extends Item
{
 

    public help_book()
    {
        this.setMaxStackSize(1);
        this.setCreativeTab(Main.tabPeriodicItems);
    }

   /* public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entity){
    	float var4 = 1.0F;
    	int i = (int)(entity.prevPosX + (entity.posX - entity.prevPosX) * (double)var4);
    	int j = (int)(entity.prevPosY + (entity.posY - entity.prevPosY) * (double)var4 + 1.62D - (double)entity.yOffset);
    	int k = (int)(entity.prevPosZ + (entity.posZ - entity.prevPosZ) * (double)var4);

    	if(true){
    	if(entity instanceof EntityPlayer)((EntityPlayer)entity).openGui(Main.instance, Main.guiIDHelpBook, world, i, j, k);
    	}

    	return itemstack;
    	}
    	public boolean onItemUse(ItemStack itemStack, EntityPlayer entity, World world, int i, int j, int k, int l, float a, float b, float c){
    	float var4 = 1.0F;

    	if(true){
    	if(entity instanceof EntityPlayer)((EntityPlayer)entity).openGui(Main.instance, Main.guiIDHelpBook, world, i, j, k);
    	}

    	return true;
    	}*/
}