package com.javaoperators;

public class JavaOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
        int b = 10;
                  /* ArithmeticOperator */
        System.out.println("Arithmetic Operator : \n");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b)); 
        
        System.out.println("\n");
        
                /* Relational Operator */
        System.out.println("Relational Operator : \n");
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        
        System.out.println("\n"); 
         
              /* Logical Operator */ 
        System.out.println("Logical Operator : \n");
        System.out.println(a > 18 && a < 30);
        System.out.println(a > 18 || a > 40);
        System.out.println(!(a > 18));
        
        System.out.println("\n");
        
                 /* Assignment Operator */
        System.out.println("Assignment Operator: \n");
        
        a += 5;
        System.out.println(a);

        a -= 3;
        System.out.println(a);

        a *= 2;
        System.out.println(a);

        a /= 4;
        System.out.println(a);
        
        System.out.println("\n");
        
                /* Increment Operator */
        System.out.println("Increment Operator  : \n");
        
        System.out.println(++a); // Pre Increment
        System.out.println(a++); // Post Increment
        System.out.println(a);

        System.out.println(--a); // Pre Decrement
        System.out.println(a--); // Post Decrement
        System.out.println(a);
        
        System.out.println("\n");
        
                  /* Conditional Operator */
        System.out.println("Conditional Operator  : \n");
        
        int max = (a > b) ? a : b;

        System.out.println("Maximum Number is: " + max);
	}

}
