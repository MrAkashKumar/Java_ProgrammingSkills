package com.akash.stringBuffer;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer stringBuffer = new StringBuffer("Akash");
		int length1 = stringBuffer.length();
		System.out.println(":::: "+length1);
		stringBuffer.append(" Kumar");
		int length = stringBuffer.length();
		int capacity = stringBuffer.capacity();
		System.out.println(capacity+ " : : capacity");
		System.out.println(length);
		
		System.out.println(stringBuffer);
	}

}
