import java.util.Scanner;
class Person1{
    String name;
    int age;
    void getp(){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your age : ");
    	age = sc.nextInt();
    	sc.nextLine();
    	System.out.println("Enter your name : ");
    	name = sc.nextLine();
    }
    void showp() {
    	System.out.print("Name od the person : " + name+ ", Age of the person : "+ age);
    }
}
class Employee1 extends Person1{
	double salary;
	void getE() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary  : ");
		salary = sc.nextDouble();
		
	}
	void showE() {
		System.out.println(", Salary : " + salary);
	}
}
class Student1 extends Person1{
	double marks;
	void getS() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks  : ");
		marks = sc.nextDouble();
	}
	void showS() {
		System.out.println(", marks : " + marks);
	}
}

public class Hierarchicalinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 obj = new  Employee1();
	    obj.getp();
	    obj.getE();
	    obj.showp();
	    obj.showE();
	    Student1 obj1 = new Student1();
	    obj1.getp();
	    obj1.getS();
	    obj1.showp();
	    obj1.showS();
	}

}
