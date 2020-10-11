package com.akash.logic;

public class A {
	
	void m1(Object b) {
		
	}
	
	void m1(String s) {
		
	}
	
	public static int m2(int d) {
		int a=1;
		int b=2;
		int c=3;
		try {
			System.out.println("Hello");
			return a;
		}catch(Exception e) {
			return b;
		}finally {
			return c;
		}
	}
	
	public static void main(String[] args) {
		
		int i=m2(54);
		System.out.println(i);
	}
	
	

}
