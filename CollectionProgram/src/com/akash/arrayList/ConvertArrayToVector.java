package com.akash.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class ConvertArrayToVector {

	public static void main(String[] args) {
		// TODO 
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(15,62,32,95,13,49,10,62,75));
		
		Vector<Integer> vector = new Vector<>(list);
		System.out.println(vector);
	}
}