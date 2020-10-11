package com.akash.mapi;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ItratingMapEntry {

	public static void main(String[] args) {
		// TODO 
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Akash");
		map.put("2", "Deepak");
		map.put("3", "Vikash");
		map.put("4", "Ravi");
		map.put("5", "Rahul");
		
		/*2nd option*/
		
		/*map.put("1", "Akash");
		map.put("2", "Deepak");
		map.put("3", "Hero");
		map.put("3", "Ravi");
		map.put("5", "Rahul");*/
		
		// 3rd option
		
		/*map.put("1", "Akash");
		map.put("2", "Deepak");
		map.put(null, "Vikash");
		map.put(null, "Ravi");
		map.put("5", "Rahul");*/
		
		/*using iterators*/
		
		Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<String, String> entry = iterator.next();
			System.out.println("key : "+ entry.getKey()+ " , value : "+ entry.getValue());
		}

	}

}
