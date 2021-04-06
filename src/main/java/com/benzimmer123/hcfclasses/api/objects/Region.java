package com.benzimmer123.hcfclasses.api.objects;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface Region {

	/**
	 * Check if a player is inside the region
	 *
	 * @return boolean
	 * 
	 */
	boolean isInRegion(Player p);

	/**
	 * Get the region name
	 *
	 * @return String
	 * 
	 */
	String getName();

	/**
	 * Get the 1st region bukkit location
	 *
	 * @return Location
	 * 
	 */
	Location getLocation1();

	/**
	 * Get the 2nd region bukkit location
	 *
	 * @return Location
	 * 
	 */
	Location getLocation2();

	/**
	 * Serialize hcfclass to file
	 */
	void save();

}