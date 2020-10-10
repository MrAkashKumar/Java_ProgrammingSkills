package com.akash.primenumber;

import java.util.Scanner;

public class PrimeNumber {

	// % is remainder representation
	// / is division representation
	public static boolean isPrime(int n) {
		for(int i = 2; i<n; i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		if(isPrime(number))
			System.out.println(" is prime number ");
		else
			System.out.println(" is not prime number ");
		scanner.close();
	}
}