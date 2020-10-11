package com.akash.begin;

public class MultiThreadingExtending extends Thread {
	
	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		MultiThreadingExtending multiThreadingExtending = new MultiThreadingExtending();
		multiThreadingExtending.start();
	}
	
	
	

}
