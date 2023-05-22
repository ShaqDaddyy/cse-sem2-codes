/*
Write a Java program to declare a Class named as Student which contains roll number,
name and course as instance variables and input_Student () and display_Student () as
instance methods. A derived class Exam is created from the class Student. The derived
class contains mark1, mark2, mark3 as instance variables representing the marks of three
subjects and input_Marks () and display_Result () as instance methods. Create an array of
objects of the Exam class and display the result of 5 students.
 */

import java.util.Scanner;
    class student {
    int roll;
    String name;
    String Course;
    void input_student() {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter Your Roll : ");
    	roll = sc.nextInt();
    	sc.nextLine();
    	System.out.print("Enter Your Name : ");
    	name = sc.nextLine();
    	System.out.print("Enter Yout Course :");
    	Course = sc.nextLine();
    	System.out.println();
    	System.out.println("Thank you for giving your information. ");
    }
    void display_student() {
    	System.out.println("Your Name : " + name);
    	System.out.println("Your Roll : " + roll);
    	System.out.println("Your Course : " + Course);  	
    }
    } 
        class Exam extends student{
    	int mark1;
    	int mark2;
    	int mark3;
    	void input_Marks () {
    		super.input_student();
    		Scanner sc = new Scanner(System.in);
        	System.out.print("Enter your marks of Subject1 : ");
        	mark1 = sc.nextInt();
        	System.out.print("Enter your marks of Subject2 : ");
        	mark2 = sc.nextInt();
        	System.out.print("Enter your marks of Subject3 :");
        	mark2 = sc.nextInt();
        	System.out.println();
        	System.out.println("Thank you for giving your information. ");
    	}
    	void display_Marks() {
    		super.display_student();
    		System.out.println("Your marks in subject1 : " + name);
        	System.out.println("Your marks in subject2 : " + roll);
        	System.out.println("Your marks in subject3 : " + Course);
    	}
        
	public static void main(String[] args) {
		Exam[] e = new Exam[5];
        for(int i = 0; i < 5; i++) {
        	System.out.println("Enter details for Student : " + (i + 1) + ":");
        	e[i] = new Exam();
        	e[i].input_student();
        	e[i].input_Marks();
        }
        for(int i = 0; i < 5; i++) {
        	System.out.println("Results of student : " + (i + 1) + ":");
        	e[i].display_student();
            e[i].display_Marks();
	}
  }
}
    

