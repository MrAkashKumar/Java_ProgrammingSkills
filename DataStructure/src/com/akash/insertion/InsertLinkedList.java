package com.akash.insertion;

public class InsertLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int id){
			data = id;
			next = null;
		}
	}
	static InsertLinkedList insert(InsertLinkedList list, int data){
		Node node = new Node(data);
		node.next= null;
		
		if(list.head == null) {
			list.head =  node;
		}else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = node;
		}
		return list;
	}
	// method to print list
	static void printList(InsertLinkedList list) {
		Node cNode = list.head;
		while(cNode != null) {
			System.out.print(cNode.data+ " ");
			cNode = cNode.next;
		}
	}
	public static void main(String[] args) {
		// TODO 
		
		InsertLinkedList add = new InsertLinkedList();
		// ----------------Insertion ---------------
		System.out.println("LinkedList: ");
		 add=insert(add, 1);
		 add=insert(add, 2);
		 add=insert(add, 3);
		 add=insert(add, 4);
		 add=insert(add, 5);
		 add=insert(add, 6);
		 add=insert(add, 7);
		 add=insert(add, 8);
		
		 // Print the LinkedList
		 printList(add);
		

	}

}
