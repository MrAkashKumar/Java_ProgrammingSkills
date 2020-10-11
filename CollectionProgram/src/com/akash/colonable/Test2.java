package com.akash.colonable;

public class Test2 implements Cloneable{
	
	int a;
	int b;
	
	Test test = new Test();
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}
