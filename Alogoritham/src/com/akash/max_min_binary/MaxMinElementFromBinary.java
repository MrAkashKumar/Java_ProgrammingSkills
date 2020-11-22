package com.akash.max_min_binary;

public class MaxMinElementFromBinary {

	static class Node{
		int key;
		Node left, right;
	};
	
	static Node newNode(int key) {
		Node temp = new Node();
		temp.key = key;
		temp.left = temp.right = null;
		return temp;
	}
	
	static void printMinMax(Node root) {
		if(root == null) {
			System.out.println("Tree is Empty");
			return;
		}
		
		Node current = root;
		
		Node pre;
		
		int max_value = Integer.MIN_VALUE;
		int min_value = Integer.MAX_VALUE;
		
		while(current != null) {
			
			if(current.left == null) {
				max_value = Math.max(max_value, current.key);
				min_value = Math.min(min_value, current.key);
				
				current = current.right;
			}else {
				pre = current.left;
				while(pre.right != null && pre.right != current)
					
					pre = pre.right;
				
				if(pre.right == null) {
					pre.right = current;
					current = current.left;
				}else {
					pre.right = null;
					max_value = Math.max(max_value, current.key);
					min_value = Math.min(min_value, current.key);
					
					current = current.right;	
				}	
			}
		}
		
		System.out.println("Max Value is : "+max_value);
		System.out.println("Min Value is : "+min_value);
		
	}
	
	public static void main(String[] args) {
		// TODO 
		Node root = newNode(15);
		root.left = newNode(19);
		root.right = newNode(11);
		
		root.right.left = newNode(17);
		root.right.right = newNode(29);
		
		root.right.left.left = newNode(10);
		root.right.left.right = newNode(15);
		root.right.right.left = newNode(11);
		root.right.right.right = newNode(14);
		
		printMinMax(root);
		
		root.left = newNode(19);

	}

}
