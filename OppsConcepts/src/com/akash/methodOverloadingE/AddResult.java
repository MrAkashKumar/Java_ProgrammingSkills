package com.akash.methodOverloadingE;

public class AddResult {
	
	// its example of Method Overloading
	
	public AddResult() {

	}
	
	public int add(int a, int b) {
		return a+b;
	}

//	public int add(int a, int b) {  // it not possible bcz its same method and parameter. its ambuigity issues 
//		
//		return a+b;
//	}
	
	public double add(double a, double b) { // its be different method name is same but different argument
		
		return a-b;
	}
	
	
}
