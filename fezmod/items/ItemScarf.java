package fezmod.items;

import java.util.List;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fezmod.FezMod;
import fezmod.Models.ModelScarf;

public class ItemScarf extends ItemArmor {

	private static final int ARMOR_CHEST = 1;

	public ItemScarf() {
		super(FezMod.ScarfID, EnumArmorMaterial.CLOTH, 2, ARMOR_CHEST);

	}

	@Override
	public boolean isValidArmor(ItemStack stack, int armorType, Entity entity) {
		return armorType == ARMOR_CHEST;
	}

	@SideOnly(Side.CLIENT)
	private ModelScarf model;

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,
			ItemStack itemStack, int armorSlot) {
		if (armorSlot == ARMOR_CHEST) {
			if (model == null)
				model = new ModelScarf();
			return model;
		}

		return null;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			int layer) {
		return "fezmod:scarftexture.png";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister registry) {
		itemIcon = registry.registerIcon("fezmod:scarf");
	}

	@Override
	public Icon getIcon(ItemStack stack, int pass) {
		return itemIcon;
	}

	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer player,
			List par3List, boolean par4) {
		par3List.add(EnumChatFormatting.ITALIC + "Would you like a jelly baby?");
	}

	@Override
	public void onArmorTickUpdate(World world, EntityPlayer player,
			ItemStack itemStack) {
		if (player.inventory.hasItemStack(new ItemStack(FezMod.JellyBabies))) {
			return;
		} else {
			double j = Math.random() * 10;
			if (j >10 && j<20) {
				player.inventory.addItemStackToInventory(new ItemStack(
						FezMod.JellyBabies, 1));

			}
		}
	}

}