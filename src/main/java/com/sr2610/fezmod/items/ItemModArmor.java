package com.sr2610.fezmod.items;

import com.sr2610.fezmod.FezMod;
import com.sr2610.fezmod.Reference;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemModArmor extends ItemArmor{
	
	public ItemModArmor(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn,
			String unlocalizedName) {
		super(materialIn, renderIndexIn, equipmentSlotIn);

		setUnlocalizedName(Reference.PREFIX_NAME + unlocalizedName);
		setCreativeTab(FezMod.tabFezMod);
	}

}
