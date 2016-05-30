package com.sr2610.fezmod.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class ModelBowtie extends ModelBiped
{
    ModelRenderer Centre;
    ModelRenderer wing1;
    ModelRenderer wing2;
    ModelRenderer wing3;
    ModelRenderer wing4;
  
  public ModelBowtie()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Centre = new ModelRenderer(this, 4, 0);
      Centre.addBox(0F, 0F, 0F, 2, 2, 1);
      Centre.setRotationPoint(-1F, 1F, -3F);
      Centre.setTextureSize(64, 32);
      Centre.mirror = true;
      setRotation(Centre, 0F, 0F, 0F);
      wing1 = new ModelRenderer(this, 13, 0);
      wing1.addBox(0F, 0F, 0F, 1, 2, 1);
      wing1.setRotationPoint(-2F, 1.5F, -3F);
      wing1.setTextureSize(64, 32);
      wing1.mirror = true;
      setRotation(wing1, 0F, 0F, 0F);
      wing2 = new ModelRenderer(this, 13, 0);
      wing2.addBox(0F, 0F, 0F, 1, 1, 1);
      wing2.setRotationPoint(-2F, 0.5F, -3F);
      wing2.setTextureSize(64, 32);
      wing2.mirror = true;
      setRotation(wing2, 0F, 0F, 0F);
      wing3 = new ModelRenderer(this, 13, 0);
      wing3.addBox(0F, 0F, 0F, 1, 2, 1);
      wing3.setRotationPoint(1F, 1.5F, -3F);
      wing3.setTextureSize(64, 32);
      wing3.mirror = true;
      setRotation(wing3, 0F, 0F, 0F);
      wing4 = new ModelRenderer(this, 13, 0);
      wing4.addBox(0F, 0F, 0F, 1, 1, 1);
      wing4.setRotationPoint(1F, 0.5F, -3F);
      wing4.setTextureSize(64, 32);
      wing4.mirror = true;
      setRotation(wing4, 0F, 0F, 0F);
  }
  
  private static void setRotation(ModelRenderer model, float x, float y,
			float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void render(Entity entity, float swingTime, float swingAmpl,
			float rightArmAngle, float headAngleX, float headAngleY, float scale) {
	  Centre.render(scale);
	     wing1.render(scale);
	     wing2.render(scale);
	     wing3.render(scale);
	     wing4.render(scale);

	}

}