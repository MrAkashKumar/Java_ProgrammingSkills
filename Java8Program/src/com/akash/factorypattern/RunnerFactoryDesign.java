package com.akash.factorypattern;

public class RunnerFactoryDesign {
	
	public static void main(String[] args) {
		/*OS os = new Window();
		os.specification();*/
		
		OperatingSystemFactory systemFactory = new OperatingSystemFactory();
		OS os = systemFactory.getInstance("Android");
		os.specification();
	}

}
