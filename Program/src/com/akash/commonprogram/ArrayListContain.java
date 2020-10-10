package com.akash.commonprogram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListContain {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("Akash");
		list.add("Ravi");
		list.add("Rahul");
		list.add("Anshit");
		list.add("Aditya");
		
		System.out.println(list);
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println("STEP :: "+iterator.next());
		}
		
		System.out.println(list.contains("Ohey"));
		System.out.println(" Contains :  "+list.contains("Rahul"));
		
		System.out.println(list.indexOf("Ravi")>0);
		
		
		
		
	}

}
