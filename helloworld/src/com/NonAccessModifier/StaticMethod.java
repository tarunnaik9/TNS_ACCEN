package com.NonAccessModifier;

public class StaticMethod {
	static void add() {
		System.out.println(5 + 5);
	}
	public static void main(String[] args) {

		StaticMethod.add();
	}

}
