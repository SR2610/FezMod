package fezmod;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import fezmod.Proxies.CommonProxy;
import fezmod.items.Item3DGlasses;
import fezmod.items.ItemBowTie;
import fezmod.items.ItemFez;
import fezmod.items.ItemJellyBabies;
import fezmod.items.ItemScarf;
import fezmod.items.ItemSonicScrewdriver;
import fezmod.items.ItemStetson;

@Mod(modid = "fezmod", name = "Fez Mod", version = "1.1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)
public class FezMod {

	@SidedProxy(serverSide = "fezmod.Proxies.CommonProxy", clientSide = "fezmod.Proxies.ClientProxy")
	public static CommonProxy proxy;
	
	public static CreativeTabs FezTab = new CreativeTabs("FezTab") {
		@Override
		public ItemStack getIconItemStack() {
			return new ItemStack(FezHat);
		}
	};

	public static Item FezHat;
	public static int FezHatID;
	public static Item StetsonHat;
	public static int StetsonID;
	public static Item Scarf;
	public static int ScarfID;
	public static Item Bowtie;
	public static int BowtieID;
	public static Item Screwdriver;
public static int ScrewdriverID;
public static Item JellyBabies;
public static int JellyBabiesID;
public static Item Glasses;
public static int GlassesID;
public static Item ScrewdriverParts;
public static int ScrewdriverPartsID;
public static Block Powered;
public static int ghostblockID;
public static boolean canRegen;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());

		config.load();

		FezHatID = config.getItem("Fez", 6801).getInt();
		StetsonID = config.getItem("Stetston", 6802).getInt();
		ScarfID = config.getItem("Scarf", 6803).getInt();	
		BowtieID = config.getItem("Bowtie", 6804).getInt();	
		ScrewdriverID = config.getItem("Screwdriver", 6805).getInt();
		JellyBabiesID = config.getItem("JellyBabies", 6806).getInt();
		GlassesID = config.getItem("3D Glasses", 6807).getInt();
		ScrewdriverPartsID = config.getItem("Screwdriver Parts",6808).getInt();
		ghostblockID = config.getBlock("Ghost Block", 501).getInt();
		canRegen = config.get(config.CATEGORY_GENERAL, "Can Fez Give Regeneration Effect", true).getBoolean(true);
		config.save();
	}

	@EventHandler
	public void load(FMLInitializationEvent e) {
		FezHat = new ItemFez().setUnlocalizedName("FezHat").setCreativeTab(FezTab);;
		LanguageRegistry.addName(FezHat,"Fez");
		
		Screwdriver = new ItemSonicScrewdriver(ScrewdriverID);
		LanguageRegistry.addName(Screwdriver,"Sonic Screwdriver");

		
		StetsonHat = new ItemStetson().setUnlocalizedName("StetsonHat").setCreativeTab(FezTab);;
		LanguageRegistry.addName(StetsonHat,"Stetson");
		
		Scarf = new ItemScarf().setUnlocalizedName("Scarf").setCreativeTab(FezTab);;
		LanguageRegistry.addName(Scarf,"Scarf");
		JellyBabies = new ItemJellyBabies().setUnlocalizedName("JellyBabies").setCreativeTab(FezTab);;
		LanguageRegistry.addName(JellyBabies,"Jelly Babies");
		
		Bowtie = new ItemBowTie().setUnlocalizedName("Bowtie").setCreativeTab(FezTab);;
		LanguageRegistry.addName(Bowtie,"Bowtie");
		
		Glasses = new Item3DGlasses().setUnlocalizedName("Glassest").setCreativeTab(FezTab);
		LanguageRegistry.addName(Glasses,"3D Glasses");
		
		 Powered = new Powered(ghostblockID).setHardness(1.5F)
                  .setResistance(10.0F)
                  .setUnlocalizedName("Powered");
		 GameRegistry.registerBlock(Powered, "Powered");
		 
		 LanguageRegistry.instance().addStringLocalization("itemGroup.FezTab",
					EnumChatFormatting.ITALIC + "The Fez Mod");
		 
	CraftingHandler.init();

	}
	

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}