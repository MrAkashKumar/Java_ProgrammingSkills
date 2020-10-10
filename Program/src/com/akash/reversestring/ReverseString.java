package com.akash.reversestring;

public class ReverseString {

	public static void main(String[] args) {

		String input = "Anshit";
		
		char arr[] = input.toCharArray();
		
		int length = arr.length;
		
		for(int i =length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
		
	}

}
