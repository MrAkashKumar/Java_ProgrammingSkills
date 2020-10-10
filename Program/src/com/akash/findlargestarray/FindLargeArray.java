package com.akash.findlargestarray;

public class FindLargeArray {
	
	static int arr [] = {10, 100, 200, 50, 30};
	static int largest() {
		int i;
		int max = arr[0];
		for(i = 1; i<arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
		return max;
	}
	public static void main(String[] args) {

		System.out.println("Largest in given array : "+ largest());
	}
	// output Largest in given array : 100
}