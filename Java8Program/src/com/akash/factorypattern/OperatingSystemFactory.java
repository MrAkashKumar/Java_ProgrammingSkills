package com.akash.factorypattern;

public class OperatingSystemFactory {
	
	public OS getInstance(String system) {
		
		if(system.equals("Android")) 
			return new Android();
		else if(system.equals("window")) 
			return new Window();
		else 
			return new IOS();
	}

}
