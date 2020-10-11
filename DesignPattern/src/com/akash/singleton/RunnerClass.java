package com.akash.singleton;

public class RunnerClass {
	
	public static void main(String[] args) {
		
		SingletonApp singletonApp = SingletonApp.getInstance();
		System.out.println(singletonApp);
	}

}
