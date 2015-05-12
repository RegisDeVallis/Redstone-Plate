package com.mod.redstoneplate.main;

import net.minecraft.world.WorldType;

import com.mod.redstoneplate.biome.WorldTypeRedstonePlate;
import com.mod.redstoneplate.blocks.blockRegistry;
import com.mod.redstoneplate.crafting.craftingRegistry;
import com.mod.redstoneplate.demension.dimensionRegistry;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
 
@Mod(modid = mainRegistry.MODID, version = mainRegistry.VERSION)
public class mainRegistry
{
    public static final String MODID = "redstoneplate";
    public static final String VERSION = "0.0.7";
    
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    	blockRegistry.blockRegistry();
    	craftingRegistry.craftingRegistry();
    	dimensionRegistry.mainRegistry();
    	
    }
    
    public void PostLoad(FMLPostInitializationEvent PostEvent) {
    	
    	@SuppressWarnings("unused")
		WorldType REDSTONEPLATE = new WorldTypeRedstonePlate(3, "Redstone Plate");
    }
}