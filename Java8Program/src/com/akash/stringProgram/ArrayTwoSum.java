package com.akash.stringProgram;

public class ArrayTwoSum {
	
	public static void main(String[] args) {
		
		int arr[] = {12, 11, 4, 5};
		int target = 9;
		
		int length = arr.length;
		
		//sortedSum(arr, length);
		int temp = 0;
		for(int i = 0; i<length; i++) {
			for(int j = i+1; j<=length; j++) {
				if(j<=length-1) {
					temp = arr[i]+arr[j];
				}else {
					temp = arr[i]+arr[j-length];
				}
			}
			if(temp == target) {
				System.out.println("Find Value : "+temp);
				break;
			}
		}
		/*if(temp == target) {
			System.out.println(temp);
		}else {
			System.out.println("Not Found");
		}*/
		
	}

	/*private static void sortedSum(int[] arr, int length) {
		
		int temp; 
		for(int i = 0; i<length; i++) {
			for(int j = i+1; j<length; j++) {
				if(arr[i]< arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}*/
}
