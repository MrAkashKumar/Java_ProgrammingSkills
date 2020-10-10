package com.akash.armstrongnumber;

import java.util.Scanner;

public class ArmStrongNumber {
	
	//153 = 1*1*1+5*5*5+3*3*3 = 1+125+27 = 153
	public static void main(String[] args) {

		int count=0 , sum = 0;
		int remainder, original;
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		original = number;
		
		while(original != 0) {
			count++;
			original = original/10;
		}
		original = number;
		
		while(original !=0) {
			remainder = original%10;
			sum = sum+power(remainder, count);
			original = original/10;
		}
		
		if(number == sum) 
			System.out.println(number +" is an ArmStrong Number");
		else
			System.out.println(number + " is not ArmStrong Number");
		
		scanner.close();
	}

	private static int power(int remainder, int count) {
		int p = 1;
		for(int i = 1; i<=count; i++)
			p = p*remainder;
		return p;
	}
	// OutPut
	// Enter a number : 153
	// 153 is an ArmStrong Number
}
