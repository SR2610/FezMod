package com.sr2610.fezmod.config;

import com.sr2610.fezmod.Reference;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Reference.MOD_ID)
@Config.LangKey(Reference.CONFIG_LANG)
public class ConfigHandler {

	@Config.Comment("Set to false if you want the fez to be purely cosmetic.")
	public static boolean fezRegen = true;

	@Config.Comment("The probabillity of reciving a speed boost from eating some Jelly Babies")
	public static double speedProbability = 0.1;

	@Config.Comment("The duration of speed boost recived from Jelly Babies")
	public static int speedDuration = 5;

	@Config.Comment("Set to false if you don't want flavour lines on items.")
	public static boolean enableFlavourLines = true;

}

@Mod.EventBusSubscriber
class EventHandler {
	@SubscribeEvent
	public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.getModID().equals(Reference.MOD_ID))
			ConfigManager.sync(Reference.MOD_ID, Config.Type.INSTANCE);
	}
}
