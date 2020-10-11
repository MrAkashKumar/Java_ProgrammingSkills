package com.akash.programming;

public class PalidromeNumber {
	
	/*Example : 454 = 454 that reverse number*/
	/*% :: Modulus*/

	public static void main(String[] args) {
		
		int r, sum = 0;
		int n = 454;
		
		int temp = n;
		while(n>0) {
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		
		if(temp == sum) 
			System.out.println("Is Palidrome Number");
		else
			System.out.println("Not Palidrome Number");		
	}
}
