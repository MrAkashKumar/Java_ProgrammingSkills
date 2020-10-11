package com.akash.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapArrayListExample {

	public static void main(String[] args) {
		// TODO 
		ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G"));
		
		System.out.println(list);
		Collections.swap(list, 2, 3);
		System.out.println("Swap list : "+list);

	}

}
