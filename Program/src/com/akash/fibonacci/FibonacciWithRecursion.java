package com.akash.fibonacci;

public class FibonacciWithRecursion {
	
	// Java Recursion method

	static int n1 = 0, n2= 1, n3= 0;
	public static void printFibonacci(int count) {
		if(count>0) {
			n3 = n1+n2;
			n1 = n2;
			n2 = n3;
			
			System.out.print(" " + n3);
			printFibonacci(count-1);
		}
	}
	public static void main(String[] args) {
		int count = 10;
		System.out.print("Print between : "+ n1+ " "+n2);
		printFibonacci(count-2);
		
	}

}
