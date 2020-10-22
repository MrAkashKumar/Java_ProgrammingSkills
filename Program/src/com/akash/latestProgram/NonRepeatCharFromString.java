package com.akash.latestProgram;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatCharFromString {
	
	public static void main(String[] args) {
		firstNonRepeatedChar();
		nonRepeatedChar();
    }

	private static void nonRepeatedChar() {
		// TODO 
		
		String str = "akashkumar";
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i = 0; i<str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				int count = map.get(ch);
				map.put(ch, count+1);
				
			}else {
				map.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()!= 1)
			System.out.print(entry.getKey()+"");
		}	
	}

	private static void firstNonRepeatedChar() {
		// TODO 
		String s = "java";
        for(Character ch:s.toCharArray()) {
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println("First non repeat character = " + ch);
                break;
            }
        }
	}
}
