package com.akash.mapi;

import java.util.HashMap;

public class CharCountOccurance {
	
	public static void main(String arg[]) {
	
		occuranceCountChar("Java is most useful for Developer");
		
	}
	
	static void occuranceCountChar(String str) {
		HashMap<Character, Integer> hashMap = new HashMap<>();
		
		char ch[] = str.toCharArray();
		for(char obj : ch) {
			if(hashMap.containsKey(obj)) {
				int count = hashMap.get(obj);
				hashMap.put(obj, count+1);
			}else {
				hashMap.put(obj, 1);
			}
		}
		System.out.println(str + " :"+ hashMap);
	}
}
