package com.akash.createUnmodifiable;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CreateUnmodifiableExample {

	public static void main(String[] args) {
		// TODO 
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Akash", 2);
		map.put("Ravi", 4);
		map.put("Roshan", 5);
		map.put("Aditya", 7);
		map.put("Anshit", 8);
		map.put("Rahul", 9);
		
		
		Map<String, Integer> unmodifiable = Collections.unmodifiableMap(map);
		System.out.println(unmodifiable);
		
		unmodifiable.put("Deepak", 45);
		
		System.out.println(map);

	}

}
