package com.akash.reversestring;

import java.util.Scanner;

public class ReverseStringDemo {

	public static void main(String[] args) {
		String original, reverse = "";
		System.out.println("Enter the String");
		Scanner scanner = new Scanner(System.in);
		original = scanner.nextLine();
		 
		int length = original.length();
		
		for(int i = length-1; i>=0; i--)
			reverse = reverse + original.charAt(i);
	
			System.out.println(reverse + " : It is reverse String");
		
		scanner.close();
	}
}