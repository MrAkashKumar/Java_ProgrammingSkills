package com.akash.program;

import java.util.Arrays;

public class AnagramProgram {
	
	public static void main(String[] args) {
		
		String s1 = "Keep";
		String s2 = "Peek";
		
		if(isAnagram(s1, s2)) {
			System.out.println(s1 +" and "+ s2 +" is Anagram");
		}else {
			System.out.println(s1 +" and "+ s2 +" is not Anagram");
		}
	}

	private static boolean isAnagram(String str1, String str2) {
		
		boolean status = false;
		
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		
		if(s1.length() != s2.length()) {
			return status;
		}else {
			char ch1[] = s1.toLowerCase().toCharArray();
			char ch2[] = s2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			status = Arrays.equals(ch1, ch2);
			status = true;
		}
		return status;
	}

}
