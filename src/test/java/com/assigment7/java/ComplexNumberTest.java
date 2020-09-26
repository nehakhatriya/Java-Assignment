package com.assigment7.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ComplexNumberTest {

		ComplexNumber number=new ComplexNumber(2f,3.5f);
	
	@Test
	void test1() {
		assertEquals(2,number.getReal());
		assertEquals(3.5,number.getImaginary());
	}

	@Test
	void test2() {
		ComplexNumber number2=new ComplexNumber(5f,4.3f);
		ComplexNumber number3=ComplexNumber.sum(number,number2);
		String str=""+number3.getReal()+"+"+number3.getImaginary()+"i";
		assertEquals("7.0+7.8i",str);
		
	}

}
