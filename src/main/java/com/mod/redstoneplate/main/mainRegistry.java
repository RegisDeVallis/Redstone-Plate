package com.mod.redstoneplate.main;

import com.mod.redstoneplate.blocks.*;


import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
 
@Mod(modid = mainRegistry.MODID, version = mainRegistry.VERSION)
public class mainRegistry
{
    public static final String MODID = "redstoneplate";
    public static final String VERSION = "0.0.6";
    
    //my variables
    public static Block BlockRedstonePlate;
    public static Block BlockRspDWall;
    
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    	
    	blockRegistry.blockRegistry();
    	
    	//crafting registry
    	GameRegistry.addRecipe(new ItemStack(BlockRedstonePlate, 1), new Object[]{
        	"XYX",
        	"YZY",
        	"XYX",
        	'X', Items.iron_ingot , 'Y', Items.redstone , 'Z' , Blocks.stone_slab  });
    	
    	
    	
    	
    }
}