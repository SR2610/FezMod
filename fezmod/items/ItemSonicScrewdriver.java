package fezmod.items;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.ArrowLooseEvent;
import net.minecraftforge.event.entity.player.ArrowNockEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fezmod.FezMod;

public class ItemSonicScrewdriver extends Item {

	public ItemSonicScrewdriver(int par1) {
		super(par1);
		setFull3D();

		maxStackSize = 1;
		setUnlocalizedName("Screwdriver");
		setCreativeTab(FezMod.FezTab);
		setHasSubtypes(true);

	}

	@Override
	public boolean onItemUse(ItemStack par1ItemStack,
			EntityPlayer par2EntityPlayer, World par3World, int par4, int par5,
			int par6, int par7, float par8, float par9, float par10) {

		if (par7 == 0) {
			--par5;
		}

		if (par7 == 1) {
			++par5;
		}

		if (par7 == 2) {
			--par6;
		}

		if (par7 == 3) {
			++par6;
		}

		if (par7 == 4) {
			--par4;
		}

		if (par7 == 5) {
			++par4;
		}

		if (par3World.isAirBlock(par4, par5, par6)) {
			par3World.setBlock(par4, par5, par6, FezMod.Powered.blockID);
			if (par3World.isAirBlock(par4, par5 - 1, par6)) {
				par3World
						.setBlock(par4, par5 - 1, par6, FezMod.Powered.blockID);
			}
		}

		return true;
	}

	public void onPlayerStoppedUsing(ItemStack stack, World world,
			EntityPlayer player, int useCount) {
		int time = this.getMaxItemUseDuration(stack) - useCount;
		if (time > 5) {
			this.onItemRightClick(stack, world, player);

		}
	}

	public EnumAction getItemUseAction(ItemStack par1ItemStack) {
		return EnumAction.bow;
	}

	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack) {
		return 30;
	}

	@SideOnly(Side.CLIENT)
	private Icon[] icons;

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister) {
		icons = new Icon[2];

		for (int i = 0; i < icons.length; i++) {
			icons[i] = par1IconRegister.registerIcon("fezmod:sonic_" + +i);
		}
	}

	public static final String[] names = new String[] { "first", "second" };

	public Icon getIconFromDamage(int par1) {
		return icons[par1];
	}

	@SideOnly(Side.CLIENT)
	public void getSubItems(int par1, CreativeTabs par2CreativeTabs,
			List par3List) {
		for (int x = 0; x < 2; x++) {
			par3List.add(new ItemStack(this, 1, x));
		}
	}

	public boolean shouldRotateAroundWhenRendering() {
		return true;
	}

	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer player,
			List par3List, boolean par4) {

		if (this.getDamage(par1ItemStack) <= 0) {
			par3List.add(EnumChatFormatting.ITALIC + "Geronimo!");
		} else if (this.getDamage(par1ItemStack) <= 1) {
			par3List.add(EnumChatFormatting.ITALIC + "Allons-y!");
		}

	}
}
