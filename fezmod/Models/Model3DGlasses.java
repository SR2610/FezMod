package fezmod.Models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

public class Model3DGlasses extends ModelBiped {

	public Model3DGlasses() {
		textureWidth = 64;
		textureHeight = 32;
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
		bipedHead.setTextureOffset(18, 0);
		bipedHead.addBox(-3F, -4F, -5F, 2, 1, 1);
		bipedHead.setTextureOffset(27, 0);
		bipedHead.addBox(1F, -4F, -5F, 2, 1, 1);
	
	
	}

	private static void setRotation(ModelRenderer model, float x, float y,
			float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	
	@Override
	  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
	          setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
	          GL11.glPushMatrix();
	          GL11.glScaled(1, 1, 1);
	  	GL11.glEnable(GL11.GL_BLEND);
	          bipedHead.render(par7);
	      	GL11.glDisable(GL11.GL_BLEND);
	          GL11.glPopMatrix();
	  }

}
