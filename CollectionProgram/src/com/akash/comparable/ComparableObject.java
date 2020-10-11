package com.akash.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableObject {

	public static void main(String[] args) {
		// TODO 
	
		ArrayList<Employee> list = new ArrayList<>();
		
		list.add(new Employee(12, "Deepak", 2012));
		list.add(new Employee(20, "Sunil", 2016));
		list.add(new Employee(2, "Rajeev", 1968));
		list.add(new Employee(24, "Tanmay", 2002));
		list.add(new Employee(19, "Anshit", 2015));
		list.add(new Employee(30, "Bhavna", 2019));
		
		Collections.sort(list);
		System.out.println("List : "+ list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("reverse Number : "+list);
		

	}

}
