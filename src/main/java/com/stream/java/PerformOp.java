package com.stream.java;

import java.util.function.Predicate;

public class PerformOp {

	public boolean operation(int num,PerformOperation op) {
		return op.perform(num);
	}
	public static void main(String[] args) {
		PerformOp oper=new PerformOp();
		System.out.println(oper.operation(2, num->num%2==0)?"Even":"Odd");
		System.out.println(oper.operation(7, num->{
			for(int i=2;i<num/2;i++) {
				if(num%i==0)  return false;
			}
			return true;
		})?"Prime":"Not Prime");
		System.out.println(oper.operation(121,num->{
			int n=num,r=0,rN=0;
			 while (n != 0) {
			        r = n % 10;
			        rN = rN * 10 + r;
			        n /= 10;
			    }
			 if(rN==num) return true;
			 else return false;
		})?"Pallindrome":"Not Palindorme");
		
	}
	
interface PerformOperation{
	boolean perform(int num);
}
}
