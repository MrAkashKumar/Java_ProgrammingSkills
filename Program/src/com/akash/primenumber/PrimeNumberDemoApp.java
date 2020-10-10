package com.akash.primenumber;

// import java.util.Scanner;

public class PrimeNumberDemoApp {

	// 2, 3, 5, 7, 11, 13, 17

	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the Number");
//		int n =scanner.nextInt();
		
		
		int n = 20;

		for (int i = 2; i < n; i++) {
			
			boolean isPrime = true;

			for (int j = 2; j <i; j++) {

				if ( i%j== 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(" "+ i);
			}
		}
		//scanner.close();
	}


}
