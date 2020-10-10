package com.akash.hashset;

import java.util.Arrays;
import java.util.HashSet;

public class ConvertHashSet {

	public static void main(String[] args) {
		// TODO 
		HashSet<String> hashset = new HashSet<>();
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("D");
		hashset.add("E");
		hashset.add("F");
		
		String [] value = new String [hashset.size()];
		hashset.toArray(value);
		System.out.println(Arrays.toString(value));

	}

}
