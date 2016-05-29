package com.sr2610.fezmod.items;

import com.sr2610.fezmod.FezMod;
import com.sr2610.fezmod.Reference;
import com.sr2610.fezmod.config.ConfigHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class ItemJellyBaby extends ItemFood {

	public ItemJellyBaby(String unlocalizedName) {
		super(1, 0.1F, false);
		setCreativeTab(CreativeTabs.FOOD);
		setCreativeTab(FezMod.tabFezMod);
		setUnlocalizedName(Reference.PREFIX_NAME+unlocalizedName);
		this.setPotionEffect(new PotionEffect(Potion.getPotionById(1), ConfigHandler.speedDuration*20), ConfigHandler.speedProbability);
	}

	@Override
	public int getMaxItemUseDuration(ItemStack par1ItemStack) {
		return 20;
	}

}
