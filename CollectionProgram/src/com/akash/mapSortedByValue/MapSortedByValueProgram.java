package com.akash.mapSortedByValue;

import java.util.HashMap;
import java.util.Map;

public class MapSortedByValueProgram {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("akash", 1);
		map.put("Akhil", 3);
		map.put("seema", 2);
		
		sortByValue(map);
		SortedByValueAnotherWay(map);
	}

	private static void SortedByValueAnotherWay(HashMap<String, Integer> map) {
		// TODO 
		map.entrySet().stream()
        .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue()))
        .forEach(k -> System.out.println(k.getKey() + ": " + k.getValue()));
	}

	private static void sortByValue(HashMap<String, Integer> map) {
		// TODO 
		map.entrySet().stream()
        .sorted(Map.Entry.<String, Integer>comparingByValue().reversed()) 
        .limit(10) 
        .forEach(System.out::println);
	}

}
