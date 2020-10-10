package com.akash.java8;

public class UserPojo {
	
	private String name;
	private Integer age = 30;
	
	public UserPojo(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "UserPojo [name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
