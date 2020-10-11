package com.akash.inheritanceDemo;

public class Runner {

	public static void main(String[] args) {
		// TODO 
		System.out.println("hello");
		System.out.println("Count : "+ ChildDemo.getCount());
		
		ChildDemo chiledDemo = new ChildDemo();
		chiledDemo.toString();
		System.out.println("Count : "+ ChildDemo.getCount());
	}

}
