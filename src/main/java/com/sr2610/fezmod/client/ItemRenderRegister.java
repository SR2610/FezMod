package com.sr2610.fezmod.client;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ItemRenderRegister {

	public static void registerItemRenderers() {

	}

	public static void registerItem(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getUnlocalizedName().substring(5), "inventory"));

	}
}