package com.benzimmer123.hcfclasses.api.objects;

import java.util.Map;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface PlayerClass {

	/**
	 * Add bard energy and do general checks
	 */
	void checkPlayer();

	/**
	 * Get the HCFClass activated
	 *
	 * @return HCFClass
	 * 
	 */
	HCFClass getHCFClass();

	/**
	 * Get the hcfclass name
	 *
	 * @return String
	 * 
	 */
	String getClassName();

	/**
	 * Get the time used
	 *
	 * @return int
	 * 
	 */
	int getTimeUsed();

	/**
	 * Get the bard energy
	 *
	 * @return int
	 * 
	 */
	int getBardEnergy();

	/**
	 * Remove bard energy
	 *
	 * @param int amount
	 * 
	 */
	void removeBardEnergy(int amount);

	/**
	 * Check if a player class is activated
	 *
	 * @return boolean
	 * 
	 */
	public boolean isActivated();

	/**
	 * Get activation time in seconds for that class
	 * 
	 * This is NOT how long the player has left
	 *
	 * @return int
	 * 
	 */
	int getActivationLength();

	/**
	 * Get the time remaining in seconds until activation
	 *
	 * @return int
	 * 
	 */
	int getTimeLeftUntilActivation();

	/**
	 * Get a cooldown from an effect name
	 *
	 * @param String type
	 * 
	 */
	int getCooldown(String type);

	/**
	 * Add a cooldown
	 *
	 * @param String type
	 * @param int amount
	 * 
	 */
	void addCooldown(String type, int amount);

	/**
	 * Get all custom cooldowns
	 *
	 * @return Map of ItemStacks and their end timestamps
	 * 
	 */
	Map<ItemStack, Long> getCooldowns();

	/**
	 * Get a cooldown from an itemstack
	 *
	 * @param ItemStack item
	 * @return int
	 * 
	 */
	int getCooldown(ItemStack item);

	/**
	 * Add a cooldown to an effect/item
	 *
	 * @param ItemStack item
	 * @param int amount
	 * @return int
	 * 
	 */
	void addCooldown(ItemStack item, int amount);

	/**
	 * Set if a player has the invisibility effect
	 *
	 * @param minerInvisibility
	 * 
	 */
	void setMinerInvisibility(boolean minerInvisibility);

	/**
	 * Check if a player has miner invisibility
	 *
	 * @return boolean
	 * 
	 */
	boolean hasMinerInvisibility();

	/**
	 * Get the player
	 *
	 * @return Player
	 * 
	 */
	Player getPlayer();

	/**
	 * Remove the players class
	 */
	void remove();

}