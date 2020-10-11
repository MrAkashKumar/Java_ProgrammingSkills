package com.akash.list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {

	public static void main(String[] args) {
		// TODO 
		ArrayList<Integer> list = new ArrayList<>();
		list.add(25);
		list.add(63);
		list.add(23);
		list.add(48);
		list.add(41);
		list.add(11);
		System.out.println("Size "+list.size());
		System.out.println("-------While loop--------");
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println("while loop : " + iter.next());
		}
		
		System.out.println("--------Advanced loop--------");
		for(Object obj : list) {
			System.out.println("Advance loop "+obj);
		}
		
		System.out.println("---------For loop--------");
		for(int i =0; i<list.size(); i++) {
			System.out.println("get list : "+list.get(i));
		}
	}
}