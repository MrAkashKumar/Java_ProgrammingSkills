package com.akash.java8new;

import java.util.StringJoiner;

public class DelimeterThroughStringJoiner {
	
	public static void main(String[] args) {
		
		StringJoiner joiner = new StringJoiner(",");
		joiner.add("Akash");
		joiner.add("Ravi");
		joiner.add("Rahul");
		joiner.add("Anshit");
		
		System.out.println(joiner);
		
		joiner = new StringJoiner("|");
		
		joiner.add("Rahul");
		joiner.add("Raju");
		joiner.add("Peter");
		joiner.add("Raheem");
		 System.out.println(joiner);

		
	}

}
