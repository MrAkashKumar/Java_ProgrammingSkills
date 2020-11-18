package com.akash.rangeJava8Program;

import java.util.stream.IntStream;

public class AllEvenNumber {
	
	/*Find all even number between 1 to 15*/
	
	public static void main(String[] args) {
		
		getRangeOfEvenNum();
		getGivenNumberRangeOfEven();
		/* IntPredicate is a functional interface */
		
	}

	private static void getGivenNumberRangeOfEven() {
		// TODO 
		IntStream.of(2,8,9,7,12,16,19).filter(n -> n%2 ==0).forEach(System.out::println);
	}

	private static void getRangeOfEvenNum() {
		// TODO 
		IntStream.range(1, 15).filter(n -> n%2==0).forEach(System.out:: print);
	}
	
}