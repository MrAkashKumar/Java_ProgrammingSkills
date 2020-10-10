package com.akash.linklist;

import java.util.Collections;
import java.util.LinkedList;

public class SortLinkedList {

	public static void main(String[] args) {
		// TODO 
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		
		// unsorted
		System.out.println(linkedList);
		//Sorted natural
		Collections.sort(linkedList);
		System.out.println(linkedList);
		
		//Custom sorting
		Collections.sort(linkedList, Collections.reverseOrder());
		System.out.println(linkedList);
		

	}

}
