package com.akash.latestProgram;

import java.util.Scanner;

public class ReverseStringORPalidrome {

	public static void main(String[] args) {

		reverseNumberPalidrome();
		String original, reverse = "";
		System.out.println("Enter the String");
		Scanner scanner = new Scanner(System.in);
		original = scanner.nextLine();
		int length = original.length();
		
		for(int i=length-1; i>=0; i-- ) {
			reverse = reverse + original.charAt(i);
		}
		System.out.println("reverse String is a : "+ reverse );
		scanner.close();
	}

	private static void reverseNumberPalidrome() {
		// TODO 
		int n = 121; int reverse = 0, remainder, originalNumber;
		originalNumber = n;
		while(n!= 0) {
			remainder = n%10;
			reverse = reverse*10+remainder;
			n = n/10;
		}
		System.out.println(reverse +" : "+ " Reverese number of "+ originalNumber);	
	}
}