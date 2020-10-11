package com.akash.deadLock;

public class AvoidDeadLock {
	public static void main(String[] args) {
		//method1();
	}
	
	public void method1() {
		synchronized (Integer.class) {
			System.out.println("Acquire lock on Integer.class object");
			synchronized (String.class) {
				System.out.println("Acquire lock on String.class object");
			}
		}
		
	}
	
	public void method2() {
		synchronized (Integer.class) {
			System.out.println("Acquire lock on Integer.class object");
			synchronized (String.class) {
				System.out.println("Acquire lock on String.class object");
			}
		}
	}

}
