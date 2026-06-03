package com.inheritance.types.java;

  class Courses {
	//single level inheritance
	  //parent class
		String coursename="Java Programming";
		
		void showCourse()
		{
			System.out.println("Course : "+coursename);
		}
	}
	class Student extends Courses   //child class
	{
		String studentName="Amit";
		
		void showStudent()
		{
			System.out.println("Student :"+studentName);
		}
	}
	public class Course { //SingleLevelInheritanceDemo 

		public static void main(String[] args) {
			Student student=new Student();
			student.showCourse();
			student.showStudent();
			
		}

	}