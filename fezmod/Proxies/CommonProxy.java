package fezmod.Proxies;

import net.minecraft.client.model.ModelBiped;
import cpw.mods.fml.common.registry.TickRegistry;
import cpw.mods.fml.relauncher.Side;

public class CommonProxy {
	public ModelBiped getArmorModel(int id){
		return null;
		}

	public void registerServerTickHandler() {
		TickRegistry.registerTickHandler(new ServerTickHandler(), Side.SERVER);
	}
		}

