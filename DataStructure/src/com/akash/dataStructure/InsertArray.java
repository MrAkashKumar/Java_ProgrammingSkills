package com.akash.dataStructure;

public class InsertArray {

	public static void main(String[] args) {
		
		int arr[] = {1, 8, 6, 2, 4, 7, 3, 4};
		
		int length = arr.length;
		
		insertArray(arr, length);
		
		for(int i = 0; i<length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	private static void insertArray(int[] arr, int length) {
		
		int pos = 4; int insert = 12;
		
		for(int i = length-1; i<=(pos-1); i++) {
			
			arr[i+1] = arr[i];
		}
		arr[pos-1] = insert;
		
	}

}
