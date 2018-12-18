package com.akash.pattern;

public class NumberFormat {

	public static void main(String[] args) {

		int last=15;
		 int start=1;
		     
		 for (int i = 1; i <= last; i++)
		 {
			 for(int k = i;k<last;k++)
		   System.out.print(" ");
		   for (int j =1; j <= i; j++){
		 
		    System.out.print("" +start+ " ");
		     start++;
		 
		 if(start>15){
		       break;
		 }
		 }
		 
		  System.out.println();
		 
		if(start>15){
		     break;
		  }
		 
		}
	}

}
