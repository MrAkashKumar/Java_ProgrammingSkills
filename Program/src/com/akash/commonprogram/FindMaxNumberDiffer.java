package com.akash.commonprogram;

public class FindMaxNumberDiffer {
	
	static int maxNumber(int str[], int size) {
		int max =  str[1] - str[0];
		for(int i =0; i<size; i++) {
			for(int j = i+1; j<size; j++) {
				if(str[j]-str[i]>max) {
					max = str[j]-str[i];
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int str[] = {15,62,482,203,142,162};
		
		System.out.println("largest Number : "+ maxNumber(str, str.length));

	}

}
