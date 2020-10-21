package com.akash.latestProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountOccurance {
	
	public static void main(String[] args) {
		String str = "Hello I am Akash Kumar, How are You, I am doing good";
		String word = "am";
		System.out.println(countReference(str, word));
		countOccurenceChar(str, str.length());
		countOccurUsingMap(str, str.length());
		countReference(str, word);
		getOccuranceNum();
		getOccurenceNumUsingCollection();
		getOccuranceNumWithoutCollection();
		getOccuranceUsingForLoop();
	}
	
	private static void getOccuranceUsingForLoop() {
		// TODO 
		int arr [] = {5,9,7,52,4,1,3,4,7,6,9,5,4,52};
		
		int [] freq = new int[arr.length];
		
		int visited = -1;
		
		for(int i = 0; i<arr.length; i++) {
			int count = 1;
			
			for(int j = i+1; j<arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
					freq[j] = visited;
				}
			}
			
			if(freq[i] != visited) {
				freq[i] = count;
			}
		}
		for(int i = 0; i<freq.length; i++) {
			if(freq[i] != visited) {
				System.out.println("Frequency :: "+ arr[i]+ " | "+ freq[i]);
			}
		}
		
	}

	private static void getOccuranceNumWithoutCollection() {
		// TODO 
		System.out.println("****** Occurance Number **** ");
		int[] num = {1,1,2,1,5,6,6,6,6,6,8,5,9,7,1};
		int i,temp = 0; int [] count= new int [50];
		for(i = 0; i < num.length; i++){
            temp = num[i];
            count[temp]++;
        }
       for(i=1; i < count.length; i++){
    	   if(count[i] > 0 && count[i] == 1){
    		   	System.out.printf("%d occurs %d time\n",i, count[i]);
    	   }else if(count[i] >=2){
    		   	System.out.printf("%d occurs %d times\n",i, count[i]);
    	 }
     }
	}

	private static void getOccurenceNumUsingCollection() {
		// TODO Auto-generated method stub
		
		String str = "123456784250125326852006";
		
		String s[] =  str.split("");
		
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i<s.length;i++) {
			if(map.containsKey(s[i])) {
				int count = map.get(s[i]);
				map.put(s[i], count+1);
			}else {
				map.put(s[i], 1);
			}
		}
		System.out.println(map);
		System.out.println(map.size());
		for(Map.Entry<String, Integer> enteryMap : map.entrySet()) {
			System.out.println(enteryMap.getKey() +" MAP "+enteryMap.getValue());
		}
		System.out.println("-----------------------------------------------------");
	}

	private static void countOccurUsingMap(String str, int length) {
		// TODO 
		String arr[] = str.split("");
		Map<String, Integer> map = new HashMap<>();
		for(int i= 0; i<arr.length; i++) {
			if(!"".equalsIgnoreCase(arr[i])) {
				if(map.containsKey(arr[i])) {
					int count = map.get(arr[i]);
					map.put(arr[i], count+1);
				}else {	
					map.put(arr[i], 1);
				}
			}
		}
		for(Map.Entry<String, Integer> mapEntry : map.entrySet()) {
			System.out.println(mapEntry.getKey()+" "+mapEntry.getValue());
		}	
	}

	private static void countOccurenceChar(String str, int length) {
		// TODO 	
		int count;
		for(char c = 'A'; c<='z';c++) {
			count = 0;
			for(int i = 0; i<length; i++) {
				char ch = str.toLowerCase().charAt(i);
				if(c == ch) {
					count++;
				}	
			}
			if(count>0) {
				System.out.println("Occurance : "+ c+ ": count "+ count);
			}
		}
	}

	private static int countReference(String str, String word) {
		// TODO
		String a[] = str.split(" ");
		
		int count = 0;
		for(int i = 0; i<a.length; i++) {	
			if(word.equals(a[i])) {
				count++;
			}
		}
		return count;
	}
	
	private static void getOccuranceNum() {
		// TODO 
		
		/*FOR String data*/
		
		String str [] =  {"asp","as","aps","asp","as","as","aps","as","asp","as","as"};
		
		List<String> list = Arrays.asList(str);
		Set<String> set = new LinkedHashSet<>();
		set.addAll(list);
		for(String get : set) {
			System.out.println(get + " String Number  "+Collections.frequency(list, get));
		}
	
		/*FOR Integer data */
		
		Integer i[] = {1,5,8,6,0,5,8,1,6,7,9,8,6,9,1,3,5,7,9};
		
		List<Integer> list2 = Arrays.asList(i);
		Set<Integer> set2 = new LinkedHashSet<>();
		set2.addAll(list2);
		for(Integer ik : set2) {
			System.out.println(ik + " Number "+ Collections.frequency(list2, ik));
		}
		
		
	}

}