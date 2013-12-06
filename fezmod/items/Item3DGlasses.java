package fezmod.items;

import java.util.List;

import net.minecraft.client.gui.ScaledResolution;
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
import fezmod.Models.Model3DGlasses;

public class Item3DGlasses extends ItemArmor {
	private static final int ARMOR_HELMET = 0;

	public Item3DGlasses() {
		super(FezMod.GlassesID, EnumArmorMaterial.CHAIN, 2, ARMOR_HELMET);

	}
	
	@Override
    public boolean isValidArmor(ItemStack stack, int armorType, Entity entity) {
            return armorType == ARMOR_HELMET;
    }

    @SideOnly(Side.CLIENT)
    private Model3DGlasses model;

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
            if (armorSlot == ARMOR_HELMET) {
                    if (model == null) model = new Model3DGlasses();
                    return model;
            }

            return null;
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, int layer) {
            return "fezmod:glasses.png";
    }
    
  
    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister registry) {
            itemIcon = registry.registerIcon("fezmod:3DGlasses");
    }

    @Override
    public Icon getIcon(ItemStack stack, int pass) {
            return itemIcon;
    }
    @Override
	public void addInformation(ItemStack par1ItemStack, EntityPlayer player,
			List par3List, boolean par4) {
		par3List.add(EnumChatFormatting.ITALIC + "Oh, yes!");
	}

}
