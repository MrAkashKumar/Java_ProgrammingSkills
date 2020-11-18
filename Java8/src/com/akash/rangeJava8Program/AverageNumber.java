package com.akash.rangeJava8Program;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class AverageNumber {
	
	public static void main(String[] args) {
		getAverageNumber();
		getAllAverageGivenNumber();
	}

	private static void getAllAverageGivenNumber() {
		// TODO 
		OptionalDouble doubleValue = IntStream.range(1, 5).average();
		System.out.println("Range Value : "+ doubleValue.getAsDouble());
		
	}

	private static void getAverageNumber() {
		// TODO 
		OptionalDouble doubleValue = IntStream.of(5,6,8).average();
		System.out.println("Given DoubleValue Number "+doubleValue.getAsDouble());
	}

}
