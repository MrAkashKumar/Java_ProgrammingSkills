package com.akash.rangeJava8Program;

import java.util.stream.IntStream;

public class SumAllRangeNumber {

	public static void main(String[] args) {
		// TODO 
		System.out.println("Find sum of all between 1 to 5");
		getSumValueOfGivenNum();
		System.out.println("fina sum of all even number between 1 to 10");
		getSumAllEvenNumber();	
	}

	private static void getSumAllEvenNumber() {
		// TODO 
		int sumValue = IntStream.of(1,6,8,4,12,13,14,17,19,37).filter(e -> e%2==0).sum();
		System.out.println("All Even number value : "+sumValue);
	}

	private static void getSumValueOfGivenNum() {
		// TODO 
		int sum = IntStream.of(1,6,8,5,36,12).sum();
		System.out.println(sum);
	}

}
