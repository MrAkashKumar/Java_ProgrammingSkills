package com.akash.programming;

public class ReplaceMethod {
	
	public static void replace(char [] ch, int length) {
		
		for(int i =  1; i<length; i++) {
			if(ch[i] =='l') {
				ch[i] = 'k';
				
				for(int j=i+1; j<length-i; j++) {
					ch[j] = ch[j+1];
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String str = "Akashlumar";
		String str1 = "AkashABKumar";
		char[] ch =  str.toCharArray();
		char[] ch1 =  str1.toCharArray();
		
		System.out.println(str.length());
		replace(ch, str.length());
		replaceTwoNumber(ch1, str1.length());
		System.out.println("This is modify >>> ");
		System.out.println(ch);
		
		System.out.println("Two numer");
		System.out.println(ch1);
	}

	private static void replaceTwoNumber(char[] ch1, int length) {

		for(int i = 1; i<length; i++) {
			if(ch1[i-1] == 'A' && ch1[i] == 'B' ) {
				ch1[i-1] = ' ';
				
				for(int j = i; j<length-i; j++) {
					ch1[j] = ch1[j+1];
				}
			}
		}
	}

}
