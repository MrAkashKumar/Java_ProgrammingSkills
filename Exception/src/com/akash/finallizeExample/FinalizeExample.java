package com.akash.finallizeExample;

public class FinalizeExample {
	
	public void finalize() {
		System.out.println("Finalize is called ....");
	}

	public static void main(String[] args) {
		
		// finalize is used to perform clean up processing just
		// before object is garbage collected.
		
		FinalizeExample finalizeExample = new FinalizeExample();
		FinalizeExample finalizeExample2 = new FinalizeExample();
		
		System.out.println(finalizeExample);
		System.out.println(finalizeExample2);
		
		finalizeExample = null;
		finalizeExample2 = null;
		System.gc();

	}

}
