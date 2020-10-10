package com.akash.substringstring;

import java.util.*;

public class WordSubString {

	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	System.out.println("Input Size");
	int size = Integer.parseInt(scanner.next());
	String [] strings = readyArray(size);
//	String [] strings = {"d", "zddsaaz", "ds", "ddsaa", "dds"};
		try {
			Object[] manipulationArray = getManipulateArray(strings);
			checkForSubString(manipulationArray);
			printArray(manipulationArray);
			
		}catch(Exception e) {
			System.out.println();
		}

	}
	private static void printArray(Object[] print) {
		for(Object obj : print) {
			System.out.println(obj);
		}
		
	}
	private static void checkForSubString(Object[] manipulationArray) throws Exception{
		for(int i = 1; i<manipulationArray.length;i++) {
			if(!((String)manipulationArray[i]).contains((String)manipulationArray[i-1])) throw new Exception();
		}
	}
	private static Object[] getManipulateArray(String[] arr) throws Exception  {
		Map<Integer, String> m = new TreeMap<>();
		for(String s : arr) {
			if(m.containsKey(s.length())|| m.containsValue(s)) {
				throw new Exception();
			}
			m.put(s.length(), s);
		}
		
		return m.values().toArray();
	}
	private static String[] readyArray(int size) {
		String s[] = new String[size];
		for(int i = 0; i<size; i++) {
			s[i] = scanner.next();
		}
		return s;
	}
}