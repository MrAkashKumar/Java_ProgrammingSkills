package com.akash.reverseLinked;

public class ReverseLinked {
	
	 static Node head;
	
	  static class Node {
		 int data;
		 Node next;
		
		public Node(int d){
			data = d;
			next = null;
		}
	}
	 
	/* print content of double linked list */
	 
	 void printList(Node node) {
		 while(node != null) {
			 System.out.println(node.data+ " ");
			 node = node.next;
		 }
	 }
	 
	/* function to reverse linked list*/
	 Node reverse(Node node) {
		 Node prev = null;
		 Node current = node;
		 Node next = null;
		 
		 while(current!= null ) {
			 next = current.next;
			 current.next = prev;
			 prev = current;
			 current = next;
		 }
		 node = prev;
		 return node;
	 }
	 
	 public static void main(String[] args) {
		ReverseLinked linked = new ReverseLinked();
		linked.head = new Node(85);
		linked.head.next = new Node(50);
		linked.head.next.next = new Node(70);
		linked.head.next.next.next = new Node(60);
		
		System.out.println("Given linked list");
		linked.printList(head);
		head = linked.reverse(head);
		System.out.println(" ");
		System.out.println("Reverse Linked List");
		linked.printList(head);
		
	}
}