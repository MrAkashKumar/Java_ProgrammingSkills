package com.akash.ConcordanceProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ConcordanceProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		Map<Character, Set<Integer>> map = charConcordance(str);
		System.out.println(map);
		/*  
		 * {r=[8], d=[10], e=[1], W=[6], H=[0], l=[2, 3, 9], o=[4, 7]}
		 * 
		 * */
	}
	private static Map<Character, Set<Integer>> charConcordance(String str) {
		// TODO 
		Map<Character, Set<Integer>> map = new HashMap<Character, Set<Integer>>();
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == ' ')
				continue;
			Set<Integer> set = map.get(ch);
			if(set == null)
				set = new HashSet<>();
			set.add(i);		
			map.put(ch, set);
		}
		return map;
	}
}
