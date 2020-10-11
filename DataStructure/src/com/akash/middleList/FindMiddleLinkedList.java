package com.akash.middleList;

public class FindMiddleLinkedList {
	Node head;
	
	class Node{
		int data;
		Node next;	
		Node(int d){
			data = d;
			next = null;
		}
	}
	void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if(head != null) {
			while(fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println("The middle element is "+ slow_ptr.data + " \n");
		}
	}
	public void pushNode(int newData ) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
	}
	public void printList() {
		Node pnode = head;
		while(pnode != null) {
			System.out.println(pnode.data+ " -> ");
			pnode = pnode.next;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args) { 
		FindMiddleLinkedList find = new FindMiddleLinkedList();
		for(int i = 5; i>0; --i) {
			find.pushNode(i);
			find.printList();
			find.printMiddle();
		}
	}
}