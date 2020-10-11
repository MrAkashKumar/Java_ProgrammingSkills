package com.akash.inheritancestatic;

public class A {
	
	{
		System.out.println("Instance Block of A Parent Class");
	}
	static {
		System.out.println("Static block in A class Parent Class");
	}
	
	public A() {
		// TODO
		System.out.println("Constructor in A Parent Class");
	}
}