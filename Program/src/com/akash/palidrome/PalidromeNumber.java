package com.akash.palidrome;

public class PalidromeNumber {

	public static void main(String[] args) {
		
		int n = 454, t;
		int sum = 0, remainder;
		t = n;
		
		while(n>0) {
			remainder = n%10; // getting remainder
			sum = sum*10+remainder;
			n = n/10;
		}
		if(t == sum) {
			System.out.println("Palidrome Number ");
		}else {
			System.out.println("Not Palidrome Number ");
		}
		// Output
		// 454    <---->  454 is Palindrome Number
	}

}
