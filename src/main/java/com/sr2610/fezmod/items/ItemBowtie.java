package com.sr2610.fezmod.items;

import com.sr2610.fezmod.client.model.ModelBowtie;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemBowtie extends ItemModArmor{

	public ItemBowtie(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn,
			String unlocalizedName) {
		super(materialIn, renderIndexIn, equipmentSlotIn, unlocalizedName);
	}

	public ItemBowtie(String unlocalizedName) {
		super(ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.CHEST, unlocalizedName);
	}

	@SideOnly(Side.CLIENT)
	private ModelBowtie model = new ModelBowtie();

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			net.minecraft.client.model.ModelBiped _default) {
		return model;
	}

}
