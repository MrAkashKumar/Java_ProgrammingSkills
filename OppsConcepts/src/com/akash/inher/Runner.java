package com.akash.inher;


public class Runner {

	public static void main(String[] args)  {
		
		Animal animal = new Animal();
		animal.getMsg(); /*Animal*/
		System.out.println("Animal: "+animal.x); /*Animal*/
		System.out.println("---- Animal class as Dog -----"); /*Animal*/
		
		Animal animal1 = new Dog();
		animal1.getMsg(); /*Dog class*/
		System.out.println("Animal Object : "+animal1.x); /*refer Animal class*/
		System.out.println("Animal Static  : "+Animal.staticX); /*refer Animal*/
		
		Dog dog = new Dog();
		dog.getMsg(); /*dog*/
		
		System.out.println("Dog liter: "+dog.x); /*dog*/
		System.out.println("Dog Static : "+Dog.staticX); /*dog*/
		
		//Dog dog1 =(Dog) new Animal();
		//dog1.getMsg();
		//System.out.println("wide "+dog1.x);
	}
}
