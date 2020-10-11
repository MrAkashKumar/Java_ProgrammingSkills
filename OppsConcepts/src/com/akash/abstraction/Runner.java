package com.akash.abstraction;

public class Runner {
	
	public static void main(String[] args) {
		
		Shape s1 = new Circle("Red", 4.5);
		s1.area();
		/*
		 * Shape Constructor called Circle Constructor 
		*/
		Shape s2 = new Rectangle("Red", 55, 12);
		s2.area();
		
	}
}