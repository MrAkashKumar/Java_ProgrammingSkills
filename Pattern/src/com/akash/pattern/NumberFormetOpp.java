package com.akash.pattern;

public class NumberFormetOpp {

	public static void main(String[] args) {
		int i;
		int n=1;
		for ( i = 10; i>=n; i--) {
			for (int j = 1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
