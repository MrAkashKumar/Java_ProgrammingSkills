package com.akash.premutationString;

import java.util.HashSet;
import java.util.Set;

public class PermutationsString {

	public static Set<String> permutationFinder(String str){
		Set<String> perm = new HashSet<String>();
		if(str == null){
			return null;
		}else if(str.length() == 0){
			perm.add("");
			return perm;
		}
		char initial = str.charAt(0);
		String rem = str.substring(1);
		Set<String> words = permutationFinder(rem);
		for(String strNew : words){
			for(int i = 0; i<=strNew.length(); i++){
				perm.add(charInsert(strNew, initial, i));
			}
		}
		return perm;	
		}
			public static String charInsert(String str, char c, int j){
			String begain = str.substring(0, j);
			String end = str.substring(j);
			return begain + c + end;
		}
			public static void main(String[] args){
			String s1 = "ABC";
			System.out.println("Permutation for "+ s1 +" are "+ permutationFinder(s1));
		}
			
			// output - Permutation for ABC are [ACB, BCA, ABC, CBA, BAC, CAB]

}
