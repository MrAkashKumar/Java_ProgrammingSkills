package com.akash.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DeleteDuplicateInArrayList {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Akash");
		list.add("Ravi");
		list.add("Abhi");
		list.add("Akash");
		list.add("Ravi");
		list.add("Abhi");
		list.add("Akash");
		
		System.out.println("All added list element :: "+list);
		
		System.out.println("---------------------------------");
		
		list = list.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Avoid Duplicate :: "+list);
		
	}
}