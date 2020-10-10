package com.akash.arrayList;

import java.util.ArrayList;

public class CheckEmptyList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		
		System.out.println(list.isEmpty());
		System.out.println("Size " +list.size());
		list.add("A");
		System.out.println(list.isEmpty());
		System.out.println("Size " +list.size());
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.size()==0);
	}
}
