package com.akash.lambdaExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserLoginInfo {

	public static void main(String[] args) {

		/* Add in Collection using ArrayList */

		List<LoginDTO> login = new ArrayList<LoginDTO>();
		login.add(new LoginDTO("akash", "akash123"));
		login.add(new LoginDTO("deepak", "deepak123"));
		login.add(new LoginDTO("ravi", "ravi"));
		login.add(new LoginDTO("aryan", "aryan"));
		login.add(new LoginDTO("laksya", "laksh"));

		System.out.println(login);

		System.out.println("For Each Method");

		for (LoginDTO loginDTO : login) {
			System.out.println("UserName : " + loginDTO.getUsername());
			System.out.println("Password : " + loginDTO.getPassword());
		}

		System.out.println("Iteration Method ----------------------");

		Iterator<LoginDTO> iterator = login.iterator();

		while (iterator.hasNext()) {
			LoginDTO loginDto = iterator.next();
			System.out.println("UserName for Iterator : " + loginDto.getUsername());
			System.out.println("Password for Iterator : " + loginDto.getPassword());
		}

		System.out.println("lambda Expression Method ..................");

		login.forEach((loginInfo) -> System.out.println("UserName : " + loginInfo.getPassword()));

		/* OR */

		System.out.println("...............lambda Expression ............");
		login.forEach((loginInfo) -> {
			System.out.println("UserName : " + loginInfo.getUsername());
			System.out.println("Password : " + loginInfo.getPassword());
		});

	}
}
