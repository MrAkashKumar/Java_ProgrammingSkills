package com.akash.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Abc");
		map.put(2, "Ram");
		map.put(3, "hare");
		map.put(4, "Krishna");
		map.put(5, "God");
		
		System.out.println(map);
		
		for(Map.Entry<Integer,String> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
	}

}
