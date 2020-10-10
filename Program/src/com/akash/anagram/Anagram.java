package com.akash.anagram;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		String str1, str2;
		int found = 0, not_found = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first string");
		str1 = scanner.nextLine();
		System.out.println("Enter the Second String");
		str2 = scanner.nextLine();
		
		int length1 = str1.length();
		int length2 = str2.length();
		
		if(length1 == length2) {
			int length = length1;
			for(int i = 0; i<length; i++) {
				found = 0;
				for(int j = 0; j<length; j++) {
					if(str1.charAt(i)==str2.charAt(j)) {
						found = 1;
						break;
					}
				}
				if(found == 0) {
					not_found = 1;
					break;
				}
			}
			if(not_found == 1) {
				System.out.println("String are not Anagram to Each Other !!!!");
			}else {
				System.out.println("String are Anagram");
			}
		}
		else
			System.out.println("Both String must have the same number of character to be an Anagram");

		scanner.close();
	}

	// output 
//	Enter the first string
//	creative
//	Enter the Second String
//	reactive
//	String are Anagram
}
