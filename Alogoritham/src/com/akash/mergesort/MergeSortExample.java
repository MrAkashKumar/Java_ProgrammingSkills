package com.akash.mergesort;

public class MergeSortExample {

	public static void main(String[] args) {
		// TODO 
		int arr[]= {4,6,8,16,2,7,21,63,41};
		int first = 0;
		int last = arr.length-1;
		mergeSort(arr, first, last);
	}

	private static void mergeSort(int[] arr, int first, int last) {
		// TODO Auto-generated method stub
		
		if(first<last) {
			int middle = (first+last)/2;
			mergeSort(arr, first, middle);
			mergeSort(arr, middle+1, last);
			merge(arr, first, middle, last);
		}	
	}

	private static void merge(int[] arr, int first, int middle, int last) {
		// TODO Auto-generated method stub
		
		int lengthLeft =  middle-first+1;
		int lengthRight =  last-middle;
		
		int[] left = new int[lengthLeft+1];
		int[] right = new int[lengthRight+1];
		
		for(int i = 0; i<lengthLeft; i++) {
			left[i] = arr[first+i];
		}
		
		for(int i = 0; i<lengthRight; i++) {
			right[i] = arr[middle+i+1];
		}
		
		left[lengthLeft] = Integer.MAX_VALUE;
		left[lengthRight] = Integer.MIN_VALUE;
		
		int leftPointer = 0;
		int rightPointer = 0;
		
		for(int i = first; i<=last; i++) {
			if(left[leftPointer] > right[rightPointer]) {
				arr[i] = right[rightPointer];
				rightPointer++;
			}else {
				arr[i] = left[leftPointer];
				leftPointer++;
			}
		}
	}
}