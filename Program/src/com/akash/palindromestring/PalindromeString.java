package com.akash.palindromestring;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		String original, reverse = "";
		System.out.println("Enter the Palindrome String ");
		Scanner scanner = new Scanner(System.in);
		original = scanner.nextLine();
		int length = original.length();
		
		for(int i = length-1; i>=0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse))
			System.out.println( reverse +" : This is palindrome ");
		else
			System.out.println(reverse +" : This is not palindrome ");	
		scanner.close();
	}
}