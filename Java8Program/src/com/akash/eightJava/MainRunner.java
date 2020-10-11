package com.akash.eightJava;

public class MainRunner implements DefaultAExample, DefaultBExample {

	
	public static void main(String[] args) {
		new MainRunner().m1();
	}

	@Override
	public void m1() {
		DefaultAExample.super.m1();
		DefaultBExample.super.m1();
	}

}
