package com.akash.serializations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ClientTest {
	
	public static void main(String[] args) {
		
		String filename = "employee.ser";
		
		//serializeObject(filename);
		deSerializeObject(filename);
	}

	private static void deSerializeObject(String filename) {
		// TODO 
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(filename)))){
			Object object = ois.readObject();
			Employee employee = (Employee)object;
			System.out.println("Employee Object is deserialized ...");
			System.out.println("ID : "+ employee.getId());
			System.out.println("NAME : "+ employee.getName());
			System.out.println("Email : "+ employee.getEmail());
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	private static void serializeObject(String filename) {
		// TODO 
		Employee employee = new Employee();
		employee.setId(1001);
		employee.setName("Akash Kumar");
		employee.setEmail("akash3662@gmail.com");
		try (ObjectOutputStream oob = new ObjectOutputStream(new FileOutputStream(new File(filename)))){
			oob.writeObject(employee);
			System.out.println("Employee Object is Serialized");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
