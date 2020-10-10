package com.akash.inheritance.poly;

public class Runner {
	
	public static void main(String[] arg) {
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		Animal ani = new Dog();
		System.out.println(" Animal: + : +  ");
		
		ani.onEating(); // Dog class
		
		System.out.println(" Animal : + :  ");
		//dog.onEating();
		
		dog.onAction();
		
		animal.onEating();
		
	}

}
