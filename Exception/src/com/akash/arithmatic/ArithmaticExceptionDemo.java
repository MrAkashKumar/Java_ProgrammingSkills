package com.akash.arithmatic;

public class ArithmaticExceptionDemo {

	public static void main(String[] args) {
		// TODO 
		try {
			System.out.println("My channel is favorite...."); // execute
			
			int c = 10/0; // exception
			System.out.println("Result : "+ c);
			
		}finally {
			System.out.println("I am finally block"); // execute
		}
		
		System.out.println("Hey Everyone");
		System.out.println("Pls help me !!!!!!!!!");

	}

}
