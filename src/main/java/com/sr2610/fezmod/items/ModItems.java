package com.sr2610.fezmod.items;

import com.sr2610.fezmod.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	public static ItemFez itemFez = new ItemFez("fez");
	

	public static void createItems() {
		registerItem(itemFez,"fez");
	}

	private static void registerItem(Item item, String name) {
		GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID, name));

	}
	


}
