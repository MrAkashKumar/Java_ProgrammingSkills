package com.akash.lock;

public class ObjectLockOther {
	
	private final Object lock = new Object();
	
	public void demoMethod() {
		synchronized(lock) {
			//Other thread safe
		}
	}
	
	public static void main(String[] args) {
	
		System.out.println("HEllo");
	}

}
