package com.akash.copyonWriteArrayList;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayThreadDemo {
	
	public static void main(String[] args) {
		CopyOnWriteArrayList<String> arrayList = new CopyOnWriteArrayList<>();
		arrayList.add("Akash");
		arrayList.add("Abhinav");
		arrayList.add("Akki");
		arrayList.add("Priya");
		arrayList.add("sonam");
		
		new Thread() {
			public void run() {
				Iterator<String> iterator = arrayList.iterator();
				while(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
			}
		}.start();
		new Thread() {
			public void run() {
				
				System.out.println("adding don't to the middle of the list");
				arrayList.add(1, "Don");
			}
		}.start();
	}
}