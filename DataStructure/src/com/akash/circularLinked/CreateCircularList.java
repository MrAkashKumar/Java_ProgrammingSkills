package com.akash.circularLinked;

public class CreateCircularList {
	static 	Node head= null;
	static Node tail= null;
	public class Node{
		int data;
		Node next;	
		Node(int d){
			data = d;
		}
	}
	public void add(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			node.next = head;
		}else {
			tail.next = node;
			tail = node;
			tail.next = head;
		}
	}
	void display() {
		Node current = head;
		if(head == null) {
			System.out.println("List is empty....");
		}else {
			System.out.println("Nodes of the circular linked list");
			do {
				System.out.println("Node of the circular linked list");
				System.out.println(""+current.data);
				current = current.next;
			}while(current !=head);
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODOO	
		CreateCircularList circle = new CreateCircularList();
		circle.add(2);
		circle.add(5);
		circle.add(8);
		circle.display();	
	}
}