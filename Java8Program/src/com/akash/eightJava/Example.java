package com.akash.eightJava;

public class Example {
	

public interface InterfaceA { 
    default void defaultMethod(){ 
        System.out.println("Interface A default method"); 
    } 
}
public interface InterfaceB {
    default void defaultMethod(){
        System.out.println("Interface B default method");
    }
}

}
