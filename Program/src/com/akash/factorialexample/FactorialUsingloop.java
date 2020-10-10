package com.akash.factorialexample;

public class FactorialUsingloop {

	public static void main(String[] args) {
		
		System.out.println(" Factroial Number : "+ fact(6));
		
	}
	public static int fact(int number) {
		int result = 1;
		while(number!=0) {
			result = result*number;
			number--;
		}

		return result;
	}

}
