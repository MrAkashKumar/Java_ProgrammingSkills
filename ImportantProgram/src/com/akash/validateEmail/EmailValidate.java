package com.akash.validateEmail;

import java.util.regex.Pattern;

public class EmailValidate {

	public static void main(String[] args) {
		// TODO 
		
		String email = "akash36@gmail.com";
		
		if(isvalid(email)) {
			System.out.println("Yes, Validate");
		}else {
			System.out.println("Not, Validate");
		}

	}

	private static boolean isvalid(String email) {
		// TODO 
		String emailRegax = "^[a-zA-Z0-9_+&*-]+(?:\\."+
							"[a-zA-Z0-9_+&*-]+)*@"+"(?:[a-zA-Z0-9-]+\\.)"
							+ "+[a-z"+"A-Z] {2,7}$";
		
		Pattern pattern = Pattern.compile(emailRegax);
		if(email == null) {
			return false;
		}
		return pattern.matcher(email).matches();
		
	}

}
