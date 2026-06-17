package com.superkey;

class Animal{
   String color = "white";
   public void sound()
   {
       System.out.println("Animal makes sound");
   }
   Animal()
   {
       System.out.println("this is animal constructor");
   }
}
class Dog extends Animal{
   String colour = "brown";
   public void sound()
   {
       System.out.println("Dog barks");
       System.out.println("The colour of animal is:"+super.color);
       super.sound();
   }
   Dog()
   {
       System.out.println("this is dog constructor");
   }
}


public class Animals {
  public static void main(String[] args) {

   Dog ob = new Dog();
   System.out.println(ob.color);
   ob.sound();
   
  } 
}
