package com.akash.designPattern;

public class Singleton {
	
	private static Singleton singleton = null;
	//private static Singleton singleton = null;	
	
	private Singleton() {
		// constructor
	}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}		
		return singleton;
	}
}