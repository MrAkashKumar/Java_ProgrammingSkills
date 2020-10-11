package com.akash.classLevelLock;

public class ClassLevelBlock {
	
	public void demoMethod() {
		// Acquire lock on .class level	
		synchronized (ClassLevelBlock.class) {
			//other thread safe
		}
	}
}