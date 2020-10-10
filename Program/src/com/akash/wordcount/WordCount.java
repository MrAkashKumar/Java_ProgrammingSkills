package com.akash.wordcount;

import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) {
		int count = 1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = scanner.nextLine();
		
		for(int i = 1; i<str.length();i++) {
			if(!(str.charAt(i) ==' ') && !(str.charAt(i-1)==' ')) {
				count++;
			}
		}
		
		if(count>0)
			System.out.println(" Total number "+count);
		scanner.close();
		
	}

}
