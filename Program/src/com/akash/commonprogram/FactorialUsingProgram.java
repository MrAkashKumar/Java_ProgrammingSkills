package com.akash.commonprogram;

public class FactorialUsingProgram {

	public static void main(String[] args) {
		System.out.println("Factorial Number : "+factorial(6));

	}
	
	public static int factorial(int number) {
		if(number == 0) {
			return 1;
		}
		return number*factorial(number-1);
	}

}
