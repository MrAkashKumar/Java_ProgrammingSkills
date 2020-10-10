package com.akash.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO 
		ArrayList<Integer> list = new ArrayList<>();
		list.add(121);
		list.add(569);
		list.add(481);
		list.add(025);
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
