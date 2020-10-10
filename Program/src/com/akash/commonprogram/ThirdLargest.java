package com.akash.commonprogram;

public class ThirdLargest {

	public static void main(String[] args) {
		// TODO 
		
		int a[] = {5,63,87,95,23,47,2};
		int b[] = {52,59,64,107,99,53,7,72};
		int length = a.length;
		int bLength= b.length;
		System.out.println("Third largest : " +getThirdLargest(a, length));
		System.out.println("Third largest : " +getThirdLargest(b, bLength));
		
		System.out.println(length + "  length of a ");
		System.out.println(bLength + "  length of b ");
	}

	public static int getThirdLargest(int []a, int total) {
		int temp;
		for(int i = 0;i<total;i++) {
			for(int j = i+1; j<total; j++) {
				if(a[i] > a[j]) {
					temp = a[j];
					a[i] = a[j];
					a[j] = temp;
				}
			}	
		}		
		return a[3];
	}
}