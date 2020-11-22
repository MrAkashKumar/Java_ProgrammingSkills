package com.akash.matrixsprial;

public class SprialOrderValue {

	public static void main(String[] args) {
		// TODO 
		int [][] mat = 
			{
					{1,3,5,7,9},
					{4,6,1,8,0},
					{5,7,2,1,3},
					{1,3,1,7,4},
			};

		sprialOrder(mat);
	}

	private static void sprialOrder(int[][] mat) {
		// TODO 
		
		int top = 0, bottom = mat.length-1;
		int left=0, right = mat[0].length-1;
		
		while(true) {
			
			if(left>right) {
				break;
			}
			
			for(int i = left; i<=right; i++) {
				System.out.print(mat[top][i]+" ");
			}
			top++;
			
			if(top>bottom) {
				break;
			}
			
			for(int i= top; i<=bottom; i++) {
				System.out.print(mat[i][right]+" ");
			}
			right--;
			
			if(left>right) {
				break;
			}
			
			for(int i = right; i>=left; i--) {
				System.out.print(mat[bottom][i]+" ");
			}
			bottom--;
			
			
			if(top>bottom) {
				break;
			}
			
			for(int i = bottom; i>=top; i--) {
				System.out.print(mat[i][left]+ " ");
			}
			left++;
			
		}	
	}
}