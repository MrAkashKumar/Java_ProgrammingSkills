package com.akash.java8filter;

import java.util.HashMap;
import java.util.Map;

import com.akash.java8.StudentPojo;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Map<StudentPojo, Integer> map = new HashMap<StudentPojo, Integer>();
		
		map.put(new StudentPojo("Akash",12), 12);
		map.put(new StudentPojo("Akash",12), 26);
		map.put(new StudentPojo("Akash",12), 45);
		
		System.out.println(map);
		
	}

}
