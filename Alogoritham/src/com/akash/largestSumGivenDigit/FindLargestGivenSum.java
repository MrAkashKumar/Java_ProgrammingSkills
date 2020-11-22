package com.akash.largestSumGivenDigit;

public class FindLargestGivenSum {
	
	public static void main(String[] args) {
		
		int num = 9, n =2;
		findLargestSum(num, n);
	}

	private static void findLargestSum(int num, int n) {
		// TODO 
		
		if(num == 0) {
			System.out.print( n==1 ? "Largest Num is 0 ": "Not Possible");
			return;
		}
		
		if(num > 9*n) {
			System.out.println("Not Possible");
			return;
		}
		
		int res[] = new int[n];
		
		for(int i =0; i<n; i++) {
			if(num>=9) {
				res[i] = 9;
				num = num-9;
			}else {
				res[i] = num;
				num = 0;
			}
		}
		
		System.out.print("largest Number : ");
		for(int i = 0; i<n; i++) {
			System.out.print(res[i]);
		}	
	}
}