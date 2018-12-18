package com.akash.printCenter;

public class PrintPatternCenter {

	public static void main(String[] args) {

		int n = 5;
		for(int i =1; i<=n; i++) {
			for(int p = 1; p<=i; p++ )
				System.out.print(" ");
			for(int j=i; j<=n;j++) {
				System.out.print(j+" ");
			}
			
			System.out.println();
		}
		
		for(int k = n-1; k>0; k--) {
			for(int p = 1; p<=k; p++ )
				System.out.print(" ");
			for(int j = k ; j<=n; j++) {
				System.out.print(j+" ");
			}
	
			System.out.println();
		}
		
	}

}
