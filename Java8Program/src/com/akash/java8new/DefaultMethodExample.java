package com.akash.java8new;


public interface DefaultMethodExample {
	
	String getBrand();
	
	String speedUp();
	
	String slowDown();
	
	default String turnAlramOn() {
		return "Akash Kumar";
	}
	
	default String turnOn() {
		return "Hello I am";
	}
	default String onClick(String a) {
		return "Ahh";
	}

}
