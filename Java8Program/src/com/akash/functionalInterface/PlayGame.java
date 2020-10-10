package com.akash.functionalInterface;

public class PlayGame {
	
	public static void main(String[] args) {
		FunctionalDemo functional = ()-> {
			System.out.println("playing game");
		};
		functional.play();
	}

}
