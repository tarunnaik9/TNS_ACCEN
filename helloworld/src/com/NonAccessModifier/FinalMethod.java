package com.NonAccessModifier;

class Demo {
	
	 public void add() {
		int a =10, b = 20;
		System.out.println("Sum of a,b :" +(a+b));
	}
}


    class Demo1 extends Demo{
	
	 public void add() {
		int a =10, b = 20;
		System.out.println(" Sum of a,b :" +(a+b));
	}
	
}
    public class FinalMethod {

	public static void main(String[] args) {
		
		Demo1 obj = new Demo1();
		obj.add();                        


	}

}
