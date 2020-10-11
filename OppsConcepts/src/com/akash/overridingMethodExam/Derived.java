package com.akash.overridingMethodExam;

public class Derived extends Base{

	public static  void get() {
		System.out.println("Derived HEllo");
	}
	public void print() {
		System.out.println(" Derived Its print method..Non static or instance method from Derived..");
	}
	
}
