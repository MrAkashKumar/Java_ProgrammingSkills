
package com.akash.latestProgram;

public class ArmStrongNumberExample {
	
	public static void main(String[] args) {
		
		int c= 0, r, temp;
		
		int n = 153;
		
		temp = n;
		
		while(n>0) {
			r = n%10;
			c = r+c*c*c;
			n = n/10;
		}
		
		if(temp == c) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not Armstrong number");
		}
	}
}