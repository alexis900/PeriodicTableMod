package com.periodictable.mod.container;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;



public class GuiContainerBook extends Container {

        public GuiContainerBook (EntityPlayer player){
        }

        public GuiContainerBook(InventoryPlayer inventory, World world, int x,
				int y, int z) {
		}

		@Override
        public boolean canInteractWith(EntityPlayer player) {
                return true;
        }


      
}


