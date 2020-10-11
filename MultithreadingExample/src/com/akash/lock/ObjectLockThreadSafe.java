package com.akash.lock;

public class ObjectLockThreadSafe {
	
	public void demoMethod() {
		synchronized (this) {
			// Other thread safe
		}
	}
}