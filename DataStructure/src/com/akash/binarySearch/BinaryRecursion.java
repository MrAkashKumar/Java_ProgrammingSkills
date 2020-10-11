package com.akash.binarySearch;

import java.util.Scanner;

public class BinaryRecursion {
	
	public static void main(String[] args) {
		int first, middle, last, search;
		System.out.println("Enter the number of Elements");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int array[] = new int[number];
		System.out.println("Enter "+number +" Integers");
		for(int i = 0; i<number; i++) {
			array[i] = scanner.nextInt();
		}
		System.out.println("Enter value to find ");
		search = scanner.nextInt();
		

		
		scanner.close();
		
	}
}
