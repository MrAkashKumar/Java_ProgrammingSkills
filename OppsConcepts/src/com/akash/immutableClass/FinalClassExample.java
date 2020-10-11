package com.akash.immutableClass;

public final class FinalClassExample {
	
	private final int id;
	private final String name;

	public FinalClassExample(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		FinalClassExample finalClass = new FinalClassExample("Akash", 5);
		System.out.println(finalClass.getName());
		System.out.println(finalClass.getId());
	}
}	