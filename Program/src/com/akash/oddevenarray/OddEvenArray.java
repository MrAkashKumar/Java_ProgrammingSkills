package com.akash.oddevenarray;

import java.util.Scanner;

public class OddEvenArray {

	public static void main(String[] args) {

		System.out.println("Enter the value of Size Array");
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		System.out.println("Enter the number");
		int arr[] = new int [size];
		for(int i = 0; i<size;i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i = 0; i<size; i++) {
			if(arr[i]%2==0)
				System.out.println(arr[i]+" is Even number ");
			else
				System.out.println(arr[i]+ " is odd number ");
		}
		
		scanner.close();
	}

}
