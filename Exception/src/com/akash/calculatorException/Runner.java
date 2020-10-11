package com.akash.calculatorException;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO 
		System.out.println("...App Start...");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		int fn = scanner.nextInt();
		int sn = scanner.nextInt();

		scanner.close();
		Calculator calculator = new Calculator();
		calculator.divide(fn, sn);
		System.out.println("App Close");
	}
}