
package com.mod.redstoneplate.blocks;

import com.mod.redstoneplate.demension.dimensionRegistry;
import com.mod.redstoneplate.demension.teleporterRedstonePlate;
import com.mod.redstoneplate.main.*;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.ServerConfigurationManager;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;


public class BlockRedstonePlate extends Block {

	public BlockRedstonePlate() {

	    super(Material.circuits);
	    
	    this.setHarvestLevel("pickaxe", 1);
	    this.setHardness(0.5F);
	    
	    this. setStepSound(Block.soundTypeStone);
	    
	    this.setBlockTextureName(mainRegistry.MODID + ":" + "redstoneplate");
	    this.setBlockName(mainRegistry.MODID + "_" + "redstoneplate");
	    
	    this.setCreativeTab(CreativeTabs.tabRedstone);
	    
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
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */
    public boolean canProvidePower()
    {
        return true;
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
    
    /**
     * Called when the block is placed in the world.
     */
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase p_149689_5_, ItemStack p_149689_6_) {
    	
    	if(world .equals(8) ){
    	
    	}
    	
    }
    
   
    /**
     * Called upon block activation (right click on the block.)
     * @param mcServer 
     */
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer EPlayer, int metadata, float what, float these, float are, MinecraftServer mcServer)
    {
    	TileEntity tileEntity = world.getTileEntity(x, y, z);
    	
    	//EntityPlayerMP thePlayer = (EntityPlayerMP) thePlayer;
    	
    	if(EPlayer instanceof EntityPlayerMP) {
    		
    		MinecraftServer server = MinecraftServer.getServer();
    		EntityPlayerMP thePlayer = (EntityPlayerMP) EPlayer;
    		
	        if (tileEntity == null && EPlayer.isSneaking()) {
	        	
	        	thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, dimensionRegistry.dimensionId, new teleporterRedstonePlate(server.worldServerForDimension(dimensionRegistry.dimensionId)));
	            
	        	return true;
	        }else {
	        	return false;
	        }
    	}
		return true;
    }

}

