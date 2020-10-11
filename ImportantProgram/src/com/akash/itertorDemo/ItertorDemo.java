package com.akash.itertorDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class ItertorDemo {

	public static void main(String[] args) {
		// TODO 
		//hasNext() : it check value present or not 
		// next(): it is printing value next 
		
		LinkedList<String> list = new LinkedList<>();
		list.add("Akash");
		list.add("Badshah");
		list.add("Dev");
		list.add("Rahul");
		list.add("Anil");
		
		Iterator<String> itertator = list.iterator();
		
		while(itertator.hasNext()) {
			String value = itertator.next();
			System.out.println("--- "+value+" ---");
			
			if(value.contains("Rahul")) {
				System.out.println("Available");
			}else {
				System.out.println("not Available");
			}
			
		}
		// print using enhanced or loop
		for(String lists : list) {
			if(lists.contains("Rahul")) {
				System.out.println(lists+" Final Result");
			}
			System.out.println(lists);
		}
	}
}
