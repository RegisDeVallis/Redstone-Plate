package com.mod.redstoneplate.crafting;

import com.mod.redstoneplate.blocks.blockRegistry;
import com.mod.redstoneplate.main.mainRegistry;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class craftingRegistry {
	
	public static void craftingRegistry() {
		
		
		GameRegistry.addRecipe(new ItemStack(blockRegistry.BlockRedstonePlate, 1), new Object[]{
        	"XYX",
        	"YZY",
        	"XYX",
        	'X', Items.iron_ingot , 'Y', Items.redstone , 'Z' , Blocks.stone_slab  });
	}

}
