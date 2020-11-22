package com.akash.largesttriangle;

public class LargestAreaTriangleAlgo {

	public static void main(String[] args) {
		
		int points[][] = {{0,0},{0,1},{1,0},{0,2},{2,0}};
		
		double result = LargestTriangleArea(points);
		System.out.println(result);
	}

	private static double LargestTriangleArea(int[][] points) {
		// TODO 
		
		double res = -1;
		
		for(int [] x : points) {
			for(int [] y : points) {
				for(int [] z : points) {
					double temp = 0.5*Math.abs(x[0]*(y[1]-z[1])+y[0]*(z[1]-x[1])+z[0]*(x[1]-y[1]));
					res = Math.max(res, temp);
				}
			}
		}
		return res;
	}
}