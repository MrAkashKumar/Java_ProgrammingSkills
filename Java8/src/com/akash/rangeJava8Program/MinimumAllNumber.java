package com.akash.rangeJava8Program;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MinimumAllNumber {

	public static void main(String[] args) {
		// TODO 
		getAllMinimumNumber();
	}

	private static void getAllMinimumNumber() {
		// TODO 
		OptionalInt intValue = IntStream.of(5,6,8,3,12,15).min();
		
		System.out.println("Minimum value  :: "+intValue.getAsInt());
	}

}
