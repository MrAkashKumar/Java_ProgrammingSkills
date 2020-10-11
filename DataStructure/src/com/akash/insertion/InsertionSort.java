package com.akash.insertion;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO 
		int arr[] = {1, 4, 10, 7, 6};
		insertionSort(arr);
		for(int i = 0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

	private static void insertionSort(int[] arr) {
		// TODO 
		int temp, j;
		for(int i = 1; i<arr.length; i++) {
			temp = arr[i];
			j= i;
			while(j>0 && arr[j-1]>temp) {		
				arr[j] = arr[j-1];
				j = j-1;
			}
			arr[j] = temp;
		}
	}
}