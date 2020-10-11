package com.akash.swaping;

import java.util.Scanner;

public class SwapingwithoutThird {
	
	public static void main(String[] args) {
		int x, y;
		System.out.println("Enter the X and Y");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println("Befor swaping  : "+ x+""+y);
		
		x = x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("After swapping : "+ x +""+y);
		
		scanner.close();
	}

}
