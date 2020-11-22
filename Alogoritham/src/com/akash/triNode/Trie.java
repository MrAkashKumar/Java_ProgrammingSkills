package com.akash.triNode;

public class Trie {
	
	TrieNode root;
	
	Trie(){
		this.root = new TrieNode();
	}
	
	public void insert(String value) {
		char[] input = value.toCharArray();
		TrieNode trieNode = root;
		
		for(char c : input) {	
			if(!trieNode.haveRecord(c)) {
				trieNode.addRecord(c, new TrieNode());
			}
			trieNode = trieNode.followChar(c);
		}
		trieNode.setIsWord(true);
	}
	
	public boolean search(String value) {
		char[] input = value.toCharArray();
		TrieNode n = root;
		
		for(int i = 0; i<input.length; i++) {
			if(!n.haveRecord(input[i])) {
				return false;
			}
			n = n.followChar(input[i]);
		}
		return n.isWord();
	}
	
	public boolean delete(String value) {
		
		char [] ch = value.toCharArray();
		TrieNode n = root;
		TrieNode[] path = new TrieNode[ch.length];
		int pathLength = 0;
		for(int i= 0; i<ch.length; i++) {
			if(!n.haveRecord(ch[i])) {
				return false;
			}
			n = n.followChar(ch[i]);
			path[pathLength] = n;
			pathLength++;
		}
		n.setIsWord(false);
		
		int inputIndex = ch.length-1;
		for(int i = pathLength-2; i>=0; i++) {
			if(n.haveNoRecord() && (!n.isWord())) {
				n = path[i];
				n.deleteRecord(ch[inputIndex]);
				inputIndex--;
			}else {
				break;
			}
		}	
		return true;
	}
}