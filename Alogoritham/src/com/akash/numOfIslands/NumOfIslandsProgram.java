package com.akash.numOfIslands;

public class NumOfIslandsProgram {

	/*for leet Code  implement*/
	public static void main(String[] args) {
		// TODO 
		char[][] grid=	{
							{1,1,1,1,0},
							{1,1,0,1,0},
							{1,1,0,0,0},
							{0,0,0,0,0}
						};
		
		int count = numIsland(grid);
		
		System.out.println(count);
	}

	private static int numIsland(char[][] grid) {
		// TODO 
		int count = 0;
		for(int i =0; i<grid.length; i++) {
			for(int j = 0; j<grid[i].length;j++) {
				
				if(grid[i][j] =='1') {
					count += 1;
					callBFS(grid, i, j);
				}
			}
		}
		return count;
	}

	private static void callBFS(char[][] grid, int i, int j) {
		// TODO 
		if(i<0 || i>=grid.length || j<0 || j>=grid[i].length || grid[i][j] == '0') 
			return;
		
		grid[i][j] = '0';
		callBFS(grid, i+1, j);
		callBFS(grid, i-1, j);
		callBFS(grid, i, j-1);
		callBFS(grid, i, j+1);	
	}
}