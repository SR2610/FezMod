package com.sr2610.fezmod.client;

import com.sr2610.fezmod.items.ModItems;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ItemRenderRegister {

	public static void registerItemRenderers() {
		registerItem(ModItems.itemFez);
		registerItem(ModItems.itemGlasses);
		registerItem(ModItems.itemScarf);
		registerItem(ModItems.itemJellyBabies);
		registerItem(ModItems.itemBowtie);
		registerItem(ModItems.itemStetson);

	}

	public static void registerItem(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory"));

	}
}