package com.akash.printPattern;

public class PrintPatternStar {

	public static void main(String[] args) {
		int n = 5;
		//
		int i, j;
		for(i = 0; i<n; i++) {
			for( j = 1+i; j<=n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(i=n-1; i>0;i--) {
			for(j=i; j<=n; j++ ) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
