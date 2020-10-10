package com.akash.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapperExample {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Akki", "Abhi","Ravi");
		
		for(String name : names) {
			if(!name.equals("Abhi")) {
				UserPojo user = new UserPojo(name);
				System.out.println(user);
			}
		}
		
		System.out.println("Functional Style :: >> ");
		
		names.stream()
			.filter(MapperExample::isNotAbhi)
			.map(UserPojo::new)
			.forEach(System.out:: println);
		
		List<UserPojo> userList = names.stream()
		.filter(MapperExample::isNotAbhi)
		.map(UserPojo::new)
		.collect(Collectors.toList());
		
		System.out.println("Stream API : "+userList);
		
	}

	private static boolean isNotAbhi(String name) {
		return !name.equals("Abhi");
	}
}