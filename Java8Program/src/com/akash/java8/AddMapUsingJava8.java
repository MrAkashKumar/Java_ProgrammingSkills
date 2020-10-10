package com.akash.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AddMapUsingJava8 {
	
	public static void main(String[] args) {
		
		List<StudentPojo> list = new ArrayList<StudentPojo>();
		list.add(new StudentPojo("Akash",26));
		list.add(new StudentPojo("Abhi",25));
		list.add(new StudentPojo("Anshit",11));
		list.add(new StudentPojo("Rahul",26));
		
		System.out.println(list);
		
		Map<String, Integer> hashmap = new HashMap<String, Integer>();
		
		for(StudentPojo student : list) {
			hashmap.put(student.getName(), student.getAge());
		}
		
		System.out.println("Normal Class : "+ hashmap);
		
		System.out.println("-------------------------------------");
		
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(StudentPojo :: getName, StudentPojo:: getAge));
		
		System.out.println("Map Using Java8 "+map);
		
		
		/*hashmap.put(1, "Akash");
		hashmap.put(2, "RAVI");
		hashmap.put(3, "Rahul");
		hashmap.put(4, "Anshit");
		hashmap.put(5, "Guddu");		
		System.out.println(hashmap);*/
	}
}