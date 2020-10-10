package com.akash.fibonacci;

public class Fibbonaci {

	public static void main(String[] args) {
		// TODO 
		int n= 10; 
		int t1=0, t2=1;
		System.out.println("First : "+ n + "  terms ");
		for(int i = 1; i<=n; i++) {
			System.out.println(t1 +"  "+ "  ");
			int sum = t1+t2;
			t1= t2;
			t2 =sum;			
		}
	}

}
