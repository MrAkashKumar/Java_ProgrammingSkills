package com.akash.programming;

public class FindLargeNumber {
	
	static int arr[] = {5,7,90, 45, 3};
	
	private static int findLargest(){
		int max = arr[0];
				
		
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		
		return max;
	}
	public static void main(String[] args) {
		
		System.out.println("Find largest number : "+ findLargest());
		
	}
	

}
