package com.sr2610.fezmod.proxy;

import com.sr2610.fezmod.config.ConfigHandler;
import com.sr2610.fezmod.handlers.ItemHandler;
import com.sr2610.fezmod.items.ModItems;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		ModItems.createItems();
		ConfigHandler.initConfig(event);

	}

	public void init(FMLInitializationEvent event) {
		MinecraftForge.EVENT_BUS.register(new ItemHandler());
		MinecraftForge.EVENT_BUS.register(new ConfigHandler());

	}

	public void postInit(FMLPostInitializationEvent event) {

	}

}
