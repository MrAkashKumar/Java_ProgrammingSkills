package com.akash.searchNodeInBinary;

public class SearchNodeFromBinaryTree {
	
	public static class Node{
		int data;
		Node left;
		Node right;
		
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
			
		}
		
	}
	
	public Node root;
	public static boolean flag = false;
	
	public SearchNodeFromBinaryTree() {
		// TODO 
		root = null;
	}
	
	public void searchNode(Node temp, int value) {
		if(root == null) {
			System.out.println("Tree is Empty");
		}else {
			if(temp.data == value) {
				flag = true;
				return;
			}
			
			if(flag == false && temp.left != null) {
				searchNode(temp.left, value);
			}
			
			if(flag == false && temp.right != null) {
				searchNode(temp.right, value);
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		SearchNodeFromBinaryTree search = new SearchNodeFromBinaryTree();
		
		search.root = new Node(1);
		search.root.left = new Node(2);
		search.root.right = new Node(3);
		search.root.left.left = new Node(4);
		search.root.right.left = new Node(5);
		search.root.right.right = new Node(6);
		
		search.searchNode(search.root, 10);
		
		if(flag)
			System.out.println("Element is parent in the binary tree");
		else
			System.out.println("Element is not present in the binary tree");
	}

}