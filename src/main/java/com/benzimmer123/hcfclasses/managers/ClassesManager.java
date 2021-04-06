package com.benzimmer123.hcfclasses.managers;

import com.benzimmer123.hcfclasses.api.objects.HCFClass;

public class ClassesManager {

	/**
	 * Get the armour types from a default class
	 *
	 * @param String defaultClassName
	 * @return String[]
	 * 
	 */
	public String[] getArmour(String defaultClassName) {
		return new String[4];
	}

	/**
	 * Check if a class name is a default class
	 *
	 * @param String className
	 * @return boolean
	 * 
	 */
	public boolean isDefaultClass(String className) {
		return false;
	}


	/**
	 * Get HCFClass from the class name
	 *
	 * @param String className
	 * @return HCFClass
	 * 
	 */
	public HCFClass getClassFromString(String className) {
		return null;
	}

	/**
	 * Delete a cached class
	 *
	 * @param String className
	 * 
	 */
	public void deleteClass(String className) {
	}
}
