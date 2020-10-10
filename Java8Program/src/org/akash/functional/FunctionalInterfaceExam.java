package org.akash.functional;

public class FunctionalInterfaceExam {
	
	public static void main(String[] args) {
		System.out.println("Hello");
		Runnable r = ()->{
			System.out.println("Hello");
		};
		
	}
}
