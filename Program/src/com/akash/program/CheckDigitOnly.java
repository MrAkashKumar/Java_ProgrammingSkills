package com.akash.program;

public class CheckDigitOnly {

	public static void main(String[] args) {
		
		String str = "2222";
		int length = str.length();
		
		System.out.println(onlyDigitValue(length, str));

	}

	private static boolean onlyDigitValue(int length, String str) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i<length ; i++) {
			if(Character.isDigit(str.charAt(i))) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}