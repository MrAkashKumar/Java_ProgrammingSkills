package com.akash.ExceptionThrow;

public class ThrowExcept extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) throws ThrowExcept  {
		ExceptionHandle.valid(20);
		System.out.println("Testing.....");
	}
	public ThrowExcept(String s) {
		// TODO 
		super(s);
	}

}
class ExceptionHandle{
	static void valid(int i) throws ThrowExcept  {
		if(i<18) {
			throw new ThrowExcept("No Valid");
		}
	}
}