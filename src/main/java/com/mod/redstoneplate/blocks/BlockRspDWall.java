package com.mod.redstoneplate.blocks;

import com.mod.redstoneplate.main.mainRegistry;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockRspDWall extends Block {
	
	public BlockRspDWall() {
		
		super(Material.rock);
		
		setStepSound(Block.soundTypeStone);
		
		setBlockTextureName(mainRegistry.MODID + ":" + "RspDWall");
	    setBlockName(mainRegistry.MODID + "_" + "RspDWall");
	    
	    setCreativeTab(CreativeTabs.tabRedstone);
	    
	  
	   
	}
	
	
	
	/**
     * This method will set the hardness of the block to -1, making it indestructible
     */
    public Block setBlockUnbreakable()
    {
        this.setHardness(-1.0F);
        return this;
    }
    
    /**
     * Sets the the blocks resistance to explosions. Returns the object for convenience in constructing.
     */
    public Block setResistance(float p_149752_1_)
    {
        this.blockResistance = p_149752_1_ * 3.0F;
        return this;
    }
    
    public Boolean canBlockGrass()
    {
    	return true;
    }
    

}
