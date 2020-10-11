package com.akash.overridingMethodExam;

public class Runner {

	public static void main(String[] args) {
		
		Base base = new Derived();
		base.print(); /*Derived*/
		
		Derived.get();

	}

}
