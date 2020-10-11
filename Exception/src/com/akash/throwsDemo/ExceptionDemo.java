package com.akash.throwsDemo;

import java.util.HashSet;
import java.util.Set;

public class ExceptionDemo {
	
	
	public static void main(String[] args) {
		/*try {
			//throw ;
			
		} catch (Exception e) {
			// TODO: 
		}finally {
			
		}*/
		
		Set<String> set = new HashSet<>();
		
		set.add("1");
		set.add("6");
		set.add("3");
		set.add(null);
		set.add("0");
		
		System.out.println(set);
		System.out.println(set.getClass());
		
	}

}
