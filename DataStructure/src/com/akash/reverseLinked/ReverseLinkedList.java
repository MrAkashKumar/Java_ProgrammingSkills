package com.akash.reverseLinked;

public class ReverseLinkedList {
	
		static Node head;
		
		static class Node{
			int data;
			Node next;
			
			Node(int d){
				data =  d;
				next = null;
			}
		}
		
		public Node reverse(Node node) {
			Node current = node;
			Node next = null;
			Node prev = null;
			
			while(current != null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			node = prev;
			 
			return node;
		}
		
		void printList(Node node) {
			while (node != null) {
				System.out.print(node.data + " ");
				node = node.next;
			}
		}
	
	
	public static void main(String[] args) {
		// TODO 
		ReverseLinkedList list = new ReverseLinkedList();
		list.head = new Node(20);
		list.head.next = new Node(30);
		list.head.next.next = new Node(40);
		list.head.next.next.next = new Node(50);
		
		System.out.println(" Original ");
		list.printList(head);;
		head = list.reverse(head);
		System.out.println(" ");
		System.out.println(" Reverse linked list ");
		list.printList(head);

	}
}