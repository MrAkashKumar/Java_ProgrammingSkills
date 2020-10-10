package com.akash.commonprogram;

public class CharFrequencyDemo {
	
	private static final int SIZE = 26;
	
;	public static void main(String[] args) {
		String str = "AkashKumar";
		charSequenceWithPrint(str);
		
		
	}

	private static void charSequenceWithPrint(String str) {
		int length = str.length();
		
		int [] freq = new int[SIZE];
		
		for(int i = 0; i<length; i++)
			freq[str.charAt(i)-'a']++;
		
		for(int i = 0; i<length; i++) {
			if(freq[str.charAt(i)-'a']!=0) {
				System.out.println(str.charAt(i));
				System.out.println(freq[str.charAt(i)-'a']+ "");
				freq[str.charAt(i)-'a'] = 0;
			}
		}
	}
}
