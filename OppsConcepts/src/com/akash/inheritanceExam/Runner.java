package com.akash.inheritanceExam;

public class Runner {
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.msg();
		p.heloo();
		System.out.println( "Parent P : "+p.x);
		
		Parent p1 = new Child();
		p1.msg();
		p1.heloo();
		System.out.println("Parent P1 : "+p1.x);
		
		Child c = new Child();
		c.msg();
		c.heloo();
		System.out.println("Child C : " +c.x);
		
		/*Child child = (Child) new Parent();
		child.msg();
		System.out.println("Child child  "+child.x);*/
	}

}
