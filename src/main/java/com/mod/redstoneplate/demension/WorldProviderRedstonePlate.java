package com.mod.redstoneplate.demension;

import com.mod.redstoneplate.biome.BiomeRegistry;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;

public class WorldProviderRedstonePlate extends WorldProvider {
	
	public void registerWorldChunkManager(){
		
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeRedstonePlate, 1.2F);
	}

	@Override
	public String getDimensionName() {
		// TODO Auto-generated method stub
		return null;
	}

}
