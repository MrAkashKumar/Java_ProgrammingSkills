package com.akash.sortByAgeOrName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortByNameOrAge {

	public static void main(String[] args) {
		// TODO 
		
		sortByNameOrAga();
		

	}

	private static void sortByNameOrAga() {
		// TODO 
		List<Person> list = new ArrayList<Person>();
		
		List<Integer> li = new ArrayList<>();
		li.add(52);
		li.add(92);
		li.add(51);
		li.add(5);
		
		list.add(new Person("Akash", 26));
		list.add(new Person("Ravi", 2));
		list.add(new Person("Deepak", 16));
		
		Collections.sort(list, (a,b) -> a.getName().compareTo(b.getName()));
		Collections.sort(li, (a,b) -> a.compareTo(b));
		System.out.println(li);
		
		System.out.println("With Name : "+ list);
		
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO 
				return o1.getAge()-o2.getAge();
			}
		});
		
		System.out.println(list);
		
	}

}
