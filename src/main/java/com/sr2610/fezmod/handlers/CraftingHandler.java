package com.sr2610.fezmod.handlers;

import com.sr2610.fezmod.items.ModItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftingHandler {

	public static void registerRecipies() {
		registerShapedRecipies();
		registerShapelessRecipies();
	}

	private static void registerShapelessRecipies() {
		for (int i = 0; i < 16; i++)
			GameRegistry.addShapelessRecipe(new ItemStack(ModItems.itemJellyBabies, 1),
					new Object[] { new ItemStack(Items.DYE, 1, i), Items.SUGAR });

	}

	private static void registerShapedRecipies() {
		GameRegistry.addRecipe(new ItemStack(ModItems.itemGlasses), "I I", "BIR", 'I', Items.IRON_INGOT, 'B',
				new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 11), 'R', new ItemStack(Blocks.STAINED_GLASS_PANE, 1, 14));
		GameRegistry.addRecipe(new ItemStack(ModItems.itemFez), " BG", "BRR", " RR", 'G', Items.GOLD_INGOT, 'B',
				new ItemStack(Blocks.WOOL, 1, 15), 'R', new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addRecipe(new ItemStack(ModItems.itemStetson), "B B", "BBB",'B',
				new ItemStack(Blocks.WOOL, 1, 12));
		GameRegistry.addRecipe(new ItemStack(ModItems.itemBowtie), "R R", "RRR","R R",'R',
				new ItemStack(Blocks.WOOL, 1, 14));
		GameRegistry.addRecipe(new ItemStack(ModItems.itemScarf), "RRR", "Y Y","G G",'R',
				new ItemStack(Blocks.WOOL, 1, 14),'Y',
				new ItemStack(Blocks.WOOL, 1, 4),'G',
				new ItemStack(Blocks.WOOL, 1, 5));
	}

}
