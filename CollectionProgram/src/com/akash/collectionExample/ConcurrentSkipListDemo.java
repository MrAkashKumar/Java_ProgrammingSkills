package com.akash.collectionExample;

import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListDemo {
	
	public static void main(String[] args) {
		ConcurrentSkipListMap<String, Integer> map = new ConcurrentSkipListMap<>();
		ConcurrentSkipListMap<Integer, String> skipListmap = new ConcurrentSkipListMap<>();
		
		map.put("Akash", 123);
		map.put("Prakash", 253);
		map.put("Ravi", 103);
		map.put("Rahul", 143);
		
		skipListmap.put(23, "Akki");
		skipListmap.put(18, "deepak");
		skipListmap.put(03, "Ravi");
		skipListmap.put(26, "rahul");
		skipListmap.put(33, "Akash");
		
		System.out.println(map);
		System.out.println(skipListmap);
	}

}
