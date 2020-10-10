package com.akash.nofrequency;

import java.util.Scanner;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		System.out.println("Enter the String : ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("Enter the character ");
		char ch = scanner.next().charAt(0);
		int length = str.length();
		int frequency = 0;
		
		for(int i = 0; i<length; i++) {
			if(ch == str.charAt(i)) {
				++frequency;
			}
			
		}
		System.out.println("Repeated Frequency of "+ch+ " = "+ frequency );
		scanner.close();
	}
 // output : Repeated Frequency of A/c to user = A/c to String and user 
}
