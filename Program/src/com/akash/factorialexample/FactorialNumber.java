package com.akash.factorialexample;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO 
		int n = 5;
		int fact = 1;
		for(int i = 1; i<=n; i++) {
			fact= fact * i;
		}
		System.out.println("factorial : "+ n + " is " + fact);
	}
}
