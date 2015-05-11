package com.mod.redstoneplate.demension;

import net.minecraftforge.common.DimensionManager;

public class dimensionRegistry {
	
	public static final int dimensionId = 8;
	
	public static void mainRegistry() {
		
		registerDemension();
	}

	private static void registerDemension() {
		
		DimensionManager.registerProviderType(dimensionId, WorldProviderRedstonePlate.class, true);
		DimensionManager.registerDimension(dimensionId, dimensionId);
		
	}

}
