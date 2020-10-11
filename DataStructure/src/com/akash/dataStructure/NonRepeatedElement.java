package com.akash.dataStructure;

public class NonRepeatedElement {
	
	public static void main(String[] args) {
		int arr[] = {5,4,3,5,4};
		int length = arr.length;
		
		int non[] = new int[length];
		nonReatedElement(arr, length, non);
	
		for(int i = 0; i<length; i++) {
			System.out.print(non[i]+" ");
		}
	}

	private static void nonReatedElement(int[] arr, int length, int[] non) {
		int count;
				
		for(int i = 0; i<length; i++) {
			count=1;
			for(int j = i+1; j<length; j++) {
				if(arr[i]==arr[j]) {
					count++;
					break;
				}
			}
			 
			if(count==1) {
				non[i] = arr[i];
			}
		}
	}
}