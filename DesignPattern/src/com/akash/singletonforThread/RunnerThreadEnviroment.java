package com.akash.singletonforThread;

public class RunnerThreadEnviroment {
	
	public static void main(String[] args) {
		// TODO 

		/* Calling the thread singleton  */
		
		SingletonThreadEnviroment singleton = SingletonThreadEnviroment.getInstance();
		
		System.out.println(singleton);
	}

}
