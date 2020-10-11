package com.akash.concurrencyhashMap;

import java.util.HashMap;
import java.util.Map;

public class OccureneceNumber {

	public static void main(String[] args) {

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
	}
}