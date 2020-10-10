package com.akash.palindromeInteger;

import java.util.Scanner;

public class PalindromeInteger {

	public static void main(String[] args) {

		System.out.println("Enter the palidrome Number ");
		Scanner scanner = new Scanner(System.in);
		int palidrome = scanner.nextInt();
		
		if(isPalidrome(palidrome))
			System.out.println(" Number : "+ palidrome+ " is a palidrome");
		else
			System.out.println(" Number : "+ palidrome+ " is not a palidrome");
		
		scanner.close();
	}
	
	public static boolean isPalidrome(int n) {
		int palidrome = n;
		int reverse = 0;
				
				while(palidrome!=0) {
					int remainder = palidrome%10;
					reverse = reverse*10+remainder;
					palidrome = palidrome/10;
				}
		
		if(n == reverse)
		return true;
		else
			return false;
	}

}
