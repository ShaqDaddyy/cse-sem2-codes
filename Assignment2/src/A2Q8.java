/*Define an interface DetailInfo to declare methods display ( ) & count ( ). Another class Person
contains a static data member maxcount, instance member name & method display ( ) to display 
name of a person, count the no. of characters present in the name of the person.*/


import java.util.Scanner;
interface DetailInfo{
	void display();
	void  count();
	
}
class Person3 implements DetailInfo{
	static int maxcount = 0;
	String name;
	public void display() {
		System.out.println("Name = " + name);
		count();
	}
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name  ");
		name = sc.nextLine();
	}
	public void count() {
		char []n = name.toCharArray();
		for(int i = 0; i < n.length; i++) {
			if(n[i] != ' ')
				maxcount++;
		}
		System.out.println("Number of characters " + maxcount);
	}
}
public class A2Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Person3 obj = new Person3();
    obj.input();
    obj.display();
	}

}
