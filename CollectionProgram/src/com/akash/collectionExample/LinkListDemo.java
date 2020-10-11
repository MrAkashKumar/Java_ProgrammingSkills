package com.akash.collectionExample;

import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Akash");
		list.add("RAVI");
		list.add("Rahul");
		list.add("Aditya");
		
		System.out.println(list);		
		System.out.println(list.getFirst());

	}

}