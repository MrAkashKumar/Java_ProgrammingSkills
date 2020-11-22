package com.akash.trappingRainWater;

public class FindWaterFromArray {

	public static void main(String[] args) {
		// TODO 
		
		int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int getValue = getWater(arr, arr.length);
		System.out.println(getValue);

	}

	private static int getWater(int[] arr, int length) {
		// TODO 
		int result = 0;
		
		int left = 0; int right = 0;
		int low = 0; int high = length-1;
		
		while(low<=high) {
			if(arr[low]<arr[high]) {
				if(arr[low]>left) {
					left = arr[low];
				}else {
					result += left -arr[low];
					low++;
				}		
			}else {
				if(arr[high]> right) {
					right = arr[high];
				}else {
					result += right-arr[high];
					high--;
				}
			}
		}
		return result;
	}
}