package com.mod.redstoneplate.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;

public class BiomeRegistry {
	
	public static BiomeGenBase biomeRedstonePlate;
	
	public static void mainRegistry() {
		initializedBiome();
		registerBiome();
	}

	private static void registerBiome() {
		
		BiomeRedstonePlate = new BiomeGenRedstonePlate(137).setBiomeName("Redstone Plate").setTemperatureRainfall(1.2F, 0.9F);
		
	}

	private static void initializedBiome() {
		// TODO Auto-generated method stub
		
		BiomeDictionary.registerBiomeType(BiomeRedstonePlate, Type.FOREST);
		
		
	}

}
