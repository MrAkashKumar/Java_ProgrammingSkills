package com.akash.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ToArrayDemo {

	public static void main(String[] args) {
		// TODO 
		ArrayList<String> list = new ArrayList<>(2);
		list.add("3");
		list.add("6");
		list.add("9");
		list.add("1");
		list.add("7");
		
		System.out.println(list);
		
		Object[] array = list.toArray();
		System.out.println(Arrays.toString(array));
		
		// Iterate and convert to desired type
		for(Object obj : array) {
			String s = (String)obj;
			System.out.println(s);
		}

	}

}
