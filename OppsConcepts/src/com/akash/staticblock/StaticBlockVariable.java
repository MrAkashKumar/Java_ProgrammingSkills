package com.akash.staticblock;

public class StaticBlockVariable {
	
	static int var1= 54;
	String var2;

	public static void main(String[] args) {
		// TODO 
		StaticBlockVariable staticBlockVariable = new StaticBlockVariable();
		StaticBlockVariable staticBlockVariable2 = new StaticBlockVariable();
		
		staticBlockVariable.var1=10; // 20
		staticBlockVariable.var2="Hello 1st"; // same
		
		
		staticBlockVariable2.var1= 30; // 20
		staticBlockVariable2.var2="Hello 2nd"; // same
		
		var1=62;
		
		/*This will overwrite the value of var1 because var1 has a single 
		 * copy shared among both  the objects */
		
		System.out.println("obj 1 int : "+ staticBlockVariable.var1);
		System.out.println("obj 1 string : "+ staticBlockVariable.var2);
		System.out.println("obj 2 int : "+ staticBlockVariable2.var1);
		System.out.println("obj 2 String : "+ staticBlockVariable2.var2);
		System.out.println("obj 2 Intance : "+ var1);
		
	}

}