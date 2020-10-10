package com.akash.commonprogram;

import java.util.HashMap;
import java.util.Map;

public class CountCharacter {

	public static void main(String[] args) {
		
		String str = "Akash is a software engineer";
		
		String s [] = str.split("");
		
		Map<String, Integer> map = new HashMap<>();
		for(int i = 0; i<s.length; i++) {
	
		if(!" ".equalsIgnoreCase(s[i])) { 
			if(map.containsKey(s[i])) {
				int count = map.get(s[i]);
				map.put(s[i], count+1);
			}else {
				map.put(s[i], 1);
			}
		}
		}
		
		System.out.println(map);
	}
}