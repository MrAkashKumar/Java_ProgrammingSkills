package com.akash.inheriDemo;

public class Runner implements MyInterface {
	
	class Inner{
		void msg() {
			System.out.println("hellp");
		}
	}
	
	public static void main(String[] args) {
		Runner.Inner in = new Runner().new Inner();
		in.msg(); /*method called*/
		Interfacehdh in2 = new Interfacehdh();
		in2.method1(); 
		in2.method2();
	}

	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

}
