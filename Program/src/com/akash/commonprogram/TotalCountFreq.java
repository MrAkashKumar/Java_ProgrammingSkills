package com.akash.commonprogram;

public class TotalCountFreq {

	public static void main(String[] args) {
		
		int count;
		String inputStr = "Akash";
		String str = inputStr.toLowerCase();
		
		for(char c= 'A'; c<='z'; c++) {
			count = 0;
			for(int i = 0; i<str.length(); i++) {
				char ch = str.charAt(i);
				
				if(ch == c) {
					count++;
				}
			}
			
			if(count>0) {
				System.out.println("The character "+ c+" of count "+count);
			}
		}
	}
}