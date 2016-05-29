package com.sr2610.fezmod.items;

import com.sr2610.fezmod.client.model.ModelScarf;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemScarf extends ItemModArmor {

	public ItemScarf(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn,
			String unlocalizedName) {
		super(materialIn, renderIndexIn, equipmentSlotIn, unlocalizedName);
	}

	public ItemScarf(String unlocalizedName) {
		super(ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.CHEST, unlocalizedName);
	}

	@SideOnly(Side.CLIENT)
	private ModelScarf model = new ModelScarf();

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			net.minecraft.client.model.ModelBiped _default) {
		return model;
	}

}
