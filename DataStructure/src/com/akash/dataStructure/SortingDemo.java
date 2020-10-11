package com.akash.dataStructure;

public class SortingDemo {
	
	public static void main(String[] args) {
		
		int arr[] = {5,2,7,8,6,9,2,41,15,78,45,61};
		
		int length = arr.length;
		
		sortByDesc(arr, length);
		
		for(int i = 0; i<length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void sortByDesc(int[] arr, int length) {
		
		int temp;
		
		for(int i = 0; i<length; i++) {
			for(int j = i+1 ; j<length; j++) {
				
				if(arr[i]> arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					
					arr[j] = temp;
				}
			}
		}
		
	}

	
}
