package com.akash.exceptionBlock;

public class ExceptionChainingDmo {

	public static void main(String[] args) {
		// TODO 
		getBlock();
	}

	public static void getBlock() {
		// TODO
		/*occurs when an exception is thrown in response to another exception. This allows
		 * us to discover the complete history of our raised problem*/
		try {
			System.out.println(2);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}finally {
			System.out.println("Hello");
		}
	}
}
