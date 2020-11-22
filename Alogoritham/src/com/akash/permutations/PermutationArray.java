package com.akash.permutations;

import java.util.HashSet;
import java.util.Set;

public class PermutationArray {

	public static void main(String[] args) {
		// TODO 
		
		String str = "ABC";
		
		System.out.println(getPermutation(str));
	}

	private static Set<String> getPermutation(String str) {
		// TODO 
		Set<String> permutations = new HashSet<>();
		
		if(str == null) {
			return null;
		}else if(str.length()==0) {
			permutations.add("");
			return permutations;
		}
		
		char ch = str.charAt(0);
		
		String sub = str.substring(1);
		
		Set<String> words = getPermutation(sub);
		
		for(String word : words) {
			for(int i=0; i<=word.length(); i++) {
				permutations.add(word.substring(0,i)+ch+word.substring(i));
			}
		}
		return permutations;
	}
}