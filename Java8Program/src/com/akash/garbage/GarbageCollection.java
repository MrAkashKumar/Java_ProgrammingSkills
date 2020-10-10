package com.akash.garbage;

public class GarbageCollection {
	
	public GarbageCollection() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		GarbageCollection g = new GarbageCollection();
		GarbageCollection gh = g;
		GarbageCollection ghh = gh;
		GarbageCollection gh1= gh;
		
		System.out.println(gh1);
	}

}
