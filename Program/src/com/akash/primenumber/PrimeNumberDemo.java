package com.akash.primenumber;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		// TODO 
		int n= 20;
		for(int i = 2; i<n;i++) {  //1
			int flag = 1;
			for(int j = 2;j<i; j++) { //2		
				if(i%j==0) { // 3
					flag = 0;
					break;
				}
			}
			if(flag == 1) { // 4
				System.out.println(i + " ");
			}
		}
	}
}