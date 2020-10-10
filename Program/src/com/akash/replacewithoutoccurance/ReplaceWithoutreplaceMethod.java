package com.akash.replacewithoutoccurance;

public class ReplaceWithoutreplaceMethod {
	
	public static void replaceChar(char str[]){
		for(int i = 1; i<str.length; i++){
			if(str[i-1] == 'A'  && str[i] == 'B'){
				str[i-1] = 'C';
				int j;
				for( j = i;j<str.length-1; j++)
					str[j] = str[j+1];
					str[j] = ' ';
			}
	}
		return;	
	}
	public static void main(String [] args){
	String ab = "HelloABWorld";
	char str[] = ab.toCharArray();
	replaceChar(str);
	System.out.println(" This is modified string :....");
	System.out.println(str);
	}
	// Output : HelloCWorld
}