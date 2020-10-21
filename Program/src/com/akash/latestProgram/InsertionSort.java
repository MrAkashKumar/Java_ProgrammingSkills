package com.akash.latestProgram;

public class InsertionSort {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 5, 4, 8,3, 6, 9};		
		insertedSort(arr);
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}		
	}

	private static void insertedSort(int[] arr) {
		// TODO 
		int temp, j;
		for(int i = 1; i<arr.length; i++) {
			temp = arr[i];
			j = i;
			while(j>0 && arr[j-1]>temp) {
				arr[j] = arr[j-1];
				j = j-1;
			}
			arr[j] = temp;
		}
	}
}