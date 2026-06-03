package com.constructors;

public class Defaultconstructor {
	//Instance variables
		String name ;
		int age;
		
		public static void main(String[] args) {
			
			//object creation
			
			Defaultconstructor obj = new Defaultconstructor();
			System.out.println(obj.name);
			System.out.println(obj.age);
			
			
			Defaultconstructor obj1 = new Defaultconstructor();
			System.out.println(obj1.name);
			System.out.println(obj1.age);

		}

}
