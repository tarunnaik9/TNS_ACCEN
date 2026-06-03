package com.NonAccessModifier;

final class demo {
	
	public void add() {
		int a =10, b = 20;
//		System.out.println(" Sum of a,b :"+(a+b));
	}
}

final class demo1{
	
	public void add1() {
		int a =10, b = 20;
		System.out.println(" Sum of a,b :" +(a+b));
	}
	
	
}
public class FinalClass {


	public static void main(String arge[]) {
		demo1 obj = new demo1();
		obj.add1();
	}
}
