package com.akash.programming;

public class RemoveWhiteSpace {
	
	public static void main(String[] args) {
		String str = "A human is powerful in the world";
		char ch[] = str.toCharArray();
		
		int length = ch.length;
		
		StringBuffer stringBuffer = new StringBuffer();
		
		for(int i =0; i<length; i++) {
			if((ch[i]!=' ') && (ch[i]!= '\t')) {
				stringBuffer.append(ch[i]);
				/*System.out.println("Rever String : "+ stringBuffer.reverse());*/
			}
		}
		System.out.println(stringBuffer);
	}

}
