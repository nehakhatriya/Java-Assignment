package com.assigment7.java;

public class ComplexNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComplexNumber number=new ComplexNumber(2f,3.5f);
		number.display();
		ComplexNumber number2=new ComplexNumber(5f,4.3f);
		number2.display();
		ComplexNumber number3=ComplexNumber.sum(number,number2);
		number3.display();
		
	}

}
