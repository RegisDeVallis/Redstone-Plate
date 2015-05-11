
package com.mod.redstoneplate.blocks;

import com.mod.redstoneplate.RedstonePlate;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.world.IBlockAccess;


public class BlockRedstonePlate extends Block {

    public BlockRedstonePlate() {

    super(Material.circuits);
    
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
    
    /**
     * Determine if this block can make a redstone connection on the side provided,
     * Useful to control which sides are inputs and outputs for redstone wires.
     *
     * Side:
     *  -1: UP
     *   0: NORTH
     *   1: EAST
     *   2: SOUTH
     *   3: WEST
     *
     * @param world The current world
     * @param x X Position
     * @param y Y Position
     * @param z Z Position
     * @param side The side that is trying to make the connection
     * @return True to make the connection
     */
    public boolean canConnectRedstone(IBlockAccess world, int x, int y, int z, int side)
    {
        /**
         * Can this block provide power. Only wire currently seems to have this change based on its state.
         */
        return canProvidePower() && side != -1;
    }

}

