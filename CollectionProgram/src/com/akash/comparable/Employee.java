package com.akash.comparable;

public class Employee implements Comparable<Employee>{
	private Integer id;
	private String name;
	private Integer year;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Employee(Integer id,String name, Integer year ) {
		this.id = id;
		this.name = name;
		this.year = year;	
	}
	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.getId().compareTo(o.getId());
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", year=" + year + "]";
	}
	
	
	

}
