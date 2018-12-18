package com.akash.diagonal;

public class NumberPatternSeries {

	public static void main(String[] args) {
		int m = 4;
		int n = 5;
		for(int i = 1; i<=n; i++) {
			for(int j = n-i; j>0; j--)
				System.out.print(" ");
			for(int k =1 ; k<=i; k++)
				System.out.print(k+" ");
			System.out.println("");
		}
		
		for(int i = 1; i<=m; i++) {
			for(int j = i; j>0; j--)
				System.out.print(" ");
			for(int k = 1; k<=n-i; k++)
				System.out.print(k+" ");
			
			System.out.println("");
		}

	}

}
