package com.mod.redstoneplate.demension;

import com.mod.redstoneplate.biome.BiomeRegistry;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderRedstonePlate extends WorldProvider {
	
	public void registerWorldChunkManager(){
		
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeRedstonePlate, 1.2F);
		this.dimensionId = dimensionRegistry.dimensionId;
	}

	@Override
	public String getDimensionName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public IChunkProvider createChunkGeneration(){
		return null;
		
	}

}
