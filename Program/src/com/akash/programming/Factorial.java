package com.akash.programming;

public class Factorial {
	
	/*Complexity : O (1)*/
	
	public static void main(String[] args) {
		int n = 5;
		int finalValue = factorialNumber(n);
		System.out.println("Factorial of " + n +" is "+ finalValue );
	}

	private static int factorialNumber(int n) {
		// TODO Auto-generated method stub
		int fact = 1;
		for(int i = 1; i <=n; i++) {
			fact = fact * i;
		}
		return fact;
	}
}