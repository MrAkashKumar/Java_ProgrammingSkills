package com.akash.overriding;

public class MainClass {

	public static void main(String[] args) {
		Doctor doctor = new Doctor();
		doctor.treatPatient();
		
		Surgeon surgeon = new Surgeon();
		surgeon.treatPatient();
		
		Doctor s =  new Surgeon();
		System.out.println(" -----");
		s.treatPatient(); /*Base class Surgeon*/

	}

}
