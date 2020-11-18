package com.akash.rangeJava8Program;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaximunNumOfAllNumber {

	public static void main(String[] args) {
		// TODO 
		System.out.println(" Find maximum of all numbers in IntStream");
		maximumNumberOfAllNumber();
	}

	private static void maximumNumberOfAllNumber() {
		// TODO 
		OptionalInt max = IntStream.of(9,5,4,3,2).max();
		
		System.out.println(max.getAsInt());
		
	}

}
