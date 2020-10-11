package com.akash.abstraction;

public class Rectangle extends Shape {
	
	double length;
	double width;

	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
		System.out.println("Rectangle Constructor ");
		// TODO 
	}

	@Override
	double area() {
		// TODO 
		return length*width;
	}

	@Override
	public String toString() {
		// TODO 
		return "Rectangle color is " + super.color +  
                "and area is : " + area(); 
	}
}