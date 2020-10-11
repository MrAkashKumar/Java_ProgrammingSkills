package com.akash.designPattern;

public class SingletonDemo {
	
	private static SingletonDemo singleton = null;
	
	private SingletonDemo() {
		// TODO 
	}
	
	public static SingletonDemo getInstance() {
		if(singleton == null) {
			singleton = new SingletonDemo();
		}
		return singleton;
	}

}
