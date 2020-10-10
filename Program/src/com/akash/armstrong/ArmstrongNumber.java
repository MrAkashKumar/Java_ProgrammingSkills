package com.akash.armstrong;

import java.util.Scanner;

public class ArmstrongNumber {

	/*Enter 153 and check ArmStrong: 1*1*1+5*5*5+3*3*3 = 153 it is Armstrong number*/
	
	public static void main(String[] args) {
		
		int sum = 0, remainder, digit = 0, originalNumber;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to check if it is Armstrong Number ");
		int n = scanner.nextInt();
		
		originalNumber = n;
		
		while (originalNumber!=0) {
			digit++;
			originalNumber = originalNumber/10;
		}
		originalNumber = n;
		
		while(originalNumber!=0) {
			remainder = originalNumber%10;
			sum = sum + power(remainder, digit);
			originalNumber = originalNumber/10;
			
		}
		if(n == sum)
			System.out.println(n + " is an Armstromng Number");
		else
			System.out.println(n + " is not Armstrong Number ");
		scanner.close();
		
	}
	static int power(int r, int d) {
		int p = 1;
		for(int c = 1; c<=d; c++)
			p = p*r;
			
		return p;
	}

	//output :
}
