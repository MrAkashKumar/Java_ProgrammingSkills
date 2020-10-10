package com.akash.factorialexample;

public class FactorialUsingBoth {

	// Using Factorial recursion method 
	public static void main(String[] args) {
		System.out.println("Factorial Number : "+ factorial(5));
	}
	
	public static int factorial(int number) {
		
		if(number == 0) {
			return 1;
		}
		return number*factorial(number-1);		
	}
}