package com.akash.numOfIslands;

public class NumOfIsLand {
	
	/*for implement Java Code*/
	public static void main(String[] args) {
		/*int[][] grid=	{{1,1,1,1,0},
						{1,1,0,1,0},
						{1,1,0,0,0},
						{0,0,0,0,0}};*/
		
		int[][] grid=	{
							{1,1,0,0,0},
							{1,1,0,0,0},
							{0,0,1,0,0},
							{0,0,0,1,1}
						};
		
	int num	= numOfLand(grid);
		System.out.println(num);
	}

	private static int numOfLand(int[][] grid) {
		// TODO 
		if(grid == null || grid.length==0) {
			return 0;
		}
		int numIsLand = 0;
		
		for(int i = 0; i < grid.length; i++) {
			
			for(int j = 0; j < grid[i].length; j++) {
				
				if(grid[i][j] == 1) {
					numIsLand += dfs(grid, i, j);
				}
				
			}
			
		}
		return numIsLand;
	}

	private static int dfs(int[][] grid, int i, int j) {
		// TODO 
		if(i<0 || i>= grid.length || j<0 || j>= grid[i].length || grid[i][j]==0) {
			return 0;
		}
		
		grid[i][j] = 0;
		dfs(grid, i+1, j);
		dfs(grid, i-1, j);
		dfs(grid, i, j+1);
		dfs(grid, i, j-1);
		
		return 1;
	}

}
