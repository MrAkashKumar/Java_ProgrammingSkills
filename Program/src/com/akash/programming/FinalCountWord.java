package com.akash.programming;

import java.util.HashMap;
import java.util.Map;

public class FinalCountWord {
	
	public static void main(String[] args) {
		int count;
		String str = "Hello I am Akash Kumar. and I am Software engineer";
		
		String [] abc = str.split("");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i<abc.length; i++) {
			if(!" ".equalsIgnoreCase(abc[i])) {
				if(map.containsKey(abc[i])) {
					count = map.get(abc[i]);
					map.put(abc[i], count+1);
				}else {
					map.put(abc[i], 1);
				}
			}
		}
		System.out.println(map);
		
		for(Map.Entry<String, Integer> mapEntry :  map.entrySet()) {
			System.out.println("Duplicate Word "+mapEntry.getKey()+ " it value "+mapEntry.getValue());
		}
	}
}