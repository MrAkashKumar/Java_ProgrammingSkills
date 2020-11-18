package com.akash.rangeJava8Program;

import java.util.stream.IntStream;

public class CountAllNumber {

	public static void main(String[] args) {
		// TODO 
		System.out.println("Count number of elements");
		getAllNumberCount();
	}

	private static void getAllNumberCount() {
		// TODO 
		
		long count = IntStream.of(5,3,8,6,2).count();
		
		System.out.println("Count :: "+count);
		
	}

}
