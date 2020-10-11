package com.akash.abstraction;

public abstract class Shape {
	
	String color;
	
	abstract double area();
	
	public abstract String toString();
	
	public Shape(String color){
		this.color = color;
		System.out.println("Shape Constructor called");
	}
	
	public String getColor() {
		return color;
	}
	

}
