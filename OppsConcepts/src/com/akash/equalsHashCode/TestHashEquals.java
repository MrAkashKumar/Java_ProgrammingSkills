package com.akash.equalsHashCode;

public class TestHashEquals {

	public static void main(String[] args) {
		String s =  "Akash";
		String s1 = new String("Akash");
		String s2 = new String("Hello");

		System.out.println("hashCode S :: "+ s.hashCode());
		System.out.println("hashCode S1 : "+s1.hashCode());
		System.out.println("hashCode S2 :  "+s2.hashCode());
		
		System.out.println("Equals Example S1 and S2 : "+ s1.equals(s2));
		System.out.println("Equals Example S and S2 : "+ s.equals(s2));
		
		System.out.println("Equals S AND S1 : "+ s.equals(s1));
		
		System.out.println("Are Equals  s == S1: "+ s == s1);
		
		System.out.println("Are Equals S1==S2 : "+ s1==s2);
		System.out.println("Are Equals S2==s1 :"+ s2==s1);
		
	}

}
