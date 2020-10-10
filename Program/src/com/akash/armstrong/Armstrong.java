package com.akash.armstrong;

public class Armstrong {

	public static void main(String[] args) {
		// TODO 
		// Armstrong = 153 : 1*1*1+ 5*5*5 + 3*3*3
		int c= 0, a, temp;
		
		int n = 153;
		temp = n;
		while(n>0) {
			a = n%10;
			n = n/10;
			c = c + (a*a*a);
			
		}
		if(temp == c) {
			System.out.println(c + " is palimdrone number");
		}else {
			System.out.println(c + " is not palimdrone number");
		}
	}
}
