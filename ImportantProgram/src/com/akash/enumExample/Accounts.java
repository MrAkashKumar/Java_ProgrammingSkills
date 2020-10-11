package com.akash.enumExample;

public class Accounts<S> {
	
	private S accountType;
	public void add(S newType) {
		accountType = newType;
	}
	public S get() {
		return accountType;
	}

}
