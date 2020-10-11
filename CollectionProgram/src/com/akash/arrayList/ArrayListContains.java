package com.akash.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListContains {

	public static void main(String[] args) {
		// TODO 
		ArrayList<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		Iterator<String> itertor = list.iterator();
		while(itertor.hasNext()) {
			System.out.println(itertor.next());
		}
		
		System.out.println(list.contains("E")); // true
		System.out.println(list.contains("Z")); // false
			// IndexOf
		System.out.println(list.indexOf("D")>0); // true
		System.out.println(list.indexOf("I")>0); // false
			// Remove
		list.remove("E");
		System.out.println(list);
	}
}