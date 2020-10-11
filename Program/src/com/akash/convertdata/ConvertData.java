package com.akash.convertdata;

public class ConvertData {

	public static void main(String[] args) {
		
		int age = 24;
		double salary = 15500.23;
		boolean isTrue = true;
		String rate = "3.6";
		
		// convert to String
		String newSalary = String.valueOf(salary);
		String newAge = String.valueOf(age);
		String newisTrue = String.valueOf(isTrue);
		
		System.out.println(newSalary);
		System.out.println(newAge);
		System.out.println(newisTrue);
		
		
		 //convert to integer
		int newRate = Integer.parseInt(rate);
		//int newRate1 = (int) rate; 
		int Newsalary = (int) salary;
		
		System.out.println(newRate);
		System.out.println(Newsalary);
		
		
		//convert to double
		double newrate = Double.parseDouble(rate);
		double newAgeDouble = (double) age;
		
		System.out.println(newrate);
		System.out.println(newAgeDouble);

	}
}