package com.akash.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySubList {

	public static void main(String[] args) {
		// TODO 
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,6,2,8,9,7,1,5,0,3));
		
		ArrayList<Integer> sublist = new ArrayList<Integer>(list.subList(2, 4));
		System.out.println(sublist);
	}
}