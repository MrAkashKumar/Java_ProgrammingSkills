package com.akash.program;

import java.util.HashMap;
import java.util.Map;

public class FindDubplicationCharFromString {
	
	public static void main(String[] args) {
		
		String str = "Akash kumar";
		
		
		String[] sp = str.split("");
			
		HashMap<String, Integer> hashmap = new HashMap<>();
		
		for(int i = 0; i<sp.length; i++) {
			
			if(hashmap.containsKey(sp[i])) {
				
				int count = hashmap.get(sp[i]);
				hashmap.put(sp[i], count+1);
			}else {
				hashmap.put(sp[i], 1);
			}
			
		}
		
		for(Map.Entry<String, Integer>  entry: hashmap.entrySet()) {
			System.out.println(entry.getKey()+ " Count no : "+ entry.getValue());
		}
	}

}
