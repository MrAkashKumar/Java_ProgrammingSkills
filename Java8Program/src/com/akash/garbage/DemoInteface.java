package com.akash.garbage;

import java.util.Iterator;
import java.util.TreeSet;

public class DemoInteface {
	
	public static final int i = 55;
	
	public static void main(String[] args) {
		
		TreeSet<String> tree = new TreeSet<>();
		
		tree.add("Akash");
		tree.add("Ravi");
		tree.add("Umesh");
		tree.add("Roshan");
		tree.add("Sonu");
		tree.add("Anshit");
		
		System.out.println(tree);
		
		Iterator<String> iter = tree.iterator();
		while(iter.hasNext()) {
			String name=iter.next();
			System.out.println(name);
			if(name == "Anshit") {
				iter.remove();
			}
		}
		System.out.println(tree);
	}

}
