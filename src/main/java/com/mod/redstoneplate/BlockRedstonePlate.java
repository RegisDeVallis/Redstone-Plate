
package com.mod.redstoneplate;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;


public class BlockRedstonePlate extends Block {

    public BlockRedstonePlate() {

    super(Material.rock);
    
    setHarvestLevel("pickaxe", 1);
    setHardness(0.5F);
    
    setStepSound(Block.soundTypeStone);
    
    setBlockTextureName(RedstonePlate.MODID + ":" + "redstoneplate");
    setBlockName(RedstonePlate.MODID + "_" + "redstoneplate");
    
    setCreativeTab(CreativeTabs.tabRedstone);
    
    //shape
    this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.125F, 1.0F);

    }
    
    /**
     * Is this block (a) opaque and (b) a full 1m cube?  This determines whether or not to render the shared face of two
     * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
     */
    public boolean isOpaqueCube()
    {
        return false;
    }

    /**
     * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
     */
    public boolean renderAsNormalBlock()
    {
        return false;
    }

}