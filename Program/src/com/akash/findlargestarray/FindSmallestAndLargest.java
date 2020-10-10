package com.akash.findlargestarray;

import java.util.Scanner;

public class FindSmallestAndLargest {
	public static void main(String[] args) {
	    int smallest = 0;
	    int large = 0;
	    int num;
	    System.out.println("Enter the number");
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    num = input.nextInt();
	    smallest = num;
	    for (int i = 2; i < n; i++) {
	        num = input.nextInt();
	        if (num > large) {
	            large = num;
	        }
	        if (num < smallest) {
	            smallest = num;
	        }
	    }
	    
	    System.out.println("The largest is:" + large);
	    System.out.println("Smallest no is : " + smallest);
	    input.close();
	}

}
