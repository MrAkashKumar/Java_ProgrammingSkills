package com.akash.programming;

public class PrimeNumber {
	
	public static void main(String[] args) {
		if(isPrimeNumber(29)) {
			System.out.println("Is prime number ");
		}else {
			System.out.println("Is not prime number");
		}
	}
	
	static boolean isPrimeNumber(int n) {
		
		for(int i = 2; i<n; i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

}
