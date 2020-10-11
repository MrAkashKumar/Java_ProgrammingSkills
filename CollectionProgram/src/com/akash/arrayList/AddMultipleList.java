package com.akash.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddMultipleList {

	public static void main(String[] args) {
		// TODO 
		List<String> list = Arrays.asList("Akash","Ravi", "Deepak");
		System.out.println("Add :"+list);
		//List 2
		ArrayList<String> otherList = new ArrayList<>();
		
		//skip element with value 
		list.stream().filter(name ->!name.equals("Akash")).forEachOrdered(otherList::add);		
		System.out.println("Simple : "+otherList);

	}
}