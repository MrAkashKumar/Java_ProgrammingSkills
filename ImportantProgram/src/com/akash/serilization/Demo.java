package com.akash.serilization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) throws IOException {
		// TODO Serialization
		FileOutputStream fos = new FileOutputStream("text.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		System.out.println(oos);
		Employee emp = new Employee();
		oos.writeObject(emp);
		
		// TODO DeSerialization
		FileInputStream fis = new FileInputStream("text.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		System.out.println(ois);
		try {
			Employee emp1 = (Employee)ois.readObject();
			System.out.println(emp1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
