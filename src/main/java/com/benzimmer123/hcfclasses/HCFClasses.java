package com.benzimmer123.hcfclasses;

import com.benzimmer123.hcfclasses.managers.ClassesManager;

public class HCFClasses {

	private static final HCFClasses instance = new HCFClasses();
	private static final ClassesManager classesManager = new ClassesManager();

	public static HCFClasses getInstance() {
		return instance;
	}

	public ClassesManager getClassesManager() {
		return classesManager;
	}

}
