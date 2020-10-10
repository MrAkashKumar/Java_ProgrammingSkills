package com.akash.primenumber;

public class PrimeNumberAsCondition {

	public static void main(String[] args) {

		int limit = 100;
		System.out.println("Prime Number between 1 to "+ limit);
		
		for(int i = 2; i<limit; i++) {
			boolean isPrime = true;
			for(int j = 2; j<i; j++) {
				if(i%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				System.out.println("Prime Number : "+ i);
		}
		
	}
	// output
//	Prime Number between 1 to 50
//	Prime Number : 2
//	Prime Number : 3
//	Prime Number : 5
//	Prime Number : 7
//	Prime Number : 11
//	Prime Number : 13
//	Prime Number : 17
//	Prime Number : 19
//	Prime Number : 23
//	Prime Number : 29
//	Prime Number : 31
//	Prime Number : 37
//	Prime Number : 41
//	Prime Number : 43
//	Prime Number : 47

}
