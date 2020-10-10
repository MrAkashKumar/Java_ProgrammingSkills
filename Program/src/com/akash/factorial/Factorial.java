package com.akash.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int  fact =  1;
		System.out.println("Enter an Number ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		if(n<0)
			System.out.println("Number should be non-negative !!!");
		else {
			for(int i = 1; i<=n; i++) {
				fact = fact*i;
				
			}
			System.out.println("Factorial of  "+ n+ " is : " +fact);
		}
		
		scanner.close();
		// output
		// Enter a number : 5 
		// Factorial number is : 120
	}

}
