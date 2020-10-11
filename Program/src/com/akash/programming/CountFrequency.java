package com.akash.programming;

public class CountFrequency {
	
	public static void main(String[] args) {
		
		int count;
		
		String str ="Akash";
		int length = str.length();
		
		for(char c = 'A'; c<='z'; c++ ) {
			count = 0;
			for(int i = 0; i<length; i++) {
				char ch = str.toLowerCase().charAt(i);
				
				if(ch == c) {
					count++;
				}
			}
			if(count>0) {
				System.out.println("The character "+ c+ " of count "+ count);
			}
		}
		
	}

}
