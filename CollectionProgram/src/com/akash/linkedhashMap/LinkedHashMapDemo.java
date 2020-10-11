package com.akash.linkedhashMap;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO 
		
		LinkedHashMap<Integer, String> link = new LinkedHashMap<>();
		link.put(1, "A");
		link.put(5, "E");
		link.put(3, "C");
		link.put(2, "B");
		link.put(4, "D");
		
		System.out.println(link);
		
		String value = link.get(4);
		System.out.println(value);
		
		value = link.getOrDefault(5, "EOP");
		
		System.out.println("Add Value : "+value);
		
		// Iteration Example
		for(Map.Entry<Integer, String> entry : link.entrySet()) {
			System.out.println("Key : "+entry.getKey()+ " Value : "+entry.getValue());
		}	
		System.out.println(link.containsKey(5));// true
		System.out.println(link.containsValue("C")); // true
	}
}
