package com.akash.finallyException;

public class FinallyExampleException {

	public static void main(String[] args) {

		try {
			int x = 100;
			System.out.println(x);
		}
		catch(Exception e ) {
			System.out.println(e);
		}
		
		// it will be executed whether execution is handled or not  
		
		finally {
			System.out.println("Finally block is executing.........");
		}
	}
}
