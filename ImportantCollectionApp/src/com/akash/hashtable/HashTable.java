package com.akash.hashtable;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTable {
	// its same as like HashMap but it synchronous
	
	public static void main(String[] args) {
		Hashtable<Integer, String> hashTable = new Hashtable<>();
		HashMap<Integer, String> hashmap = new HashMap<>();
		hashmap.put(1, "C");
		hashmap.put(5, "F");
		hashmap.put(4, "A");
		hashmap.put(3, "K");
		hashmap.put(2, "V");
		
		System.out.println("HashMap :: >> "+hashmap);
		
		HashMap<String, String> map = new HashMap<>();
		map.put("Akash", "HeroG");
		map.put("Rahul", "Hello");
		map.put("umesh", "ABCDkl");
		map.put("Vikash", "XYZHN");
		
		System.out.println("HashMap :: > "+map);
		
		// Add Mapping
		hashTable.put(1, "A");
		hashTable.put(2, "B");
		hashTable.put(3, "C");
		hashTable.put(4, "D");
		hashTable.put(6, "K");
		
		System.out.println(hashTable);
		// Get a mapping to hashtable
		String value = hashTable.get(2); 
		System.out.println(value); // B
		
		// removing mapping
		hashTable.remove(3); // C
		System.out.println(hashTable);
		
		// Iterator 
		Iterator<Integer> iterator = hashTable.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			String mappedValue = hashTable.get(key);
			System.out.println("Mapped : "+mappedValue+" Key : "+key);
		}
	}

}
