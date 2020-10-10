package com.akash.palidrome;

public class PalidromeSeries {

	public static void main(String[] args) {
		
		int number = 121; int reverseNumber = 0, remainder, originalNumber;
		
		originalNumber  = number;
		
		while(number!=0) {
			remainder = number%10;
			reverseNumber = reverseNumber*10+remainder;
			number = number/10;
		}
		if(originalNumber == reverseNumber) {
			System.out.println(originalNumber + " is a palindrome.");
		}else {
			System.out.println(originalNumber + " is not a palindrome....");
		}	
	}
// output 121 is a palindrome Number
}
