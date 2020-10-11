package com.akash.deadLock;

public class ResultDeadLock {
	
	public static void main(String[] args) {
		method1();
		method2();
	}	
	public static void method1() {
		synchronized (String.class) {
			System.out.println("Acquire lock on String.class object M1");
			synchronized(Integer.class) {
				System.out.println("Acquire lock on Integer.class object M1");
			}
		}
	}

	public static  void method2() {
		synchronized (Integer.class) {
			System.out.println("Acquire lock on Integer.class object M2");
			synchronized (String.class) {
				System.out.println("Acquire lock on String.class object M2");
			}
		}
	}
}