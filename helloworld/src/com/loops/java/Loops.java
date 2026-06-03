package com.loops.java;

public class Loops {
	public static void main(String[] args) {
	         //for loop
			for(int i=1; i<=10; i++) {
				System.out.print(i);
			}
			
			System.out.println("\n");

	System.out.println("While loop : \n");

	        //while loop
			int num = 10;
			int n = 1;
			while(n<=num) {
				System.out.print(n);
				n++;
			}

	System.out.println(" ");

	        //do while loop
			int j=1;
			do {
				System.out.print(j);
				j++;
			}
			while(j<=10);
}
}