package com.akash.pattern;

public class Pattern {

	public static void main(String[] args) {

		for(int i = 10 ; i>=1;i--) {
			for(int k=i;k>=1;k--) {
				System.out.print(" ");
			}
			for(int j = 1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
