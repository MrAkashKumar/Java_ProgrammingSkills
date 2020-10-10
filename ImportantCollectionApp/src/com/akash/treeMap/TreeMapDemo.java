package com.akash.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap<Integer, String> tree = new TreeMap<>();
		
		tree.put(1, "A");
		tree.put(3, "C");
		tree.put(2, "B");
		tree.put(4, "D");
		
		System.out.println(tree); // Sorted Natural order
		String value = tree.get(6); // null
		String value1 = tree.get(4); // D
		System.out.println(value+ " :  " +value1);
		value = tree.getOrDefault(6, "Oops"); // Oops
		value1 = tree.getOrDefault(4, "Oops"); // D
		System.out.println(value + " : "+value1);
		
		// Iterator 
		
		for(Map.Entry<Integer, String> entry : tree.entrySet()) {
			System.out.println("Key : "+entry.getKey()+"  Value :"+entry.getValue());
		}
		
		tree.remove(2);
		System.out.println(tree);
		
	}
}
