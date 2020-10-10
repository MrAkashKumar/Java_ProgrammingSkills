package com.akash.commonprogram;

public class PushZeroEndPoint {
	
	public static void pushZeroEndPoint(int arr[], int length) {
		
		int count = 0;
		for(int i = 0; i<length; i++) {
			if(arr[i]!=0) {
				arr[count++] = arr[i];
			}
		}
		while(count<length) {
			arr[count++] = 0;
		}
	}

	public static void main(String[] args) {
		int arr[] = {0,1,3,5,4,0,7,8,0,0,2,6,0,0,0,9,0};
		
		int length = arr.length;
		pushZeroEndPoint(arr, length);
		System.out.println("Array after pushing zeros ");
		
		for(int i= 0; i<length; i++) {
			System.out.print(arr[i]+ " ");
		}
		

	}

}
