package com.akash.substringExample;

import java.util.Scanner;

public class SubStringExample {

	public static void main(String[] args) {

		String substring, input;
		System.out.println("Enter a string ");	
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();
		int length = input.length();
		
		System.out.println("SubString of "+ input+ " are :");
		
		for(int i = 0; i<length; i++) {
			for(int j = 1; j<=length-i; j++) {
				substring = input.substring(i, i+j);
				System.out.println(substring);
			}
		}
		scanner.close();
	}
	// output
//	Enter a string 
//	CEO
//	SubString of CEO are :
//	C
//	CE
//	CEO
//	E
//	EO
//	O
}
