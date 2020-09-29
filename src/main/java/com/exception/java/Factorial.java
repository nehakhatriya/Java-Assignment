package com.exception.java;

class FactorialException extends Exception{
	public FactorialException(String s) {
		System.out.println(s);
	}
}

class InvalidInputException extends Exception{
	public InvalidInputException(String s) {
		System.out.println(s);
	}
}
public class Factorial {

	public static int factorial(int n) throws InvalidInputException,FactorialException{
		int fact=1;
		if(n<=1) {
			throw new InvalidInputException("Number should be greater than or equal to 2");
		}
		for(int i=n;i>0;i--) {
			if(fact<0) {				
				throw new FactorialException("factorial is out of int range");
			}
			fact=fact*i;
		}
		return fact;
	}
}
