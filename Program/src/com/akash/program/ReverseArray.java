package com.akash.program;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
	
	public static void main(String[] args) {
		
		Integer[] intArray = {10,20,30,40,50,60,70,80,90};
		
		for(int i =0; i<intArray.length; i++) {
			if(i<intArray.length) {
				System.out.print(intArray[intArray.length-(i+1)]+" ");
			}
		}
		System.out.println(" ");
		System.out.println("Finished");
		
		/*Anothor Way*/
		System.out.println("Another ways");
		
		for(int i = intArray.length-1; i>=0; i--) {
			System.out.print(intArray[i]+" ");
		}
		System.out.println(" ");
		System.out.println("Using Collections");
		
		Collections.reverse(Arrays.asList(intArray));
		System.out.println("Reverse Number");
		System.out.print(Arrays.asList(intArray));
		System.out.println(" ");
		
	}

}
