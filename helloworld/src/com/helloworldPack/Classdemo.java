package com.helloworldPack;

abstract class Class {

    abstract void display();

    void show() {
        System.out.println("This is a normal method");
    }
}

class Demo extends Class {

    void display() {
        System.out.println("Abstract method implemented");
    }
}

public class Classdemo {
    public static void main(String[] args) {

        Demo obj = new Demo();

        obj.display();
        obj.show();
    }
}
