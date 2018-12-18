package com.akash.diamondPattern;

public class DiamondPattern {

	public static void main(String[] args) {
		int n = 6;
		int m = 5;
		
		for(int i = 1; i<=n; i++) {
			for(int j = n-i; j>0; j--)
				System.out.print(" ");
			for(int k = 1; k<=2*i-1;k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		for(int i = m; i>0; i--) {
			for(int j = n-i; j>0 ; j--)
				System.out.print(" ");
			for(int k = 1; k<=2*i-1; k++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
