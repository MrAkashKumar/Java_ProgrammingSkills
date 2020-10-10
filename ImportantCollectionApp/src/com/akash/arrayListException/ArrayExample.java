package com.akash.arrayListException;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO 
		
		int array[] = new int[5];
		for(int i = 5; i>0; i--)
			array[5-i] = i;
			Arrays.fill(array, 1,4,8);
			for(int i = 0; i<5; i++) {
				System.out.print(array[i]);
			}
		

	}

}
