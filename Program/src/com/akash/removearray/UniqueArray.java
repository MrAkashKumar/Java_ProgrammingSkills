package com.akash.removearray;

import java.util.Arrays;

public class UniqueArray {

	public static void main(String[] args) {
		uniqueElement(new int[] {0,1,5,2,3,2,5,1,0});
	}
	
	public static void uniqueElement(int [] arr) {
		System.out.print("Original Array : ");
		
		for(int i = 0; i<arr.length; i++)
			System.out.print(" "+ arr[i]+" ");
		
		int noOfElement = arr.length;
		
		for(int i = 0; i<noOfElement; i++) {
			for(int j = i+1; j<noOfElement; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = arr[noOfElement-1];
					noOfElement--;
					j--;
				}
			}
		}
		System.out.println();
		int[] arr1 = Arrays.copyOf(arr, noOfElement);
		System.out.print("Array with unique element : ");
		for(int i = 0; i< arr1.length; i++) {
			System.out.print(" "+arr1[i]+ " ");
		}
		System.out.println();
		System.out.println("-----------------");
	}
}
