package com.akash.dataStructure;

public class SortingAsc {

	public static void main(String[] args) {
		
		int arr[] = {15,48,12,2,63,47,6,8,74,51,31};
		
		int length = arr.length;
		
		sortedAsc(arr, length);
		
		System.out.println("Sorted Array : ");
		
		for(int i = 0; i<length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

	private static void sortedAsc(int[] arr, int length) {
		int temp = 0;
		
		for(int i = 0; i<length; i++) {
			for(int j = i+1; j<length; j++) {
				if(arr[i]< arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;				
				}
			}
		}
	}
}