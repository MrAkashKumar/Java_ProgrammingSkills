package com.akash.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortComparable {

	public static void main(String[] args) {
		// TODO 
		ArrayList<Integer> arraylist = new ArrayList<>();
		arraylist.add(26);
		arraylist.add(6);
		arraylist.add(265);
		arraylist.add(600);
		arraylist.add(720);
		arraylist.add(10);
		
		Collections.sort(arraylist);
		
		System.out.println("Array list : "+ arraylist);
		
		Collections.sort(arraylist, Collections.reverseOrder());
		System.out.println("reverse Order : "+arraylist);

	}
}
