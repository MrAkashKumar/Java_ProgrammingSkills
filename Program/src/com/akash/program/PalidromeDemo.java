package com.akash.program;

import java.util.ArrayList;
import java.util.Collections;

public class PalidromeDemo{
			/*454 is a palidrome*/
	
	public static void main(String[] args) {
		
		int remainder, sum = 0, temp;
		
		int n = 454;
		/*value transfer*/ 
		temp = n;
		
		while(n>0) {
			remainder = n % 10;
			sum = (sum*10)+remainder;		
		}
		if(temp == sum) {
			System.out.println("is Palidrome number : "+ sum);
		}else {
			System.out.println("is not Palidrome number : "+ sum);
		}
		Collections.sort(new ArrayList<String>());
		System.out.println("Hello - - - - - - -- - - - - ");
	}	
}