package com.akash.lambdaExpressionProgram;

import java.util.ArrayList;
import java.util.List;

public class ProgramExample {
	
	static int c = 0;
	
	public static void main(String[] args) {
		getLogicalQuestion();
		getLogicalQuestion2();
		getLogicalQuestion1();
		getLogicalQuestion3();
		getLogicalQuestion4();
	}
	
	private static void getLogicalQuestion4() {
		// TODO Auto-generated method stub
		
		List list = new ArrayList();
		
		System.out.println(list.get(0) instanceof Object);
		System.out.println(list.get(1) instanceof Object);
		String str = "strawbe";
		
		str.substring(2, 5);
		System.out.println(str);
		
		for(int i = 0; i<10; i++) {
			i+=1;
			System.out.println("Helllo");
		}
	}
	private static void getLogicalQuestion3() {
		// TODO Auto-generated method stub
		String ess = "hello ";
		String newMess = ess.substring(6, 12);
		/*+ess.substring(12, 6);*/ // Error 
		System.out.println(newMess);
	}
	private static void getLogicalQuestion1() {
		// TODO Auto-generated method stub
		if(c <3) {
			c++;
			main(null);
		}else {
			return;
		}
		System.out.println(c);
	}
	private static void getLogicalQuestion2() {
		// TODO Auto-generated method stub	
		int x = 5;
		x= 10;
		System.out.println(x);
	}
	
	private static void getLogicalQuestion() {
		// TODO Auto-generated method stub
		List<Boolean> list = new ArrayList();
		
		list.add(true);
		list.add(Boolean.parseBoolean("FalSe"));
		list.add(Boolean.TRUE);
		System.out.println(list.size());
		System.out.println(list.get(1) instanceof Boolean);
	}
}