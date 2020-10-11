package com.akash.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

	/*Comparable: Java Comparable Interface used to sort a array or list of objects
	objects based on their natural order. Natural ordering of elements is imposed
	by implementing it's compareTo() method in the objects.
	we can sort the elements of 
	 
	*/
	public static void main(String[] args) {
		// TODO 
		ArrayList<String> list = new ArrayList<String>();
	
		list.add("F");
		list.add("D");
		list.add("E");
		list.add("C");
		list.add("A");
		list.add("B");
		list.add("G");
		
		Collections.sort(list);
		System.out.println(list);
		// Sort list of String in reverse order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Reverse Order : "+ list);
	
	}
}