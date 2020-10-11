package com.akash.programming;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		
		int sum = 0, r, temp;
		
		int n = 153;
		
		temp = n;
		
		while(n>0) {
			
			r = n%10;
			sum = sum+ (r*r*r);
			n = n/10;
		}
		
		if(temp == sum) {
			System.out.println("That is ArmStrong Number");
		}else {
			System.out.println("That is not ArmStrong Number");
		}
		
	}

}
