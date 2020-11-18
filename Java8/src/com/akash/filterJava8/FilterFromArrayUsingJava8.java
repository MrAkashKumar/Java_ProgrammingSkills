package com.akash.filterJava8;

import java.util.Arrays;
import java.util.function.IntConsumer;

public class FilterFromArrayUsingJava8 {
	
	public static void main(String[] args) {
		
		int arr [] = {4,6,8,2,9,75,36,41};
		
		Arrays.stream(arr).filter(e-> e>9).forEach(i -> System.out.println(i));
		
		System.out.println("Same result trying anoher ways");
		
		getFilterForLessThan(arr);
		
	}

	private static void getFilterForLessThan(int[] arr) {
		// TODO Auto-generated method stub
		IntConsumer icons = i -> System.out.print(i + " ");
		Arrays.stream(arr).filter(e-> e>9).forEach(icons);
	}

}
