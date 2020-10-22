package com.akash.singletonforThread;

public class SingletonThreadEnviroment {

	private static volatile SingletonThreadEnviroment singletonInstance = null;
	
	private SingletonThreadEnviroment() {}
	
	public static SingletonThreadEnviroment getInstance() {
		if(singletonInstance == null) {
			synchronized(SingletonThreadEnviroment.class) {
				if(singletonInstance == null) {
					singletonInstance = new SingletonThreadEnviroment();
				}
			}	
		}
		return singletonInstance;
	}
}
