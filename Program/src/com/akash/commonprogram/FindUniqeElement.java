package com.akash.commonprogram;

import java.util.ArrayList;
import java.util.List;

public class FindUniqeElement {

	public static void main(String[] args) {

		int [] arr1 = new int[] {1,2,5,6,8,7};
		int [] arr2 = new int[] {1,2,1,4,8,10};
		
		boolean contains = false;
		
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<arr1.length; i++) {
			for(int j = 0; j<arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					contains= true;
					break;
					
				}
			}
			
			if(!contains) {
				list.add(arr1[i]);
			}else {
				contains = false;
			}
		}
		System.out.println(list);
	}

}
