package com.akash.triNode;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	
	private Map<Character, TrieNode> table;
	private boolean isWord;
	
	public TrieNode() {
		this.table= new HashMap<Character, TrieNode>();
		isWord = false;
	}
	
	public boolean haveRecord(char ch) {
		return this.table.containsKey(ch);
	}
	
	public boolean haveNoRecord() {
		return this.table.isEmpty();
	}
	
	public TrieNode followChar(char ch) {
		return this.table.get(ch);
	}
	
	public void addRecord(char ch, TrieNode t) {
		this.table.put(ch, t);
	}
	
	public void deleteRecord(char ch) {
		this.table.remove(ch);
	}
	
	public boolean isWord() {
		return isWord;
	}
	
	public void setIsWord(boolean isWord) {
		this.isWord = isWord;
	}

}