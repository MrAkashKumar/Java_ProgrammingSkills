package com.akash.instanceInitail;

public class ConstructorInitial {

	//Every call object then call instance block
	// but static block call only once when call every time object
	// initial block start....
	 		static{
	 			int i=0;
				System.out.println("Static block"+i);
			}
	 		
			{
				System.out.println("initial instance block....");
			}
			
			public ConstructorInitial(int j) {
				System.out.println("hey i am int parameterized constructor"+ j);
			}
			public ConstructorInitial(){
				System.out.println("default constructor");
			}
			public ConstructorInitial(String name){
				System.out.println("parametrized constructor " + name);
			}
	  public static void main(String[] args) {
		// TODO 
		
		ConstructorInitial constructorInitial = new ConstructorInitial();
		System.out.println(constructorInitial);
		ConstructorInitial constructorInitial2 = new ConstructorInitial(156);
		System.out.println(constructorInitial2);
		ConstructorInitial constructorInitial3 = new ConstructorInitial("String");
		System.out.println(constructorInitial3);
		
	}

}
