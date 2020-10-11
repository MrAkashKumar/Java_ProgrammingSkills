package com.akash.mapi;

import java.util.HashMap;
import java.util.Map;

public class IteratorUsingKeySet {

	public static void main(String[] args) {
		// TODO 
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Akash", "Delhi");
		map.put("Ravi", "Patna");
		map.put("Rahul", "Delhi");
		map.put("Anshit", "Delhi");
		map.put("Yuraj", "Delhi");
		
		// keyset()
		for(String name : map.keySet())
			System.out.println("key : "+ name);
		for(String url : map.values())
			System.out.println("Value : "+ url);
	
	}

}
