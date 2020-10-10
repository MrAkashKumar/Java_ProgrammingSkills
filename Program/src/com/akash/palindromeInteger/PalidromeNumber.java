package com.akash.palindromeInteger;

public class PalidromeNumber {

	public static void main(String[] args) {
		int n = 121; int reverse = 0, remainder, originalNumber;
		originalNumber = n;
		
		while(n!= 0) {
			remainder = n%10;
			reverse = reverse*10+remainder;
			n = n/10;	
		}
		if(reverse == originalNumber)
			System.out.println(reverse + " Number is a Palidrome Number !!!");
		else
			System.out.println(reverse+ " Number is a not Palidrome Number !!!");
	}

}
