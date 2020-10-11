package com.akash.exceptionLogic;

public class ExceptionIncrement {

	public static void main(String[] args) {
		// TODO 
		try {
			int i=1; int j= 1;
			i++;
			j--;
			if(i==j) {
				System.out.println("Hello");
			}
		} catch (ArithmeticException e) {
			// TODO:
			System.out.println("ArithmaticException : "+ e);
		}catch(ArrayIndexOutOfBoundsException ea) {
			System.out.println("ArrayIndexBoundException : "+ ea);
		}catch(Exception ex) {
			System.out.println("Exception : "+ ex);
		}finally {
			System.out.println("Finally block");
		}
	}
}