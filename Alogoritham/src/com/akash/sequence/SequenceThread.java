package com.akash.sequence;

public class SequenceThread implements Runnable{

	public int Print_Number= 10;
	static int number = 1;
	int remainder;
	
	static Object lock = new Object();
	
	public SequenceThread(int remainder) {
		// TODO 
		this.remainder = remainder;
	}
	public static void main(String[] args) {
		// TODO 

		SequenceThread sequenceThread0 = new SequenceThread(0);
		SequenceThread sequenceThread1 = new SequenceThread(1);
		SequenceThread sequenceThread2 = new SequenceThread(2);
		
		Thread t1 = new Thread(sequenceThread0, "T1");
		Thread t2 = new Thread(sequenceThread1, "T2");
		Thread t3 = new Thread(sequenceThread2, "T3");
		
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		// TODO 
		while (number < Print_Number-1) {
			synchronized (lock) {
				while(number%3 != remainder) {
					try {
						lock.wait();
						
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName()+ " "+ number);
				number++;
				lock.notifyAll();
			}
		}
	}
}