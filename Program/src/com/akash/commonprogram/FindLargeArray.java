package com.akash.commonprogram;

public class FindLargeArray {
	
	static int arr [] =  {10, 100, 200, 50, 30, 70};
	
	static int largest() {
		int max = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		System.out.println("largest Number :: "+ largest());
	}
}