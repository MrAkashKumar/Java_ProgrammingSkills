package com.akash.programming;

import java.util.ArrayList;
import java.util.List;

public class FindUniqueElement {

	public static void main(String[] args) {
		int arr1[] = new int[] {1, 2, 3, 5, 6 ,8};
		int arr2[] = new int[] {5, 6, 7, 8};
		
		boolean contains = false;
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					contains = true;
					break;
				}
			}
			if(!contains) {
				list.add(arr1[i]);
			}else {
				contains = false;
			}
		}
	}
}
