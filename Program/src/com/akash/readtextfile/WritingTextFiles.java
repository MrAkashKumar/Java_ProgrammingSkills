package com.akash.readtextfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingTextFiles {

	public static void main(String[] args) throws IOException{
		FileWriter filewriter = new FileWriter("testing.txt");
		System.out.println("Enter the Name ");
		Scanner scanner = new Scanner(System.in);
		String testword = scanner.nextLine();
		filewriter.write(testword);
		BufferedReader reader = new BufferedReader(new FileReader("testing.txt"));
		System.out.println(reader);
		filewriter.close();
		scanner.close();

	}
}
