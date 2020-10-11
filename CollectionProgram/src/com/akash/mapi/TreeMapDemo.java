package com.akash.mapi;


import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(2, "Akash");
		treeMap.put(6, "Priya");
		treeMap.put(4, "Ravi");
		treeMap.put(5, "Dev");
		
		System.out.println(treeMap);
		
		for(Map.Entry<Integer, String> entry : treeMap.entrySet())
			System.out.println("key : = "+entry.getKey()+ " , Value = "+ entry.getValue());
	}

}
