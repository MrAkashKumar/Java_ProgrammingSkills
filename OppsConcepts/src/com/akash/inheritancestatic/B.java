package com.akash.inheritancestatic;

public class B extends A{
	
	{
		System.out.println("Instance Block of B");
	}
	static {
		System.out.println("Static block in B class");
	}
	
	public B() {
		System.out.println("Constrictor in B");
	}

}
