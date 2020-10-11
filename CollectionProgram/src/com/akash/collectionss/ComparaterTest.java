package com.akash.collectionss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparaterTest {

	public static void main(String[] args) {
		// TODO 
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("one");
		arrayList.add("two");
		arrayList.add("three");
		arrayList.add("four");
	
		System.out.println(arrayList);
		
		Collections.sort(arrayList, new StringSort());
		System.out.println(arrayList);
		
		TreeSet<String> set = new TreeSet<>();
		set.add("ONE");
		set.add("THree");
		set.add("TWO");
		set.add("Four");
		set.add("Akash");
		set.add("WO");
		
		System.out.println(set +" All");
		

	}

}
