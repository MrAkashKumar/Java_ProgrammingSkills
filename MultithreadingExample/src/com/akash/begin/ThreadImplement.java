package com.akash.begin;

public class ThreadImplement implements Runnable{

	public void run() {
		System.out.println("Thread is running.......");
	}
	
	public static void main(String[] args) {
		// TODO 
		ThreadImplement threadImplement = new ThreadImplement();
		Thread thread = new Thread(threadImplement);
		thread.start();
	}
}