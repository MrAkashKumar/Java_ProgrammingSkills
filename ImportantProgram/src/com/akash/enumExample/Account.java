package com.akash.enumExample;

public class Account<Type> {
	private Type accountType;
	public void add(Type newType) {
		accountType = newType;
	}
	public Type get() {
		return accountType;
	}
}
