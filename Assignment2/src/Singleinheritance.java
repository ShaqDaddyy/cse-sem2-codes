import java.util.Scanner;
class Person{
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
class Employee extends Person{
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
public class Singleinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    Employee obj = new  Employee();
    obj.getp();
    obj.getE();
    obj.showp();
    obj.showE();
    
    
	}

}
