package com.akash.stringbuilder;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		
		StringBuilder str = new StringBuilder("Akash Kumar");
		str.append(" Singh");
		
		System.out.println("String : "+ str.toString());
		System.out.println("String without : "+str);
		
		str.reverse();
		System.out.println(str);
		
		
		
		
	}

}
