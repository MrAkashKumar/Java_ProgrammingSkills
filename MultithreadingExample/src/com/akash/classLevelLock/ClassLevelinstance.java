package com.akash.classLevelLock;

public class ClassLevelinstance {
	
	private final static Object lock= new Object();
	
	public void demoMethod() {
		synchronized (lock) 
		{
			// other thread safe code.....
		}
	}

}
