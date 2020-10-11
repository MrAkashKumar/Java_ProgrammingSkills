package com.akash.colonable;

public class Runner {

	public static void main(String[] args) throws CloneNotSupportedException{
		// TODO 
		Test2 test2 = new Test2();
		test2.a = 10;
		test2.b = 20;
		test2.test.x= 30;
		test2.test.y = 40;
		
		Test2 test3 = (Test2)test2.clone();
		test3.a=200;
		test3.test.x=300;
		
		System.out.println(test2.a+" "+test2.b+" "+test2.test.x+" "+test2.test.y);
		System.out.println(test3.a+" "+test3.b+" "+test3.test.x+" "+test3.test.y);

	}
}
