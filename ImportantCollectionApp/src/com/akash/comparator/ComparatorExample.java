package com.akash.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {

	/*Java comparator interface imposes a total ordering on the objects which may not have 
		a natural ordering.
	*/
	public static void main(String[] args) {
		// TODO 
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(12, "Prakash", 210935332));
		list.add(new Employee(26, "Vikash", 810935562));
		list.add(new Employee(99, "Nitesh", 310935332));
		list.add(new Employee(78, "Yuraj", 910935332));
		list.add(new Employee(48, "Ritesh", 950935332));
		list.add(new Employee(69, "Anshit", 510935332));
		list.add(new Employee(38, "ravi", 410935332));
		list.add(new Employee(8, "badal", 16626562));
		
		Collections.sort(list, new Employee());
		System.out.println(list);
		
		Collections.sort(list, Comparator.comparing(Employee::getName).reversed());
		
		System.out.println("reverse number : "+ list);
	}
}