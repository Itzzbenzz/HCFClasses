package com.benzimmer123.hcfclasses.api.objects;

import java.util.List;
import java.util.Map;

import org.bukkit.inventory.ItemStack;

public interface HCFClass {

	/**
	 * Set the time until class activation
	 *
	 * @param int timeUntilActivation
	 * 
	 */
	void setTimeUntilActivation(int timeUntilActivation);

	/**
	 * Set the hcfclass name
	 *
	 * @param String name
	 * 
	 */
	void setName(String name);

	/**
	 * Set the hcfclass required armour
	 *
	 * @param String[] armour
	 * 
	 */
	void setArmour(String[] armour);

	/**
	 * Add a new effect to this hcfclass
	 *
	 * @param String name
	 * @param int amplifier
	 * 
	 */
	void addEffect(String name, int amplifier);

	/**
	 * Remove a effect from this hcfclass
	 *
	 * @param String name
	 * 
	 */
	void removeEffect(String name);

	/**
	 * Get the time until class activation
	 *
	 * @return int
	 * 
	 */
	int getTimeUntilActivation();

	/**
	 * Get the hcfclass name
	 *
	 * @return String
	 * 
	 */
	String getName();

	public Map<String, Integer> getEffects();

	/**
	 * Get the hcfclass required armour
	 *
	 * @return String[]
	 * 
	 */
	String[] getArmour();

	public ClickableItem clickableExists(ItemStack item);

	/**
	 * Add a new ClickableItem to this hcfclass
	 *
	 * @param ItemStack item
	 * @param String potionEffectType
	 * @param int duration
	 * @param int cooldownDelay
	 * @param int potionEffectAmp
	 * 
	 */
	void addClickableItem(ItemStack item, String potionEffectType, int duration, int cooldownDelay, int potionEffectAmp);

	/**
	 * Remove all ClickableItems stored in this hcfclass
	 */
	void clearClickables();

	/**
	 * Get all ClickableItems stored in this hcfclass
	 *
	 * @return List of ClickableItems
	 * 
	 */
	List<ClickableItem> getClickableItems();

	/**
	 * Get all HeldItems stored in this hcfclass
	 *
	 * @return List of HeldItems
	 * 
	 */
	List<HeldItem> getHeldItems();

	/**
	 * Add a new HeldItem to this hcfclass
	 *
	 * @param ItemStack item
	 * @param String potionEffectType
	 * @param int duration
	 * @param int cooldownDelay
	 * @param int potionEffectAmp
	 * 
	 */
	void addHeldItem(ItemStack item, String potionEffectType, int duration, int cooldownDelay, int potionEffectAmp);

	/**
	 * Remove all HeldItems stored in this hcfclass
	 */
	void clearHeldItems();

	/**
	 * Serialize hcfclass to file
	 */
	public void save();

}