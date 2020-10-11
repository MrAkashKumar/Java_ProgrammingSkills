package com.akash.dataStructure;

public class LinkedListLoop {
		Node head;
		
		class Node{
			int data;
			Node next;
			
			Node(int d){
				this.data = d;
				next = null;
			}
		}

	private static boolean ischeckLinkedLoop() {
		// TODO Auto-generated method stub
		
		Node fastPoint = null;
		Node slowPoint = null;
		
		while(slowPoint != null && fastPoint != null & fastPoint.next != null) {
			
			fastPoint = fastPoint.next.next;
			slowPoint = slowPoint.next;
			
			if(fastPoint == slowPoint) {
				return true;
			}	
		}
		return false;
		
	}
	
	

}
