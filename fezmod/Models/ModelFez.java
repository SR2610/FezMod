package fezmod.Models;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFez extends ModelBiped
{

  
  public ModelFez()
  {
    textureWidth = 64;
    textureHeight = 32;
    
    bipedHead = new ModelRenderer(this, 34, 0);
      bipedHead.addBox(-2F, -10F, -2F, 4, 3, 4);
      setRotation(bipedHead, 0f, 0F, -0.1F);

      
      bipedHead.setTextureOffset(51, 0);
      bipedHead.addBox(-3F, -11F, 0F, 3, 1, 1);
      bipedHead.setTextureOffset(51, 0);
      bipedHead.addBox(-3F, -10F, 0F, 1, 2, 1);
      
     
  }
  
  @Override
  public void render(Entity par1Entity, float par2, float par3, float par4, float par5, float par6, float par7) {
          setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
          GL11.glPushMatrix();
          GL11.glScaled(1.2, 1.2, 1.2);
          bipedHead.render(par7);
          GL11.glPopMatrix();
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  


}
