package com.akash.linkedhashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO 
		LinkedHashSet<String> link = new LinkedHashSet<>();
		link.add("A");
		link.add("B");
		link.add("C");
		link.add("D");
		link.add("E");
		link.add("F");
		link.add("G");
		System.out.println(link);
		boolean found = link.contains("A");
		System.out.println(found);
		
		link.remove("D");
		System.out.println("Remove D : "+ link);
		
		Iterator<String> itr = link.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}