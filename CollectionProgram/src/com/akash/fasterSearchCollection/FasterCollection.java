package com.akash.fasterSearchCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class FasterCollection {
	
	public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        List<String> base = new ArrayList<>();

        for(int i = 0; i<5000000; i++){
            if(i%100000==0) System.out.print(".");
            base.add(UUID.randomUUID().toString());
        }

        System.out.println("\nBase size : " + base.size());
        String item = base.get(25000);
        System.out.println("SEARCHED ITEM : " + item);

        hashSet.addAll(base);
        treeSet.addAll(base);
        arrayList.addAll(base);
        linkedList.addAll(base);

        long ms = System.currentTimeMillis();
        System.out.println("hashSet.contains(item) ? " + (hashSet.contains(item)? "TRUE " : "FALSE") + (System.currentTimeMillis()-ms) + " ms");
        System.out.println("treeSet.contains(item) ? " + (treeSet.contains(item)? "TRUE " : "FALSE") + (System.currentTimeMillis()-ms) + " ms");
        System.out.println("arrayList.contains(item) ? " + (arrayList.contains(item)? "TRUE " : "FALSE") + (System.currentTimeMillis()-ms) + " ms");
        System.out.println("linkedList.contains(item) ? " + (linkedList.contains(item)? "TRUE " : "FALSE") + (System.currentTimeMillis()-ms) + " ms");
    }

}
