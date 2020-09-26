package com.assigment7.java;

public class ComplexNumber {

	private float real;
	private float imaginary;
	
	public ComplexNumber(float real,float imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}

	void set(float real,float img) {
		this.real=real;
		imaginary=img;
	}
	public float getReal() {
		return real;
	}

	public static ComplexNumber sum(ComplexNumber c1,ComplexNumber c2) {
		ComplexNumber c3 = new ComplexNumber(0,0);
		c3.real = c1.real+c2.real;
		c3.imaginary= c1.imaginary+c2.imaginary;
		return c3;
	}
	public void display() {
		System.out.println(this.real+"+"+this.imaginary+"i");
	}
	public float getImaginary() {
		return imaginary;
	}

}
