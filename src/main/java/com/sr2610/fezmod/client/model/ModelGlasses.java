package com.sr2610.fezmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelGlasses extends ModelBiped {

	public ModelGlasses() {
		textureWidth = 32;
		textureHeight = 16;
	    bipedHead = new ModelRenderer(this, 0, 0);

		bipedHead.addBox(4F, -4F, -2F, 1, 1, 3);

		bipedHead.addBox(-5F, -3F, 1F, 1, 1, 1);

		bipedHead.addBox(4F, -3F, 1F, 1, 1, 1);

		bipedHead.addBox(3F, -5F, -5F, 1, 3, 1);
		bipedHead.addBox(4F, -5F, -5, 1, 2, 3);

		
		bipedHead.addBox(-5F, -4F, -2F, 1, 1, 3);

		
		bipedHead.addBox(-5F, -5F, -5F, 1, 2, 3);

		
		bipedHead.addBox(-4F, -5F, -5F, 1, 3, 1);

		bipedHead.addBox(1F, -3F, -5F, 2, 1, 1);
		bipedHead.addBox(-3F, -3F, -5F, 2, 1, 1);

		bipedHead.addBox(-3F, -5F, -5F, 6, 1, 1);
		bipedHead.addBox(-1F, -4F, -5F, 2, 1, 1);
		setRotation(bipedHead, 0F, 0F, 0F);
		bipedHead.setTextureOffset(16, 0);
		bipedHead.addBox(-3F, -4F, -5F, 2, 1, 1);
		bipedHead.setTextureOffset(24, 0);
		bipedHead.addBox(1F, -4F, -5F, 2, 1, 1);
	
	
	}

	private static void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
		GL11.glPushMatrix();
		GL11.glScaled(1, 1, 1);
		GL11.glEnable(GL11.GL_BLEND);
		bipedHead.render(scale);
		GL11.glDisable(GL11.GL_BLEND);
		GL11.glPopMatrix();
	}

}