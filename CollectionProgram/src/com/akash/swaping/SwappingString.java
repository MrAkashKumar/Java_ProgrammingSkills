package com.akash.swaping;

public class SwappingString {

	public static void main(String[] args) {
		// TODO 
		String str = "AkashKumar";
		
		System.out.println(swap(str, 6, str.length()-2));
		System.out.println(swap(str, 0, str.length()-1));	
	}
	static char[] swap(String str, int i, int j) {
		 char ch[] = str.toCharArray();
		
		 char temp = ch[i];
		 ch[i] = ch[j];
		 ch[j] = temp;
		
		return ch;
	}
}
