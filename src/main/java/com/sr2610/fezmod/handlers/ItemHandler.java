package com.sr2610.fezmod.handlers;

import com.sr2610.fezmod.config.ConfigHandler;
import com.sr2610.fezmod.items.ModItems;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ItemHandler {

	@SubscribeEvent
	public void FezDeathEvent(LivingDeathEvent event) {
		if (ConfigHandler.fezRegen)
			if (event.getEntityLiving() instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) event.getEntityLiving();
				if (player.inventory.armorItemInSlot(3) != null
						&& player.inventory.armorItemInSlot(3).getItem() == ModItems.itemFez) {
					player.addPotionEffect(new PotionEffect(Potion.getPotionById(10), 20, 40));
					event.setCanceled(true);
					player.setHealth(1.0F);
					player.inventory.armorItemInSlot(3).damageItem(player.inventory.armorItemInSlot(3).getMaxDamage(),
							player);
				}
			}
	}

}
