package com.akash.commonprogram;

public class FibonaaciSeries {

	public static void main(String[] args) {

		int number = 10; int a=0;
		int b=1;
		int c;
		System.out.print(a+", "+b+", ");
		for(int i = 0; i<number-2; i++) {
			c = a+b;
			a = b;
			b = c;
			
			System.out.print(c+ ", ");
		}
		

	}

}
