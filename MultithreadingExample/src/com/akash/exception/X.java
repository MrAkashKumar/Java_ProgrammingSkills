package com.akash.exception;

public class X {
	
	public static void main(String[] args) {
		//badMethod();
		int a = 10;
		change(a);
		System.out.println(a);
		System.out.println("C");
	}

	private static void change(int a) {
		
		a = 20;
		
	}
	
	
	
	

}
