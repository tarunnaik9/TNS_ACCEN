package com.constructors;

public class Static {
    //instance variable
	//static variable
	static int count;
	
	//static block
	static {
		count = 10;
		System.out.println("Showing the static variable count: "+count);
	}
	
	//static method
	static void display() {
		System.out.println("Displaying the count value: "+count);
	}

	public static void main(String[] args) {
		System.out.println("Displaying the main method");

		display();

	}

}
