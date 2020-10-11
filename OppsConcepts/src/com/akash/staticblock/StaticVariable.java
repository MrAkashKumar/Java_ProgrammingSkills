package com.akash.staticblock;

public class StaticVariable {

	 int var1;
	static int var3;
	static String var2;
	public static void main(String[] args) {
		// TODO 
		disp();

	}

	public static void disp() {
		// TODO 
		System.out.println("var1 is  "+ new StaticVariable().var1); // 0
		System.out.println("var1 is  "+ var2); // null
		System.out.println("var1 is  "+ var3); // 0
		
	}

}
