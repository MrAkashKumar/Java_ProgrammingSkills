package com.akash.set;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();
		
		treeset.add(15);
		treeset.add(55);
		treeset.add(11);
		treeset.add(19);
		treeset.add(30);
		
		System.out.println(treeset);
		System.out.println(treeset.size());
		System.out.println(treeset.first());
	}

}
