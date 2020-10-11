package com.akash.calculatorException;

public class Calculator {

	public void divide(int fn, int sn) {
		System.out.println("Division Start.....");
		try {
			int res = fn/sn;
			System.out.println(" Result  : "+res);
		}catch(ArithmeticException e) {
			System.out.println("hey Golu ...... Enter proper value"+ e);
		}
		System.out.println("Division end....");
	}
}
