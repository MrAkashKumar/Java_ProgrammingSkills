package com.akash.dataStructure;

public class Alphabetical_Order {

	public static void main(String[] args) {
		String str [] = {"Akash","Ravi","Rahul","Vikash","Nitesh","Deepak","Harshi"};
		
		int length = str.length;
		sortAlphabetical(str, length);
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]+" ");
		}
	}

	private static void sortAlphabetical(String[] str, int length) {
		
		String temp;
		for(int i =0; i<length; i++) {
			for(int j = i+1; j<length;  j++) {
				
				if(str[i].compareTo(str[j])>0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;	
				}		
			}
		}	
	}
}