package com.akash.programming;

public class CloneExample implements Cloneable{

	String sal;
	String size;
	String company;
	
	public static void main(String[] args) {
		CloneExample clone = new CloneExample();
		clone.sal = "7000000";
		clone.size = "10000";
		clone.company = "Sapient";
		
		try {
			CloneExample cloneExample =  (CloneExample) clone.clone();
			
			System.out.println(cloneExample.sal);
			System.out.println(cloneExample.size);
			System.out.println(cloneExample.company);
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
