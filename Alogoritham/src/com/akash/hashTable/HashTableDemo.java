package com.akash.hashTable;

import java.util.LinkedList;

public class HashTableDemo {
	
	private LinkedList[] data;
	
	public HashTableDemo(int size) {
		// TODO 
		this.data =  new LinkedList[size];
		for(int i = 0; i<size; i++) {
			this.data[i] = new LinkedList<>();
		}
	}
	
	/*public void insert(String value) {
		int index = Math.abs(hashFunction(value)) % data.length;
		this.data[index].insert(value);
	}
	
	public boolean delete(String value) {
		int index = Math.abs(hashFunction(value)) % data.length;
		return data[index].delete(value);
	}
	
	public boolean search(String value) {
		int index = Math.abs(hashFunction(value)) % data.length;
		return data[index].search(value);
	}
*/
	private int hashFunction(String value) {
		// TODO 
		int hash = 7;
		for(char c : value.toCharArray()) {
			hash = hash*31+c;
		}
		return hash;
	}
	
	
	

}
