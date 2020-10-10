package com.akash.nofrequency;

import java.util.Scanner;

public class TotalCountFrequency {

	public static void main(String[] args) {
		int count;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = scanner.nextLine();
		int length = str.length();

		for (char c = 'A'; c <= 'z'; c++) {
			count = 0;
			for (int i = 0; i < length; i++) {
				char ch = str.charAt(i);

				if (ch == c) {
					count++;
				}
			}
			if(count>0)
				System.out.println("The Character "+ c+ " of count "+ count);

		}
		// output
		// The Character Char value of sentence of count A/c to number of count string
//		Example: RamKumar
//		Then count  R ---2
//					a ---2
//					m ---2
//					k ---1
//					u ---1
					

		scanner.close();
	}

}
