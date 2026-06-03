package com.NonAccessModifier;

public class FinalVariable {

	public static void main(String[] args) {

		int a = 20;     //local variable 
		a = 100;
		System.out.println(a);
		
		
		final int b = 1234;   // can't change value because we already declared final modifier
		//b = 200;                             
		System.out.println(b);
}
}