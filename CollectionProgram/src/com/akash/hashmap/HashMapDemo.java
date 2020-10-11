package com.akash.hashmap;

import java.util.HashMap;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(1, "Hello");
		hashmap.put(2, "ravi");
		hashmap.put(3, "deepak");
		hashmap.put(4, "rahul");
		
		//System.out.println(hashmap);
		
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(6, "D");
		map.put(5, "E");
		
		hashmap.putAll(map);
		
		System.out.println(hashmap);
	}
}
