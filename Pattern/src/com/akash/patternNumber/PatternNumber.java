package com.akash.patternNumber;

import java.util.Scanner;

public class PatternNumber {

	public static void main(String[] args) {
		int num, space;
		
		System.out.print("Enter a number between 1 to 9 :  ");
		
		Scanner reader = new Scanner(System.in);
		
		try {
			num = reader.nextInt();
			space = num - 1;
			
			for(int i = 1; i<= num; i++) {
				for(space = 1; space <= (num-1); space++) {
					System.out.print(" ");
				}
				
				for(int j = 1; j<= i; j++) {
					System.out.print(j);
				}
				
				for(int k = (i-1); k>=1; k--) {
					System.out.print(k);
				}
				
				System.out.println();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			reader.close();
		}

	}

}
