package com.akash.stringBuffer;

public class StringBuffereReverse {
	
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Akash");
		
		stringBuffer.reverse();
		
		System.out.println(stringBuffer);
		
		stringBuffer.delete(0, 2);
		System.out.println(stringBuffer);

	}
}
