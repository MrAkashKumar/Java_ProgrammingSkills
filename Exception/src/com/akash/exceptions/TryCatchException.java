package com.akash.exceptions;

public class TryCatchException {

	public static void main(String[] args) {
		// TODO 
		getExampleDemo();
	}

	public static void getExampleDemo() {
		// TODO 
		
		try{
			int i = 1/0;
			System.out.println("my resource is failure....."+ i);
		} catch (Exception e) {
			System.out.println("execute catch : "+ e);
			// TODO: handle exception
		}finally {
			System.out.println("it is always execute. it is important code such as closing");
		}		
	}
}