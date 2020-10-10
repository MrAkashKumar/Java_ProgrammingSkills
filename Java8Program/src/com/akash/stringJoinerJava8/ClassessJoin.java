package com.akash.stringJoinerJava8;

import java.util.StringJoiner;

public class ClassessJoin {
	
	public static void main(String[] args) {
		
		String names [] = {"Akash", "Ravi", "harshi", "Anshu"};
		
		/*Best Approach */
		
		System.out.println("------- BEST -------");
		
		StringJoiner sj = new StringJoiner(",", "{", "}"); /*mutuable*/
		sj.setEmptyValue(" no value");
		
		for(String name : names) {
			sj.add(name);
		}
		
		System.out.println(sj);
		
		System.out.println("<<<<< Another Way >>>>>");
		
		/*Its not best approach*/
		
		String allName = "{"; /* its immutable so you can store multiple object not value chance of memory leak*/
		
		for(String name : names) {
			allName+=name + ",";
		}
		allName+="}";
		System.out.println(allName);
		
		
		
		
		
		
		
		
		
	}

}
