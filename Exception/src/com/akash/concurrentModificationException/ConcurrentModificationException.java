package com.akash.aaaaa;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentModificationException {

	public static void main(String[] args) {
		// TODO
		exampleOfModificationException();
	}

	private static void exampleOfModificationException() {
		// TODO

		ArrayList<String> list = new ArrayList<>();
		list.add("akash");
		list.add("ravi");
		list.add("rahul");
		list.add("anshit");
		list.add("Guddu");

		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) {
			String value = itr.next();
			System.out.println("List Value:" + value);
			if (value.contains("ravi"))
				list.remove(value);
			System.out.println(list);
		}
	}
}