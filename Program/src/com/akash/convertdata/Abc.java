package com.akash.convertdata;

import java.util.Scanner;

public class Abc {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the number");
//		double num = scanner.nextDouble();
//		
//		int n = (int) num;
//		System.out.println(n);
		
		String search = "loop";
		String [] word = {"kool","Hero", "loop"};
		
		for(int i=0;i<word.length;i++) {
			if(search==word[i]) {
				System.out.println("Are equal");
			}else {
				System.out.println("Are not equal");
			}
			System.out.println(word[i]);
			
		}
		scanner.close();
	}

}
