package com.akash.stringProgram;


public class LargestSum {
	
	public static void main(String[] args) {
		
		int str [] = {1,3,5,6,7,12,14,2,3,4};
		
		int length = str.length;
		
		 maximunSum(str, length);
		//System.out.println("Maximum Sum find Out  :: "+sum);
		
	}

	private static void maximunSum(int[] arr, int length) {
		
		int temp;
		
		
		for(int i = 0; i<length; i++) {
			for(int j = i+1; j<length; j++) {
				if(arr[i]> arr[j]) {
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp ;
				}
			}
		}
		System.out.println(arr);
		
		int sum = arr[length-1]+arr[length-2]+arr[length-3];
		System.out.println(sum);
			
	}

	

}
