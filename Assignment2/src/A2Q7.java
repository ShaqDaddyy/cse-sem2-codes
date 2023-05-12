import java.util.Scanner;
class person{
	String name;
	int age;
	person(int age, String name){
		
		this.name = name;
		this.age = age;
	}
}
class Employee3 extends person{
	
	int Eid;
	double Salary;
	Employee3(String name, int age, int Eid, Double Salary){
		super(age, name);
		this.Eid = Eid;
		this.Salary = Salary;
	}
	void display() {
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Id is " + Eid);
		System.out.println("Salary is " + Salary);
	}
}
public class A2Q7 {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name ");
		String n = sc.nextLine();
		System.out.println("Enter your age");
		int a = sc.nextInt();
		System.out.println("Enter your Id ");
        int i = sc.nextInt();
        System.out.println("Enter your Salary ");
        double s = sc.nextDouble();
        Employee3 E = new Employee3(n, a, i, s);
        E.display();
	}

}
