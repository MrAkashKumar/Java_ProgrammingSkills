package com.akash.matrixsprial;

import java.util.Arrays;

public class SprialMatrixDemo {

	private static final int m = 5;
	private static final int n = 5;
	
	public static void main(String[] args) {
		// TODO 
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,
						16,17,18,19,20,21,22,23,24,25};
		
		int[][] mat = new int[m][n];
		printsprialMatrixOrder(arr, mat);
		
		for(int[] v : mat) {
			System.out.println(Arrays.toString(v));
		}

	}

	private static void printsprialMatrixOrder(int[] arr, int[][] mat) {
		// TODO 
		
		int top = 0, bottom = m-1; 
		int left = 0, right = n-1;
		
		int index = 0;
		
		while(true) {
			if(left>right) {
				break;
			}
		
			for(int i = left; i<=right; i++) {
				mat[top][i]=arr[index++];
			}
			top++;
			
			if(top>bottom) {
				break;
			}
			
			for(int i = top; i<=bottom; i++) {
				mat[i][right] = arr[index++];
			}
			right--;
			
			
			if(left>right) {
				break;
			}
			for(int i= right; i>=left; i--) {
				mat[bottom][i] = arr[index++];
			}
			bottom--;
			
			if(top>bottom) {
				break;
			}
			
			for(int i= bottom; i>=top; i--) {
				mat[i][left] = arr[index++];
			}
			left++;
			
		}
	}
}