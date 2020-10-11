package com.akash.cloneDemo;

public class CloneDemoExample implements Cloneable{
	
	String sal;
	String size;
	String company;

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub

		CloneDemoExample clones = new CloneDemoExample();
		clones.sal="400000";
		clones.size="24";
		clones.company="FIS";
		
		CloneDemoExample cDemo = (CloneDemoExample)clones.clone();
		
		System.out.println(cDemo.sal +" another Clone Man");
		System.out.println(cDemo.size +" another Clone Man");
		System.out.println(cDemo.company +" another Clone Man");
	}

}
