package com.akash.substringstring;

import java.util.Arrays;
import java.util.Comparator;

public class SubstringInShort {

	public static void main(String[] args) {
		
//		String sub;
//		int length;
//
//		String input[] = {"d", "zddsaaz", "ds", "ddsaa", "dds"};
//		length = input.length;
//		
//		System.out.println(input);
//		for(int i =0;i<length;i++) {
//			for(int j = 1; j<length-1;j++) {
//				sub = input[i].substring(i, i+1);
//				System.out.println(sub);
//			}
//		}
		String [] array = new String[5];
		array[0] = "d";
		array[1] = "zddsaaz";
		array[2] = "ds";
		array[3] = "ddsaa";
		array[4] = "dds";
		
		Arrays.sort(array, new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				String sub1 = str1.substring(5);
				String sub2 = str2.substring(5);
				return Integer.valueOf(sub2).compareTo(Integer.valueOf(sub1));
			}
			
		});
		System.out.println(Arrays.toString(array));
		
	}

}
