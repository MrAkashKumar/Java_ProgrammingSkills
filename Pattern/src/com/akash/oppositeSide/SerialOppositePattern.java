package com.akash.oppositeSide;

public class SerialOppositePattern {

	public static void main(String[] args) {

		int n = 5;
		for(int i = 1 ; i<=n ; i++) {
			for(int j =n ; j>n-i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
