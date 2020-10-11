package com.akash.ExceptionThrow;

public class ThrowsException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args)  {
		ThrowsExce.valid(20);
		System.out.println("Testing.....");
	}
	public ThrowsException(String s) {
		// TODO 
		super(s);
	}

}
class ThrowsExce{
	static void valid(int i)  {
		if(i<18) {
			throw new ThrowsException("No Valid");
		}
	}
}