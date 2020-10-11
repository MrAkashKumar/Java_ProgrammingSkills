package com.akash.binaryTreeRecursion;

public class BinaryTreeUsingRecursion {

	public static void main(String[] args) {
		// TODO 
		class TreeNode{
			String data;
			TreeNode left, right;
			
			TreeNode(String value){
				this.data = value;
				left = right = null;
			}		
			boolean isLeaf() {
				return left == null?right == null: false;
			}
		}
		TreeNode root;
	}
}
