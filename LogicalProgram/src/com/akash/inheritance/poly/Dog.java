package com.akash.inheritance.poly;

public class Dog extends Animal{
	int c; // new instance variable of class Dog
	
	public void onEating() {
		// overridden method
		System.out.println("this is method onEating of class Dog");
	}
	public void onAction() {
		super.onEating();
		System.out.println("This is method onAction of class Dog");
	}
	
}
