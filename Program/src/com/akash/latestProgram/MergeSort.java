package com.akash.latestProgram;

public class MergeSort {
	
	int[] array;
	int[] tempMergeArr;
	int length;

	/*it is basically work divide and conquer 
	 * Recursive method
	 * */
	public static void main(String[] args) {
		// TODO 
		
		int arr[] = {15, 12, 96, 2, 46, 71, 63, 13, 6}; 
		
		MergeSort mergeSort = new MergeSort();
		mergeSort.sort(arr);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

	private void sort(int[] arr) {
		// TODO 
		this.array = arr;
		this.length = arr.length;
		this.tempMergeArr = new int[length];
		divideArray(0, length-1);
	}

	private void divideArray(int lowerIndex, int higherIndex) {
		// TODO 
		
		if(lowerIndex < higherIndex) {
			
			int middle = lowerIndex +(higherIndex-lowerIndex)/2;
			
			/*it will sort the left side of an array*/
			divideArray(lowerIndex, middle);
			
			/*it will sort the right side of an array*/
			divideArray(middle+1, higherIndex);
			
			mergeArray(lowerIndex, middle, higherIndex);
		}				
	}

	private void mergeArray(int lowerIndex, int middle, int higherIndex) {
		// TODO 
		
		for(int i = lowerIndex; i<=higherIndex; i++) {
			tempMergeArr[i] = array[i];
		}
		
		int i = lowerIndex;
		int j = middle+1;
		int k = lowerIndex;
		
		while(i<=middle && j<=higherIndex) {
			
			if(tempMergeArr[i] <= tempMergeArr[j]) {
				
				array[k] = tempMergeArr[i];
				i++;
			}else {
				array[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i<=middle) {
			array[k] = tempMergeArr[i];
			k++;
			i++;
		}
		 
	}
	// To do
}