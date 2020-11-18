package com.akash.rangeJava8Program;

import java.util.stream.IntStream;

public class AddSumNumberAll {

	public static void main(String[] args) {
		// TODO 
		
		int reduceNumber = IntStream.of(4,5,6,1,3,7).reduce(10, (x,y) -> x+y);
		
		System.out.println(reduceNumber);

	}

}
