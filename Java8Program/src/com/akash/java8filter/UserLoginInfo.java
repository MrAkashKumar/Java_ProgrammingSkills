package com.akash.java8filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class UserLoginInfo {
	
	public static void main(String[] args) {
		
		List<Login> userLogin = new ArrayList<Login>();
		
		userLogin.add(new Login("akash","akki"));
		userLogin.add(new Login("ravi","123"));
		userLogin.add(new Login("abhi","abh"));
		userLogin.add(new Login("akash","aki"));
		userLogin.add(new Login("Priya","pri"));
		userLogin.add(new Login("Harshi","har"));
		
		System.out.println("For Each Method Lambda Expression ");
		
		userLogin.forEach(user ->{
			System.out.println("userName All ::  "+ user.userName);
		});
		
		Predicate<Login> preRules = (pre) -> pre.isWeek() == true;
		
		System.out.println("<<<<< ::::: People with weak password ::::: >>>>>");
		
		userLogin.forEach((user) ->{
			if(preRules.test(user)) {
				System.out.println("UserName :: "+ user.userName);
				System.out.println("Password :: "+ user.password);
			}
		});
		
		
	}

}
