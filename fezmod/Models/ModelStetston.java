package fezmod.Models;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelStetston extends ModelBiped {

	public ModelStetston() {
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
	public void render(Entity par1Entity, float par2, float par3, float par4,
			float par5, float par6, float par7) {
		setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
		GL11.glPushMatrix();
		GL11.glScaled(1.2, 1.2, 1.2);
		bipedHead.render(par7);
		GL11.glPopMatrix();
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

}
