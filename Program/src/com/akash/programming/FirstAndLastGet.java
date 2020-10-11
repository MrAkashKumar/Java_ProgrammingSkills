package com.akash.programming;

public class FirstAndLastGet {
	
	private String message;
	
	FirstAndLastGet(String message){
		this.message = message;
	}
	
	public char getFirst() {
		return message.charAt(0);
	}
	
	public char getLast() {
		return message.charAt(message.length()-1);
	}
	

	public static void main(String[] args) {
		
		FirstAndLastGet first = new FirstAndLastGet("Hey How are You");
		
		System.out.println("First Char value : "+ first.getFirst());
		System.out.println("Last Char value : "+ first.getLast());

	}

}
