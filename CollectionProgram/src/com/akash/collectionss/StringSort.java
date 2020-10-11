package com.akash.collectionss;

import java.util.Comparator;

public class StringSort implements Comparator<String> {


	@Override
	public int compare(String arg1, String arg2) {

		return arg1.charAt(1)-arg2.charAt(1);
	}

}
