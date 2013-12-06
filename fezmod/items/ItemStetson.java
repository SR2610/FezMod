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
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Icon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fezmod.FezMod;
import fezmod.Util;
import fezmod.Models.ModelStetston;

public class ItemStetson extends ItemArmor {

	private static final int ARMOR_HELMET = 0;

	public ItemStetson() {
		super(FezMod.StetsonID, EnumArmorMaterial.CLOTH, 2, ARMOR_HELMET);

	}

	@Override
	public boolean isValidArmor(ItemStack stack, int armorType, Entity entity) {
		return armorType == ARMOR_HELMET;
	}

	@SideOnly(Side.CLIENT)
	private ModelStetston model;

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving,
			ItemStack itemStack, int armorSlot) {
		if (armorSlot == ARMOR_HELMET) {
			if (model == null)
				model = new ModelStetston();
			return model;
		}

		return null;
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			int layer) {
		return "fezmod:stetsonmodel.png";
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister registry) {
		itemIcon = registry.registerIcon("fezmod:stetson");
	}

	@Override
	public Icon getIcon(ItemStack stack, int pass) {
		return itemIcon;
	}

	@Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer player,
			List par3List, boolean par4) {
		par3List.add(EnumChatFormatting.ITALIC + "Stetsons are cool now");
	}
	
	 private static NBTTagCompound getOrCreateTag(ItemStack itemStack) {
         NBTTagCompound tag = itemStack.getTagCompound();
         if (tag == null) {
                 tag = new NBTTagCompound();
                 itemStack.setTagCompound(tag);
         }
         return tag;
 }
	
    public static void ejectHat(EntityPlayer player, ItemStack itemStack) {
        NBTTagCompound tag = getOrCreateTag(itemStack);
        player.setCurrentItemOrArmor(4, null);
     Util.dropItemStackInWorld(player.worldObj, player.posX, player.posY, player.posZ, itemStack);
}
}