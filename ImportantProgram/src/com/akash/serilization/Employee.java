package com.akash.serilization;

import java.io.Serializable;

public class Employee implements Cloneable, Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int empId = 105;
	
	public Employee() {
		System.out.println("Employee class ");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO 
		return super.clone();
	}
}