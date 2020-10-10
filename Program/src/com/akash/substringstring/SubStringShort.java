package com.akash.substringstring;

import java.util.Arrays;

public class SubStringShort {

	 public static void subShort(String[] arr, int n, int maxLen) 
	    { 
	  
	        int count[] = new int[maxLen]; 
	        String[] sorts = new String[maxLen]; 
	  
	        Arrays.fill(count, 0); 
	        Arrays.fill(sorts, ""); 
	  
	        for (int i = 0; i < n; i++) { 
	  
	            String s = arr[i]; 
	            int len = s.length(); 
	  
	            if (count[len - 1] == 0) { 
	                sorts[len - 1] = s; 
	                count[len - 1] = 1; 
	            } 
	            else if (sorts[len - 1].equals(s)) { 
	  
	                count[len - 1]++; 
	            } 
	            else { 
	  	             return; 
	            } 
	        } 
	  
	        int index = 0; 
	  
	        while (count[index] == 0) 
	            index++; 
	  
	        int prev = index; 
	        String preString = sorts[prev]; 
	  
	        index++; 
	  
	        for (; index < maxLen; index++) { 
	  
	            if (count[index] != 0) { 
	                String current = sorts[index]; 
	                if (current.contains(preString)) { 
	                    prev = index; 
	                    preString = current; 
	                } 
	                else { 
	                    return; 
	                } 
	            } 
	        } 
	  	  for(int i = 0; i < maxLen; i++) { 
	            String s = sorts[i]; 
	            for (int j = 0; j < count[i]; j++) { 
	                System.out.println(s); 
	            } 
	        } 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        int maxLen = 14; 
	  
	        String[] arr1 = { "d", "zddsaaz", "ds", "ddsaa", "dds", "dds" }; 
	        subShort(arr1, arr1.length, maxLen); 
	    } 
}
