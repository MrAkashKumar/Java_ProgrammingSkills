package com.akash.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		 final int s;
	
		// TODO 
		int a= 2;
		System.out.println(a);
		System.out.println(hello(15));
		
		/*try {
			if(a== 2) {
				System.out.println("Yes");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("err");
		}finally {
			 b= 2;
			 System.out.println(b);
			 System.out.println("finally");
		}*/
	}

	public static int hello(int a) {
		try {
			System.out.println("try");
			return a;
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("catch");
		}finally {
			System.out.println("hello");
		}
		return a;
	}
}