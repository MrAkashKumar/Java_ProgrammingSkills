package com.akash.exceptions;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO 
		getInstances();
	}
	public static void getInstances() {
		// TODO 
		final int  a= 5;
		System.out.println(a);
		try {
			int s= 562;
			System.out.println(s + " try block");
		} finally {
			// TODO: handle finally clause
			String s = "Akash";
			System.out.println("finally "+ s);
		}
		int b = 65;
		System.out.println(b);	
	}
}