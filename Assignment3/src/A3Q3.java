/*Create a class Student having two instance variable name and mark. Enter mark, name of the 
student. If mark is more than 100, create exception MarksOutOfBoundException & throw it 
using Java. Display the customised message Mark can’t be greater than 100 for the exception.*/
import java.util.Scanner;
class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String message) {
        super(message);
    }
}
public class A3Q3 {
    String name;
    int mark;
    
    void display() {
    	System.out.println("Name " + name);
    	System.out.println("Mark " + mark);
    }
	public static void main(String[] args) {
		A3Q3 obj = new A3Q3();
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your name : ");
    	String name = sc.nextLine();
			try {
				System.out.println("Enter your marks : ");
		    	int mark = sc.nextInt();
				if(mark > 100) {
				throw new MarksOutOfBoundException("Mark cant be greater than 100");
				
				
				}
				System.out.println(name + " has got " + mark);
		}
		catch(MarksOutOfBoundException e) {
			System.out.println(e);
		}

	}

}
