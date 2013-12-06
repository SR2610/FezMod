package fezmod;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public final class CraftingHandler {

	public static void init() {
		GameRegistry.addRecipe(new ItemStack(FezMod.FezHat), new Object[] {

		" X ", "XZZ", " ZZ", 'X', new ItemStack(Item.ingotGold), 'Z',
				new ItemStack(Block.cloth, 1, 14) });

		GameRegistry.addRecipe(new ItemStack(FezMod.StetsonHat), new Object[] {

		"X X", "XXX", 'X', new ItemStack(Block.cloth, 1, 12) });

		GameRegistry.addRecipe(new ItemStack(FezMod.Bowtie), new Object[] {

		"x x", "xxx", "x x", 'x', new ItemStack(Block.cloth, 1, 14) });

		GameRegistry.addRecipe(new ItemStack(FezMod.Scarf), new Object[] {

		"aaa", "b b", "c c", 'a', new ItemStack(Block.cloth, 1, 14), 'b',
				new ItemStack(Block.cloth, 1, 4), 'c',
				new ItemStack(Block.cloth, 1, 5) });

		GameRegistry.addRecipe(new ItemStack(FezMod.Glasses), new Object[] {

		"a a", "bac", 'a', new ItemStack(Item.ingotIron), 'b',
				new ItemStack(Block.cloth, 1, 14), 'c',
				new ItemStack(Block.cloth, 1, 11) });

		GameRegistry.addRecipe(new ItemStack(FezMod.Glasses), new Object[] {

		"a a", "cab", 'a', new ItemStack(Item.ingotIron), 'b',
				new ItemStack(Block.cloth, 1, 14), 'c',
				new ItemStack(Block.cloth, 1, 11) });

		GameRegistry.addRecipe(new ItemStack(FezMod.Screwdriver, 1, 0),
				new Object[] {

				"IEI", "BIB", "WDW", 'I', new ItemStack(Item.ingotIron), 'E',
						new ItemStack(Item.emerald), 'D',
						new ItemStack(Item.diamond), 'B',
						new ItemStack(Block.cloth, 1, 12), 'W',
						new ItemStack(Block.cloth, 1, 0) });
		GameRegistry.addRecipe(new ItemStack(FezMod.Screwdriver, 1, 1),
				new Object[] {

				"QDQ", "QIQ", " Q ", 'I', new ItemStack(Item.ingotIron), 'Q',
						new ItemStack(Block.blockNetherQuartz), 'D',
						new ItemStack(Item.diamond) });
		int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		for (int i : numbers) {

			GameRegistry.addShapelessRecipe(
					new ItemStack(FezMod.JellyBabies, 1), new Object[] {
						new ItemStack(Item.dyePowder,1,i), Item.sugar });

		}
	}
}
