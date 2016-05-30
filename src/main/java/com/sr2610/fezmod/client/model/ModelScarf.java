package com.sr2610.fezmod.client.model;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
@SideOnly(Side.CLIENT)
public class ModelScarf extends ModelBiped {
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape3;
	ModelRenderer Shape4;
	ModelRenderer Shape5;
	ModelRenderer Shape6;

	public ModelScarf() {
		textureWidth = 64;
		textureHeight = 32;

		Shape1 = new ModelRenderer(this, 25, 18);
		Shape1.addBox(0F, 0F, 0F, 10, 1, 2);
		Shape1.setRotationPoint(-5F, 0F, 2F);
		Shape1.setTextureSize(64, 32);
		Shape1.mirror = true;
		setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 0, 18);
		Shape2.addBox(0F, 0F, 0F, 10, 1, 1);
		Shape2.setRotationPoint(-5F, 0F, -3F);
		Shape2.setTextureSize(64, 32);
		Shape2.mirror = true;
		setRotation(Shape2, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 21, 0);
		Shape3.addBox(0F, 0F, 0F, 1, 2, 7);
		Shape3.setRotationPoint(-5F, -2F, -3F);
		Shape3.setTextureSize(64, 32);
		Shape3.mirror = true;
		setRotation(Shape3, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 21, 0);
		Shape4.addBox(0F, 0F, 0F, 1, 2, 7);
		Shape4.setRotationPoint(4F, -2F, -3F);
		Shape4.setTextureSize(64, 32);
		Shape4.mirror = true;
		setRotation(Shape4, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 58, 0);
		Shape5.addBox(0F, 0F, 0F, 3, 8, 0);
		Shape5.setRotationPoint(1F, 1F, -3F);
		Shape5.setTextureSize(64, 32);
		Shape5.mirror = true;
		setRotation(Shape5, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 58, 0);
		Shape6.addBox(0F, 0F, 0F, 3, 8, 0);
		Shape6.setRotationPoint(-4F, 1F, -3F);
		Shape6.setTextureSize(64, 32);
		Shape6.mirror = true;
		setRotation(Shape6, 0F, 0F, 0F);
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
		Shape1.render(scale);
		Shape2.render(scale);
		Shape3.render(scale);
		Shape4.render(scale);
		Shape5.render(scale);
		Shape6.render(scale);

	}

}