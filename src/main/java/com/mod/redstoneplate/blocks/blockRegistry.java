package com.mod.redstoneplate.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;

public class blockRegistry {
	
	public static Block BlockRedstonePlate;
    public static Block BlockRspDWall;
    
	public static void blockRegistry(){
		BlockRedstonePlate = new BlockRedstonePlate();
    	GameRegistry.registerBlock(BlockRedstonePlate, "Redstone Plate");
    	BlockRspDWall = new BlockRspDWall();
    	GameRegistry.registerBlock(BlockRspDWall, "RspDWall");
	}

}
