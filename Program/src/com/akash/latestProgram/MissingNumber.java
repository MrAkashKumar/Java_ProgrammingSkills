package com.akash.latestProgram;

public class MissingNumber {
	
	public static void main(String[] args) {
		
		
		int a [] = {2, 3,4, 5, 1, 9,6, 8};
		int getValue = getMissingNumbr(a, a.length);
		
		System.out.println(getValue);
	}

	private static int getMissingNumbr(int[] a, int length) {
		// TODO 
		
		int total = (length+1)*(length+2)/2;
		
		for(int i =0; i<length; i++) {
			total = total -a[i];
		}
		
		return total;
	}

}
