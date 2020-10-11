package com.akash.concurrencyhashMap;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrencyHashMapDemo {

	public static void main(String[] args) {
		// TODO 
		ConcurrentHashMap<Integer, String> concurrent = new ConcurrentHashMap<>();
		concurrent.put(104, "hello");
		concurrent.put(105, "Hey");
		concurrent.put(106, "You");
		concurrent.put(107, "Geeks");
		
		concurrent.remove(106);
		System.out.println(concurrent);
		concurrent.replace(104, "hello", "Ahom");
		System.out.println(concurrent);

	}
}