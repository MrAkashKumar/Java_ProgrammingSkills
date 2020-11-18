package com.akash.rangeJava8Program;

import java.util.stream.IntStream;

public class CountNumberRecordGreaterthanTwo {
	
	public static void main(String[] args) {		
		getGreaterNumberCount();
	}

	private static void getGreaterNumberCount() {
		// TODO 
		long countValue = IntStream.of(4,5,6,8,3, 1).filter(n -> n>2).count();	
		System.out.println("All count value :: "+countValue);
	}
	
}