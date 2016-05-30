package com.sr2610.fezmod.items;

import java.util.List;

import com.sr2610.fezmod.FezMod;
import com.sr2610.fezmod.Reference;
import com.sr2610.fezmod.config.ConfigHandler;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.translation.I18n;

public class ItemModArmor extends ItemArmor {

	private String rawName;

	public ItemModArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn,
			String unlocalizedName) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		rawName = unlocalizedName;
		setUnlocalizedName(Reference.PREFIX_NAME + unlocalizedName);
		setCreativeTab(FezMod.tabFezMod);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, EntityEquipmentSlot slot, String type) {
		return Reference.ARMOR_PREFIX + rawName + ".png";
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean advanced) {
		if (ConfigHandler.enableFlavourLines)
			list.add(I18n.translateToLocal("flavour." + rawName));
	}

}
