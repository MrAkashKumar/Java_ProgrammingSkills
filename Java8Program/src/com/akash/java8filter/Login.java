package com.akash.java8filter;

public class Login {
	String userName;
	String password;
	
	public Login(String userName, String password) {
		// TODO Auto-generated constructor stub
		this.userName = userName;
		this.password = password;
	}

	Boolean isWeek() {
		if(password.length()<=3 && userName.length() <= 4)
			return true;
		else
			return false;
	}
	
	
}
