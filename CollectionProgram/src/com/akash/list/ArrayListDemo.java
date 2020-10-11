package com.akash.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO 
		List<String> list = new ArrayList<String>();
		list.add("Akash");
		list.add("Deepak");
		list.add("Ravi");
		list.add("Rahul");
		list.add("Anshit");
		
		list.set(1, "Jyoti");
		list.remove(1);
		
		Iterator<String> itertor = list.iterator();
		while(itertor.hasNext()) {
			System.out.println(itertor.next());
		}

	}

}
