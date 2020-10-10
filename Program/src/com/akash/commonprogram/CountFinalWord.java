package com.akash.commonprogram;

import java.util.HashMap;
import java.util.Map;

public class CountFinalWord {

	public static void main(String[] args) {

		String s = "Hello I am sofware engineer and I am good engineer ";
		
		String [] str = s.split(" ");
		
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		for(int i = 0; i<str.length; i++) {
			
			if(hashMap.containsKey(str[i])) {
				int count = hashMap.get(str[i]);
				hashMap.put(str[i], count+1);
			}else {
				hashMap.put(str[i], 1);
			}
		}	
		System.out.print(hashMap);
		for(String value : str) {
			if(hashMap.get(value)>1) {
				System.out.println(value + " : this is dublicate value");
			}
		}
		
	}
}