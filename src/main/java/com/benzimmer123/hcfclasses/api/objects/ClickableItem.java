package com.benzimmer123.hcfclasses.api.objects;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface ClickableItem {

	/**
	 * Get the bukkit itemstack
	 *
	 * @return ItemStack
	 * 
	 */
	ItemStack toItemStack();

	/**
	 * Get remaining cooldown
	 *
	 * @return int
	 * 
	 */
	int getCooldownDelay();

	/**
	 * Add effects to player associated with the item
	 *
	 * @param Player player
	 * 
	 */
	void addEffects(Player player);

	/**
	 * Add another potion effect to this item
	 *
	 * @param String potionEffectType
	 * @param int duration
	 * @param int cooldownDelay
	 * @param int potionEffectAmp
	 * 
	 */
	void addPotionEffect(String potionEffectType, int duration, int cooldownDelay, int potionEffectAmp);

}