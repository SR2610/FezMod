package com.sr2610.fezmod.config;

import com.sr2610.fezmod.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigHandler {
	
	public static boolean fezRegen = true;

	public static void initConfig(FMLPreInitializationEvent event) {
		configFile = new Configuration(event.getSuggestedConfigurationFile());
		syncConfig();
	}

	public static Configuration configFile;

	@SubscribeEvent
	public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
		if (eventArgs.getModID().equals(Reference.MOD_ID))
			syncConfig();
	}

	private static void syncConfig() {
	
		fezRegen = configFile.getBoolean("Fez Regeneration", Configuration.CATEGORY_GENERAL,
				fezRegen, "Set to false if you want the fez to be purely cosmetic.");

		if (configFile.hasChanged())
			configFile.save();
	}

}