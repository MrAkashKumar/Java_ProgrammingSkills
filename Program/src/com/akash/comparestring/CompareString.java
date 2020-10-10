package com.akash.comparestring;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		String str1, str2;
		System.out.println("Enter the String");
		Scanner scanner = new Scanner(System.in);
		str1 = scanner.nextLine();
		System.out.println("Enter the Second String");
		str2 = scanner.nextLine();
		
		if(str1.compareTo(str2)>0)
			System.out.println("The first string is greater than the second");
		else if(str1.compareTo(str2)<0)
			System.out.println("The first string is smaller than the second");
		else
			System.out.println("Both are string are equal");
		
		scanner.close();
		
		// output
//		Enter the String
//		hello
//		Enter the Second String
//		Hello
//		The first string is greater than the second
	}

}
