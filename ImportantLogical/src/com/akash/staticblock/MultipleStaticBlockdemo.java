package com.akash.staticblock;

public class MultipleStaticBlockdemo {

	static int num;
	static String str;
	
	static {
		System.out.println("static block 1"); // 1st execute
		num = 68;
		str= "Block1";
	}
	static {
		System.out.println("Static block 2"); // 2nd execute
		num = 70;
		str = "Block2";
	}
	public static void main(String[] args) {
		// TODO 
		System.out.println("value of num: "+ num); // 3rd execute in second block2
		System.out.println("value of str: "+ str); // 4th block in second block2
	

	}

}
