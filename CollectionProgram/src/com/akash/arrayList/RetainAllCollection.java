package com.akash.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RetainAllCollection {

	public static void main(String[] args) {
		// TODO 
		ArrayList<String> list = new ArrayList<>(Arrays.asList("A","B","C","D","F","K","D","P","D"));
		
		System.out.println(list);
		list.retainAll(Collections.singleton("D"));
		System.out.println(list);
	}
}