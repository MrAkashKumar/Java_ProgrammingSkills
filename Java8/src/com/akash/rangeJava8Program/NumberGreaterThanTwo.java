package com.akash.rangeJava8Program;

import java.util.stream.IntStream;

public class NumberGreaterThanTwo {
	
	public static void main(String[] args) {
		
		System.out.println("find all number greater than 2 ");
		getAllNumberByGreaterThanTwo();
		System.out.println("----Find all even numbers greater than 2 -----");
		getAllNumGreaterThanTwoEvenNum();
	}

	private static void getAllNumGreaterThanTwoEvenNum() {
		// TODO 
		
		IntStream.of(2,6,8,7,2,12,15,36,13).filter(n -> n>2).filter(n-> n%2==0).forEach(System.out::println);
		
	}

	private static void getAllNumberByGreaterThanTwo() {
		// TODO 
		
		IntStream.of(1, 5, 6, 8, 6, 9).filter(n -> n>2).forEach(System.out::println);
		
	}

}
