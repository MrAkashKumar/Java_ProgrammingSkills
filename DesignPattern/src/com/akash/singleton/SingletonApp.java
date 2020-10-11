package com.akash.singleton;

public class SingletonApp {
	
	private static SingletonApp singletonApp = null;
	
	private SingletonApp() {}
	
	
	public static SingletonApp getInstance() {
		
		if(singletonApp == null) {
			singletonApp = new SingletonApp();
		}
		
		return singletonApp;
	}
	
	

}
