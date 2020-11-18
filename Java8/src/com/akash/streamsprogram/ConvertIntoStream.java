package com.akash.streamsprogram;

import java.util.ArrayList;
import java.util.List;

public class ConvertIntoStream {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Akash");
		list.add("Prakash");
		list.add("Avinash");
		list.add("Anshit");
		list.add("Ravi");
		list.add("Vicky");
		list.add("Rocky");
		list.add("Vikash");
		
		
		getAllRecordFromStartA(list);
		getAllCountFromStartA(list);
		sortedAllListFromStartA(list);
		
	}

	private static void sortedAllListFromStartA(List<String> list) {
		// TODO 
		System.out.println("------- Sorted ------- ");
		
		list.stream().filter((f) -> f.startsWith("A"))
			.sorted().forEach(System.out :: println);
		
	}

	private static void getAllCountFromStartA(List<String> list) {
		// TODO 
		System.out.println("********* Counted *******");
		long countOfRecordsStartsWithA = list.stream().
			       filter((s) -> s.startsWith("A")).count();
		System.out.println("countOfRecordsStartsWithA = "+countOfRecordsStartsWithA);
		
	}

	private static void getAllRecordFromStartA(List<String> list) {
 
		/*Use stream and filter*/
		list.stream().filter((e) -> e.startsWith("A"))
		.forEach(System.out::println);
	}
	
	

	
}