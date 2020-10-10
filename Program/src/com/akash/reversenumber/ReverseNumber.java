package com.akash.reversenumber;

public class ReverseNumber {
		/*Palidrome Number*/
	public static void main(String[] args) {
		int n = 121; int reverse = 0, remainder, originalNumber;
		originalNumber = n;
		
		while(n!= 0) {
			remainder = n%10;
			reverse = reverse*10+remainder;
			n = n/10;
			
		}
		System.out.println(reverse +" : "+ " Reverese number of "+ originalNumber);

	}

}
