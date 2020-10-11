package com.akash.programming;

public class FindSecondLargest {
	
	public static void main(String[] args) {
		
		int str [] = {25, 14, 63, 95, 12, 3, 48};
		
		int length = str.length;
		
		int secondhighest = findSecondLarge(str, length);
		
		System.out.println("second highest number "+ secondhighest);
	}

	private static int findSecondLarge(int[] arr, int length) {
		
		int temp;
		
		for(int i = 0; i<length; i++) {
			for(int j = i+1; j<length; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println(arr[0]);
		return arr[length-2];
	}

}
