package com.akash.arrayListException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcurrentModification {
	
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		
		arrayList.add("a");
		arrayList.add("b");
		arrayList.add("c");
		
		Iterator<String> iterator = arrayList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			arrayList.add("d");
		}
		
	}

}
