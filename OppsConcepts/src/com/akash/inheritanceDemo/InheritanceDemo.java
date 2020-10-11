package com.akash.inheritanceDemo;

public class InheritanceDemo {
	
	protected static int count = 0;
	public InheritanceDemo() {
		count++;
	}
	static int getCount() {
		return count;
	}
	
}
