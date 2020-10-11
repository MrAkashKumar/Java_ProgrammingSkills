package com.akash.exceptionBlock;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO 
		getHello();
	}

	public static void getHello() {
		// TODO 
		
		String str = "Hello";
		try {
			int i = 1/0;
			System.out.println(i);
			
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("catch block");
			// TODO: handle exception
		}finally {
			System.out.println("hey");
		}
		System.out.println(str);
		
	}

}
