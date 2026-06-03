package com.constructors;

public class Parameterizedconstuctor {
	int age ;
	String name ;
	// ParameterizedConstructor
	Parameterizedconstuctor(int age, String name){  
		this.name = name;
		this.age = age;	
	}
	
	//method
	void display() {
		System.out.println(name);
		System.out.println(age);
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterizedconstuctor obj = new Parameterizedconstuctor(23, "Tarun");   // passing the values
		obj.display();
	}

}
