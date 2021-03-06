package com.sr2610.fezmod.items;

import com.sr2610.fezmod.Reference;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	public static ItemFez itemFez = new ItemFez("fez");
	public static ItemGlasses itemGlasses = new ItemGlasses("glasses");
	public static ItemScarf itemScarf = new ItemScarf("scarf");
	public static ItemJellyBaby itemJellyBabies = new ItemJellyBaby("jellybaby");
	public static ItemBowtie itemBowtie = new ItemBowtie("bowtie");
	public static ItemStetson itemStetson = new ItemStetson("stetson");

	public static void createItems() {
		registerItem(itemFez, "fez");
		registerItem(itemGlasses, "glasses");
		registerItem(itemScarf, "scarf");
		registerItem(itemJellyBabies, "jellybaby");
		registerItem(itemBowtie, "bowtie");
		registerItem(itemStetson, "stetson");

	}

	private static void registerItem(Item item, String name) {
		GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID, name));

	}

}
