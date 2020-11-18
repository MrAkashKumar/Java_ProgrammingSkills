package com.akash.lambdaExpressionProgram;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortStringArrayUsingExpression {
	
	public static void main(String[] args) {	
		sortStringUsingLambda();
		sortIntegerUsingLambda();
	}

	private static void sortIntegerUsingLambda() {
		// TODO 
		String str[] = {"abc", "def", "cde", "ghf", "bcd"};
		
		List<String> list = Arrays.asList(str);
		Collections.sort(list, (a, b) -> a.compareTo(b));
		
		System.out.println("forSorted String :: "+list);
		
	}
	

	private static void sortStringUsingLambda() {
		// TODO 
		Integer i [] = {1, 3, 2, 6, 7,5,4,9,14,12};
		
		/*Ascending order*/
		List<Integer> listForIntegr = Arrays.asList(i);
		Collections.sort(listForIntegr, (a, b) -> a.compareTo(b));
		
		System.out.println("Total Sorted Array "+listForIntegr);
		
		/*find the first biggest value from Array*/
		System.out.println("1st Biggest value from Array : "+listForIntegr.get(i.length-1));
		
		/*find the 2nd biggest value from array*/
		System.out.println("2nd Biggest value : "+ listForIntegr.get(i.length-2));
		
		/*find the smallest value from array*/
		System.out.println("Smallest Value : "+ listForIntegr.get(0));		
	}
}