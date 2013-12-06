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
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fezmod.FezMod;
import fezmod.Util;
import fezmod.Models.ModelFez;

public class ItemFez  extends ItemArmor {

	 private static final int ARMOR_HELMET = 0;

    public ItemFez() {
            super(FezMod.FezHatID, EnumArmorMaterial.CLOTH, 2, ARMOR_HELMET);
            
    }

	@Override
    public boolean isValidArmor(ItemStack stack, int armorType, Entity entity) {
            return armorType == ARMOR_HELMET;
    }

    @SideOnly(Side.CLIENT)
    private ModelFez model;

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
            if (armorSlot == ARMOR_HELMET) {
                    if (model == null) model = new ModelFez();
                    return model;
            }

            return null;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
            return "fezmod:fezmodel.png";
    }
    
  
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister registry) {
            itemIcon = registry.registerIcon("fezmod:fez");
    }

    @Override
    public Icon getIcon(ItemStack stack, int pass) {
            return itemIcon;
    }
    
    
    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer player,
  			List par3List, boolean par4) {
    	par3List.add(EnumChatFormatting.ITALIC + "Fezes are cool");
    }

    @Override
    public void onArmorTickUpdate(World world, EntityPlayer player,
                    ItemStack itemStack) {
    	if (FezMod.canRegen == true){
            if (player.getHealth() < 3F){
            	if (!world.isRemote)
            	   player.addPotionEffect(new PotionEffect(Potion.regeneration.id,
                          40, 5));
            	   player.setCurrentItemOrArmor(4, null);
            }
    	}
    }

}