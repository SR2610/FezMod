package fezmod.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fezmod.FezMod;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;

public class ItemJellyBabies extends ItemFood{

	public ItemJellyBabies() {
		super(FezMod.JellyBabiesID, 1, 0.10F, false);
		this.setAlwaysEdible();
		this.maxStackSize = 32;
		this.setPotionEffect(Potion.moveSpeed.id, 3, 0, 0.25F);
	}

	
@Override
public int getMaxItemUseDuration(ItemStack par1ItemStack)
{
    return 20;
}

@Override
@SideOnly(Side.CLIENT)
public void registerIcons(IconRegister registry) {
        itemIcon = registry.registerIcon("fezmod:JellyBabies");
}


	
}
