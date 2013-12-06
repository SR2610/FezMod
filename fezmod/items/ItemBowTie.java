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
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fezmod.FezMod;
import fezmod.Models.ModelBowtie;

public class ItemBowTie extends ItemArmor {

	 private static final int ARMOR_CHEST = 1;

  public ItemBowTie() {
          super(FezMod.BowtieID, EnumArmorMaterial.CLOTH, 2, ARMOR_CHEST);
          
  }

	@Override
  public boolean isValidArmor(ItemStack stack, int armorType, Entity entity) {
          return armorType == ARMOR_CHEST;
  }

  @SideOnly(Side.CLIENT)
  private ModelBowtie model;

  @Override
  @SideOnly(Side.CLIENT)
  public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
          if (armorSlot == ARMOR_CHEST) {
                  if (model == null) model = new ModelBowtie();
                  return model;
          }

          return null;
  }

  @Override
  public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
          return "fezmod:BowtieTexture.png";
  }
  

  @Override
  @SideOnly(Side.CLIENT)
  public void registerIcons(IconRegister registry) {
          itemIcon = registry.registerIcon("fezmod:bowtie");
  }

  @Override
  public Icon getIcon(ItemStack stack, int pass) {
          return itemIcon;
  }
  
  @Override
  public void addInformation(ItemStack par1ItemStack, EntityPlayer player,
			List par3List, boolean par4) {
  	par3List.add(EnumChatFormatting.ITALIC + "Bow Ties are cool");
  }
  
}