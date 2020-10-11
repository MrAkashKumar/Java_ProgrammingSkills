package com.akash.instanceInitail;

public class StaticBlock {

	public static void main(String[] args) {
		System.out.println("how to main method");
		new StaticBlock();
		System.out.println(new StaticBlock().j);
		System.out.println(i);
	}
	static int i;
	int j=20;
	{
		System.out.println("I am Instance");
	}
	static{
		i =10;
		System.out.println("static block is : "+ i);
	}
	
	public StaticBlock() {
		System.out.println("I am constructor");
	}
	

}
