package com.akash.program;

public class CountOddSum {
	
	public static void main(String[] args) {	
		int arr[] = {4,5,6,8,6,3,7};
		int length = arr.length;
		//System.out.println(length);
		
		int countSum = countOddSumVal(arr, length);
		System.out.println(" ");
		System.out.println(" Total Value "+countSum);
	}

	private static int countOddSumVal(int[] arr, int length) {
		// TODO 
		int value = 0;
		
		for(int i = 0; i<length; i++) {
			int sum =0;
			for(int j = i; j<length; j++) {
					sum = sum + arr[j];
				if(arr[j]%2 !=0) {
					value++;
				}
			}
		}
		return value;
	}
}