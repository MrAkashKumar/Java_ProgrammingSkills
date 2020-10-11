package com.akash.stringdemo;

public class ExceptionTest {
	
	public static void main(String[] args) {
		try {
			System.out.println("**********Start ********");
			System.exit(0);
			System.out.println("********Middle***********");
		}catch(SecurityException e) {
			System.out.println(e.getMessage()+" Security Exception");
		}catch(Exception e) {
			System.out.println(e.getMessage()+ " Exception");
		}finally {
			System.out.println("*************End************");
		}
	}

}
