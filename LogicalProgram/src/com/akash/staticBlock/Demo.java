package com.akash.staticBlock;

public class Demo {
	
	int a;
	static int b;
	
	static {
	System.out.println("Hello");		
	}

	public static void main(String[] args) {
		String abc ="abc";
		String abcd = "abcd";
		
		System.out.println(abc+" "+abcd);
		
		System.out.println("Value of a = "+ new Demo().a);
		System.out.println("Value of b = "+ b);
	}
}
