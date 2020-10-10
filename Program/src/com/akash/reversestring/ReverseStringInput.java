package com.akash.reversestring;

import java.util.Scanner;

public class ReverseStringInput {

	public static void main(String[] args) {
		String input, reverse= "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		input  = scanner.nextLine();
		
		int inputlength  = input.length();
		
		for(int i = inputlength-1;i>=0;i--) {
			reverse = reverse +input.charAt(i); 

		}
		System.out.println("Reverse String : "+reverse);
		
		scanner.close();
	}

}
