package com.akash.java8new;

import java.util.ArrayList;

public class RemoveIfMethodImpl {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arrayList = new ArrayList<>();
		
		arrayList.add(52);
		arrayList.add(23); 
		arrayList.add(32); 
		arrayList.add(45); 
		arrayList.add(63); 
		
		/*Added in list find out the divisible value by 3*/
		
		arrayList.removeIf(n-> (n%3!= 0));
		
		for (Integer number : arrayList) {
			System.out.println("divisible Value by 3 :: "+ number);
		}	
	}
}