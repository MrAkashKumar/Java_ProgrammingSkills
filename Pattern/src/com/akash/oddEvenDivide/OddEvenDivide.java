package com.akash.oddEvenDivide;

public class OddEvenDivide {

	public static void main(String[] args) {

		int n = 5;
		for(int i = 1; i<=n ; i++) {
			for(int j = 0; j<i; j++) {
				int k = (i-j)%2;
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
