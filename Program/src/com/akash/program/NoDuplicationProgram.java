package com.akash.program;

public class NoDuplicationProgram {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 5,6,2,6, 8, 1, 3, 4, 2};
		
		printElementWithNoDuplicate(arr, arr.length);
		
	}

	private static void printElementWithNoDuplicate(int[] arr, int length) {
		
		boolean flag [] = new boolean[length];
		int count;
		int x= 0;
		for(int i = 0; i<length; i++) {
			if(!flag[i]) {
				count = 1;
			for(int j = i+1; j<length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					flag[j] = true;
				}
			}
			if(count == 1) {
				System.out.println(arr[i]);
				x++;
			}
		}
		}
 		if(x==0) {
 			System.out.println("All element are repeated");
 		}
	}

}
