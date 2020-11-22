package com.akash.largestPrime;

public class LargestPrimeNumber {

	public static void main(String[] args) {
		// TODO 
		String str = "1000";
		StringBuilder sb = new StringBuilder(str);
		System.out.println(largestPrimeNumber(sb));

	}

	private static String largestPrimeNumber(StringBuilder sb) {
		// TODO 
		for(int i = 0; i<sb.length(); i++) {
			
			if (!isPrime(sb.charAt(i))) {
				while(i>=0 && sb.charAt(i) <= '2')
					i--;
					if(i<0) {
						i=0;
						decreaseNum(sb, i);
					}
					else 
						decreaseNum(sb, i);
					
				for(int j = i+1; j<sb.length(); j++) 
					sb.setCharAt(j, '7');
					break;
			}
			
		}
		return sb.toString();
	}

	private static void decreaseNum(StringBuilder sb, int i) {
		// TODO 
		if(sb.charAt(i)<='2') {
			sb.deleteCharAt(i);
			sb.setCharAt(i, '7');
		}else if(sb.charAt(i)=='3') {
			sb.setCharAt(i, '2');
		}else if(sb.charAt(i) <= '5') {
			sb.setCharAt(i, '3');
		}else if(sb.charAt(i)<= '7') {
			sb.setCharAt(i, '5');
		}else {
			sb.setCharAt(i, '7');
		}
		return;
	}

	private static boolean isPrime(char c) {
		// TODO 
		return (c=='2' || c=='3' || c=='5' || c=='7');
	}

}