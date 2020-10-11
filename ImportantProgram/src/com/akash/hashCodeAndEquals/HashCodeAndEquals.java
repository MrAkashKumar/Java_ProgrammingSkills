package com.akash.hashCodeAndEquals;

import java.util.HashMap;
import java.util.Map;

public class HashCodeAndEquals {

	public static void main(String[] args) {
		// TODO 
			Employee e1= new Employee(1);
			Employee e2= new Employee(1);
			
			Map<Employee, String> map = new HashMap<Employee, String>();
			map.put(e1, "1");
			map.put(e2, "1");
			
			Map<String, Integer> hmap = new HashMap<>();
			hmap.put("Akash", 25);
			hmap.put("Ravi", 25);
			
			System.out.println("HMap :: "+hmap.size());
			
			System.out.println(map.size()); // guess it 		
			System.out.println(map.entrySet()); //convert list
			
			// clue
			Integer i1 = new Integer(1);
			Integer i2 = new Integer(1);
			Map<Integer, String> map1 = new HashMap<>();
			map1.put(i1, "one");
			map1.put(i2, "one");

			System.out.println(map1.size()); // output // 1
	}
}
class Employee{
	int id;
	
	public Employee(int id) {
		this.id=id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
}
