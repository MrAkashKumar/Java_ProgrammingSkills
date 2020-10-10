package com.akash.lambdaExpression;

public class LoginDTO {
	
	private String username;
	private String password;
	
	LoginDTO(String username, String password){
		this.username = username;
		this.password = password;	
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginDTO [username=" + username + ", password=" + password + "]";
	}
	
	

}
