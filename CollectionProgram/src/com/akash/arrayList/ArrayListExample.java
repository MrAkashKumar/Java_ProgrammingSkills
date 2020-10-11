package com.akash.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Spliterator;

public class ArrayListExample {
	/*
	In advance since from Java8.
	it can be used to iterate array, stream, list and set.
	Not possible with map
	but iterator since from Java1.2 and it can be used to iterate all collection classes.
	*/
	public static void main(String[] args) {
		// TODO 
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,8,6,7,12,63,45,96,41,67,10));
		Spliterator<Integer> sptr = list.spliterator();
		sptr.tryAdvance(d -> System.out.println(d));
		sptr.tryAdvance(d -> System.out.println(d));
		System.out.println("-----------------------");
		// for each 
		sptr.forEachRemaining(d -> System.out.println(d));
		
	}

}
