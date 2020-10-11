package com.akash.hashmap;

import java.util.HashMap;

public class HashMapADemo {
	
	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1, "A");
		hashMap.put(2, "B");
		hashMap.put(4, "D");
		hashMap.put(3, "C");
		hashMap.put(5, "E");
		hashMap.put(6, "G");
		hashMap.put(7, "F");
		
		System.out.println(hashMap);
		
	}

}
