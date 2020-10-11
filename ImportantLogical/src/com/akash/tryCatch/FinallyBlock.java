package com.akash.tryCatch;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO 
		System.out.println(count());
	}
	
	public static int count() {
		try {
			/* 2nd Execute */
			System.out.println("Hey");
			return 1;
		} catch (Exception e) {
			return 2;
			// TODO: handle exception
		}finally {
			System.out.println(" Finally block will execute even after a return statement ");
			/* 1st Execute */
		}
	}
}