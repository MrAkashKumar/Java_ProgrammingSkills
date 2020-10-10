package com.akash.commonprogram;

public class MaximumDifferArray {
	
	int maxDiff(int arr[], int arrSize) {
		int maxDiff = arr[1] - arr[0];
		int i, j;
		for(i = 0; i<arrSize; i++) {
			for(j = i+1; i<arrSize; j++) {
				if(arr[j]-arr[i]> maxDiff) {
					maxDiff = arr[j]-arr[i];
				}
			}
		}
		return maxDiff;
	}

	public static void main(String[] args) {
		

	}

}
