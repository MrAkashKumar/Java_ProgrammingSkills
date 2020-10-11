package com.akash.collectionExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> hash = new HashMap<>();
		hash.put("Akash", 5);
		hash.put("Akki", 7);
		Collections.synchronizedList(new ArrayList<String>());
		System.out.println("Result :: "+hash.hashCode());
		//System.out.println("hashCode :: "+hash.hashCode());
		Integer akash = hash.get("Akash");
		Integer akki = hash.get("Akki");
		System.out.println("Akash Get Value : "+akash.hashCode());
		if(akki.hashCode()== akash.hashCode()) {
			System.out.println("Both are equal");
		}else {
			System.out.println("Both are not equal");
		}
		System.out.println("Akki Get Value : "+akki.hashCode());
		//hash.get("Akki").hashCode();
		
		
		//System.out.println(hash.hashCode());
		
		
	}
	


}
