
package com.mod.redstoneplate.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.command.ICommandSender;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.IChatComponent;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;



import net.minecraftforge.common.MinecraftForge;

import com.mod.redstoneplate.demension.dimensionRegistry;
import com.mod.redstoneplate.demension.teleporterRedstonePlate;
import com.mod.redstoneplate.main.mainRegistry;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;


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
	
	public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity){
		
		((ICommandSender) entity).addChatMessage(new ChatComponentText("1!"));
		
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
    
    /**
     * Can this block provide power. Only wire currently seems to have this change based on its state.
     */
    public boolean canProvidePower()
    {
        return true;
    }
    
    /**
     * Called when the block is placed in the world.
     */
    /*
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase p_149689_5_, ItemStack p_149689_6_) {
    	
    	if(world .equals(8) ){
    	
    	}
    	
    }
    */
   
    /**
     * Called upon block activation (right click on the block.)
     * @param mcServer 
     */
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer EPlayer, int metadata, float what, float these, float are)
    {
    	Side side = FMLCommonHandler.instance().getEffectiveSide();
    	
    	if (side == Side.SERVER){

    		if (EPlayer instanceof EntityPlayerMP){
    			
    			WorldServer worldServer = (WorldServer)world;
    			EntityPlayerMP player = (EntityPlayerMP)EPlayer;
    			
    			
    			EPlayer.addChatMessage(new ChatComponentText("Teleporting!"));
    			player.mcServer.getConfigurationManager().transferPlayerToDimension(player, dimensionRegistry.dimensionId, new teleporterRedstonePlate(worldServer));
    			return true;
    		}
    		
    		return true;
    	}
    	
    	return true;
    }

}

