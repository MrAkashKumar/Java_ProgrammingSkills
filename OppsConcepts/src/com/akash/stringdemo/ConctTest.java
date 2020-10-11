package com.akash.stringdemo;

public class ConctTest {
	
	public static void main(String[] args) {
		
		String str = "hello";
		
		String s = new String("Akash");
		String s2= s.concat(" kumar");
		System.out.println(s2);
		
		String str1=str.concat(" I am");
		System.out.println(str1);
		
		str = str.concat(" I am not for you");
		System.out.println(str);
		
	}

}
