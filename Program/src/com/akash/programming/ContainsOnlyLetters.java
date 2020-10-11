package com.akash.programming;

public class ContainsOnlyLetters {
	
	public static void main(String[] args) {
		
		String str = "HelloIam";
		int length = str.length();
		
		System.out.println(isFindOnlyLetters(str, length));
	}

	private static boolean isFindOnlyLetters(String str, int length) {
		// TODO Auto-generated method stub
		
		if(str == null || str == "")
			return false;
		
		/*Traverse the String*/
		
		for(int i = 0; i< length; i++) {
			
			if(!Character.isLetter(str.charAt(i))){
				return false;
			}
		}
		return true;	
	}
}