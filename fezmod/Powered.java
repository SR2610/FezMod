package fezmod;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class Powered extends Block {

	public Powered(int par1) {
		super(par1, Material.air);
		this.setLightOpacity(1);
		this.setBlockUnbreakable();
		this.setBlockBounds(0F, 0, 0F, 0F, 0, 0F);
		this.setTickRandomly(true);
		this.setCreativeTab(null);
		this.disableStats();
	}

	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World,
			int par2, int par3, int par4) {
		return null;
	}

	@Override
	public boolean isOpaqueCube() {
		return false;
	}

	public boolean canProvidePower() {
		return true;
	}

	@Override
	public int quantityDropped(Random par1Random) {
		return 0;
	}

	public int isProvidingWeakPower(IBlockAccess par1IBlockAccess, int par2,
			int par3, int par4, int par5) {
		return 15;
	}

	@Override
	public boolean isAirBlock(World world, int x, int y, int z) {
		return true;
	}

	/**
	 * If this block doesn't render as an ordinary block it will return False
	 * (examples: signs, buttons, stairs, etc)
	 */
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public void onBlockAdded(World world, int x, int y, int z) {
		super.onBlockAdded(world, x, y, z);
		world.scheduleBlockUpdate(x, y, z, this.blockID, 100);
	}

	@Override
	public void updateTick(World world, int x, int y, int z, Random par5Random) {
		world.setBlock(x, y, z, 0);

	}

	@SideOnly(Side.CLIENT)
	public boolean addBlockHitEffects(World worldObj,
			MovingObjectPosition target, EffectRenderer effectRenderer) {
		return false;
	}

	@SideOnly(Side.CLIENT)
	public boolean addBlockDestroyEffects(World world, int x, int y, int z,
			int meta, EffectRenderer effectRenderer) {
		return false;
	}

}
