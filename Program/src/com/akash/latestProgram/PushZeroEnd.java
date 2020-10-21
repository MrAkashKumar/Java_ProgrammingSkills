package com.akash.latestProgram;

public class PushZeroEnd {

	public static void pushZeroEndToArray(int arr[], int length) {
		int count = 0;
		
		for(int i = 0; i<length;i++) {
			if(arr[i]!=0) {
				arr[count++] = arr[i];
			}
		}
		while(count < length) {
			arr[count++] = 0;
		}
	}
	public static void main(String[] args) {
		// TODO
		
		int arr[] = {0,1,4,9,0,6,0,2,0,6,0,0};
		int length = arr.length;
		pushZeroEndToArray(arr, length);
		System.out.println("Array after pushing zeros to the back ");
 		for(int i = 0; i<length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
