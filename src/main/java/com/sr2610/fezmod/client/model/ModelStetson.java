package com.sr2610.fezmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ModelStetson extends ModelBiped {

	public ModelStetson() {
		textureWidth = 64;
		textureHeight = 32;

		bipedHead = new ModelRenderer(this, 25, 0);
		bipedHead.addBox(-4F, -7F, -6F, 8, 1, 12);
		bipedHead.setTextureOffset(34, 14);
		bipedHead.addBox(-3F, -9F, -4F, 6, 2, 8);

		bipedHead.setTextureOffset(2, 0);

		bipedHead.addBox(4F, -7F, -5F, 1, 1, 10);

		bipedHead.addBox(-5F, -7F, -5F, 1, 1, 10);

		bipedHead.setTextureOffset(0, 25);

		bipedHead.addBox(-2F, -10F, -3F, 4, 1, 6);

		bipedHead.setTextureOffset(0, 15);
		bipedHead.addBox(1F, -11F, -2F, 1, 1, 4);

		bipedHead.addBox(-2F, -11F, -2F, 1, 1, 4);
		setRotation(bipedHead, 0.05F, 0F, 0F);

	}

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch, float scale) {
		setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entity);
		GL11.glPushMatrix();
		GL11.glScaled(1.2, 1.2, 1.2);
		bipedHead.render(scale);
		GL11.glPopMatrix();
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}