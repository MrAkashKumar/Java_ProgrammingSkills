package com.akash.palindromeInteger;

public class Palimdrone {

	public static void main(String[] args) {
		// TODO 
		int n = 545;
		int sum = 0;
		int remider;
		int temp;
		
		temp = n;
		while(n>0) {
			remider = n%10;
			sum = (sum*10)+remider;
			n = n/10;
		}
		if(temp == n) {
			System.out.println(n+"  is palimdrone number ");
		}else {
			System.out.println(n + " is not palimdrone number ");
		}
	}
}
