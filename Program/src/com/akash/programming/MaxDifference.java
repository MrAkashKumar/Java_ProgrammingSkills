package com.akash.programming;

public class MaxDifference {
	
	public static void main(String[] args) {
		
		int arr[] = {4, 6, 7, 6, 12, 45, 75, 23};
		
		System.out.println("Size :: "+ arr.length);
		int result = maxDifference(arr, arr.length);
		
		System.out.println("Final Max Differece :: "+result);
		
	}
	
	static int maxDifference(int arr[], int arraySize) {
		
		int max = arr[1]- arr[0];
		int i, j;
		
		for(i= 0; i<arraySize; i++) {
			for(j = i+1; j<arraySize; j++) {
				
				if(arr[j]-arr[i]> max) {
					max = arr[j]-arr[i];
				}
			}
		}
		return max;
	}
}