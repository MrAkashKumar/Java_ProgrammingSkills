package com.akash.dataStructure;

public class SplitArray {
	
	public static void main(String[] args) {
		
		System.out.println(" All the Array ");
		
		int arr[] = {1,55, 6, 7 ,9 ,4, 2, 7};
		int length = arr.length;
		int target = 4;
		splitArray(target, length, arr);
	}

	private static void splitArray(int target, int length, int[] arr) {
		int count = 0;
		int counts = 0;
		int a[] = new int[8];
		int b[] = new int[8];
		
		for(int i = 0; i<target; i++) {
			a[count] = arr[i];	
			count++;
		}
		
		for(int j = target; j<length; j++) {
			b[counts] = arr[j];
			//System.out.println(b[j]+" Value ");
			counts++;
		}


		System.out.println("First Array ....");
		for(int i = 0; i<count; i++) {
			System.out.print(a[i]+" ");
		}
		
		System.out.println("");
		System.out.println("Second Array ....");
		for(int j = 0; j<counts; j++) {
			System.out.print(b[j]+" ");
		}	
	}
}
