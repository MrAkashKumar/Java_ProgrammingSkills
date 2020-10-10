package com.akash.findlargest;

import java.util.Scanner;

public class FindLargest {

	public static void main(String[] args) {

		int x, y, z;
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		
		if(x>y && x>z)
			System.out.println( x +" first Position is largest.... ");
		else if(y>x && y>z)
			System.out.println(y + " Second Position is largest... ");
		else if(z>x && z>y)
			System.out.println(z + " Third Position is largest.... ");
		else
			System.out.println("There are no value number...");
		
		scanner.close();
	}

//	OutPut
//	Enter the number
//	23
//	35
//	10
//	35 Second Position is largest... 

}
