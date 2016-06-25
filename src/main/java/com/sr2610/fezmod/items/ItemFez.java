package com.sr2610.fezmod.items;

import com.sr2610.fezmod.client.model.ModelFez;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemFez extends ItemModArmor {

	public ItemFez(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn,
			String unlocalizedName) {
		super(materialIn, renderIndexIn, equipmentSlotIn, unlocalizedName);
	}

	public ItemFez(String unlocalizedName) {
		super(ArmorMaterial.LEATHER, 0, EntityEquipmentSlot.HEAD, unlocalizedName);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, EntityEquipmentSlot armorSlot,
			net.minecraft.client.model.ModelBiped _default) {
		return new ModelFez();
	}

}
