package com.TaskAssignments;

class Student {

    final int studentId; // final variable
    String studentName;
    double fee;

    static int totalStudents = 0; // static variable

    Student(int studentId, String studentName, double fee) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.fee = fee;
        totalStudents++;
    }

    void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Fee: " + fee);
    }
}

class DayScholar extends Student {

    DayScholar(int studentId, String studentName, double fee) {
        super(studentId, studentName, fee);
    }
}

class Hosteller extends Student {

    Hosteller(int studentId, String studentName, double fee) {
        super(studentId, studentName, fee);
    }
}

public class School_Fee_Management{

    public static void main(String[] args) {

        DayScholar s1 = new DayScholar(101, "Tarun", 25000);
        Hosteller s2 = new Hosteller(102, "Charan", 50000);

        s1.displayDetails();
        System.out.println();

        s2.displayDetails();
        System.out.println();

        System.out.println("Total Students: " + Student.totalStudents);
    }
}