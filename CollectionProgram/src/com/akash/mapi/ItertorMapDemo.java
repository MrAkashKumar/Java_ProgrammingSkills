package com.akash.mapi;

import java.util.HashMap;
import java.util.Map;

public class ItertorMapDemo {

	public static void main(String[] args) {
		// TODO 
		Map<String, String> map = new HashMap<String, String>();
		map.put("Akki", "Hello akki");
		map.put("Priya", "Hello Priya");
		map.put("Jyoti", "Hello Jyoti");
		map.put("Niharika", "Hello Niharika");
		map.put("Riya", "Hello Riya");
		
		for(Map.Entry<String, String> entry : map.entrySet())
			System.out.println("key : = "+entry.getKey()+ " , Value = "+ entry.getValue());
		}
}