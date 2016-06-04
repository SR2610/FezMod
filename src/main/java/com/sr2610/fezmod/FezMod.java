package com.sr2610.fezmod;

import com.sr2610.fezmod.items.ModItems;
import com.sr2610.fezmod.proxy.CommonProxy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, version = Reference.VERSION, guiFactory = Reference.GUIFACTORY, updateJSON = Reference.UPDATEJSON)
public class FezMod {

	@SidedProxy(serverSide = Reference.PROXY_COMMON, clientSide = Reference.PROXY_CLIENT)
	public static CommonProxy proxy;

	public static final CreativeTabs tabFezMod = new CreativeTabs(Reference.MOD_ID) {
		@Override
		public Item getTabIconItem() {
			return ModItems.itemFez;
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);

	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);

	}
}
