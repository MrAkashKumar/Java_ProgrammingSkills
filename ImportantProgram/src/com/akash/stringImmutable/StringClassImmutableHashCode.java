package com.akash.stringImmutable;

public class StringClassImmutableHashCode {

	public static void main(String[] args) {
		// TODO 
		String str = "Akki";
		str="kumar";
		String s = new String("Akki");
		String s2 = s;
		System.out.println(s2);
		
		System.out.println(str);
		str.hashCode();
		str.hashCode();
		System.out.println(str);

	}

}
