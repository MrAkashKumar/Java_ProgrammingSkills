package com.akash.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO 
		// LinkedhashSet don't allow duplicate 
		ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,3,6,9,12,36,4,1,8,1,3,6,8,3));
		System.out.println(arrayList+ " :-> Size : "+ arrayList.size());
		
		LinkedHashSet<Integer> hashSet = new LinkedHashSet<>(arrayList);
		System.out.println(":::::> "+hashSet);
		
		Set<Integer> set = new HashSet<>(Arrays.asList(0,3,6,8,0,null,2,1,8,1,3,6,2,3));
		
		System.out.println(":::::>>>> : "+set);
		
		
		ArrayList<Integer> listwithout = new ArrayList<>(hashSet);
		System.out.println(listwithout);

	}

}
