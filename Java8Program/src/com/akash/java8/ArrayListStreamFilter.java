package com.akash.java8;

import java.util.Arrays;
import java.util.List;

public class ArrayListStreamFilter {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Akash","Abhinav", "Deepak", "Dhiraj", "Ravi", "Vikash");
	
		for(String name : list) {
			if(!name.equals("Ravi")) {
				System.out.println("Using Simple Method :: "+ name);
			}
		}
		/*System.out.println(list);*/
		
		/*Java8 Provide functional style */		
		System.out.println("------------------------------------------");
		
		list.stream()
				.filter(name -> isNotAbhinav(name))
				.forEach(name -> System.out.println("Stream Using "+name));
				/*OR*/
				/*.forEach(System.out::println);*/

		System.out.println("------------------------------------------");
		
		
		list.stream()
		.filter(ArrayListStreamFilter::isNotAbhinav)
		.forEach(System.out::println);
		
	}

	private static boolean isNotAbhinav(String name) {
		return !name.equals("Abhinav");
	}
}