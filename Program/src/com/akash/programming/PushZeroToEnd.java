package com.akash.programming;

public class PushZeroToEnd {
	
	public static void main(String[] args) {
		int num[] = {1,0, 3, 4, 0, 26, 15, 0,6,0,48,75, 12, 0, 5};
		
		pushZero(num, num.length);
		System.out.println("After push ");
		
		for(int i =0; i<num.length; i++) {
			System.out.print(num[i]+ " ");
		}
	}

	private static void pushZero(int[] num, int length) {
		int count = 0;
		
		for(int i = 0; i<length; i++) {
			if(num[i] != 0) {
				num[count++] = num[i];
			}
		}
		while(count<length) {
			num[count++] = 0;
		}		
	}
}