package com.mod.redstoneplate;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
 
@Mod(modid = RedstonePlate.MODID, version = RedstonePlate.VERSION)
public class RedstonePlate
{
    public static final String MODID = "redstoneplate";
    public static final String VERSION = "0.0.2";
    
    //my variables
    public static BlockRedstonePlate BlockRedstonePlate;
 
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	BlockRedstonePlate = new BlockRedstonePlate();
    	
    	GameRegistry.addRecipe(new ItemStack(BlockRedstonePlate), new Object[]{
        	"XYX",
        	"YZY",
        	"XYX",
        	'X', Items.iron_ingot , 'Y', Blocks.redstone_wire , 'Z' , Blocks.stone_slab  });
    	
    	System.out.println("Done Loading");
    
    }
}
