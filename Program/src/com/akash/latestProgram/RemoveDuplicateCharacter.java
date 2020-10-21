package com.akash.latestProgram;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		// TODO 
		String str = "akashkumar";
		RemoveDuplicateCharacter remove = new RemoveDuplicateCharacter();
		remove.removeDupicate(str);
		usingJava8(str);
	}

	private static void usingJava8(String str) {
		// TODO 
		
		String removeDuplicate = Arrays.asList(str.split(""))
									.stream()
									.distinct()
									.collect(Collectors.joining());
		System.out.println(removeDuplicate);
	}

	private void removeDupicate(String str) {
		// TODO 
		
		LinkedHashSet<Character> linked = new LinkedHashSet<>();
		for(int i = 0; i<str.length(); i++) {
			linked.add(str.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		for(Character ch : linked) {
			sb.append(ch);
		}
		
		System.out.println(sb);
		
	}
}