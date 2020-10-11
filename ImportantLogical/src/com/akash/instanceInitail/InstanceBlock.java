package com.akash.instanceInitail;

public class InstanceBlock {

	{
		// 2nd execute
		System.out.println("instance Block....."); // 2nd
	}
	
	static {
		// 1st execute
		System.out.println("hello i am static block"); // 1st
	}
	
	public InstanceBlock() {
		// 4rd execute
		// TODO 
		System.out.println("hello i am constructor ..."); // 4rd
	}
	
	{
		// 3rd execute
		System.out.println("hello I instance 2"); // 3rd
	}
	public static void main(String[] args) {
		// TODO 
		InstanceBlock instanceBlock = new InstanceBlock();
		System.out.println("instance Object "+ instanceBlock);
	}

}
