package com.akash.linklist;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO 
		LinkedList<String> list = new LinkedList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		
		System.out.println(list);
		
		list.add(3, "A");
		list.add(4, "A");
		
		System.out.println(list);
		
		// remove Element
		list.remove("A");
		list.remove(0);
		
		System.out.println("remove : "+list);
		
		//Iterate
		ListIterator<String> iterator = list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
