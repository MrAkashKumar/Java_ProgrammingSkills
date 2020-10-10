package com.akash.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO 
		HashSet<String> hashset = new HashSet<>();
		
		hashset.add("A");
		hashset.add("B");
		hashset.add("C");
		hashset.add("D");
		hashset.add("E");
		hashset.add("F");
		
		System.out.println(hashset);
		
		// check if element exist
		
		boolean found = hashset.contains("A");
		System.out.println(found); // true
		
		// remove from element
		hashset.remove("E");
		System.out.println(hashset); // 
		
		// Iterating over values
		Iterator<String> iterator = hashset.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next()); // 
		}
	}
}