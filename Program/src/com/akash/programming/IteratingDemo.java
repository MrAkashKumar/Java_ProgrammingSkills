package com.akash.programming;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratingDemo {
	
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		list.add("Akash");
		list.add("Ravi");
		list.add("Hero");
		list.add("A++");
		list.add("company");
		
		System.out.println(list);
		
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String value = iterator.next();
			System.out.println("--------------");
			
			if(value.contains("A++")) {
				System.out.println("Available");
			}else if(value.contains("company")){
				System.out.println("Available");
			}else if (value.contains("Jai")) {
				System.out.println("Not Available");
			}
		}
	}

}
