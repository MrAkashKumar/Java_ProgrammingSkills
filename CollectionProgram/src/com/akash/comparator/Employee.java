package com.akash.comparator;

import java.util.Comparator;

public class Employee implements Comparator<Employee>{
	
	private Integer id;
	private String name;
	private Integer mobile;
	
	public Employee() {
		// TODO 
	}
	public Employee(Integer id, String name, Integer mobile) {
		// TODO
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}
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
	public Integer getMobile() {
		return mobile;
	}
	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareToIgnoreCase(o2.getName());
	}
	
}
