package com.akash.treeMap;

import java.util.Collections;
import java.util.TreeMap;

public class TreeMapReverse {
	
	public static void main(String [] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>(Collections.reverseOrder());
		treeMap.put(3, "C");
		treeMap.put(4, "D");
		treeMap.put(1, "A");
		treeMap.put(2, "B");
		treeMap.put(5, "E");
		
		System.out.println(treeMap);
		
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(3, "C");
		map.put(4, "D");
		map.put(1, "A");
		map.put(2, "B");
		map.put(5, "E");
		
		System.out.println(map);
		
		
		// Reverse Order
	}

}
