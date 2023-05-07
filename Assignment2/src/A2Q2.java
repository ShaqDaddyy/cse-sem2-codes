import java.util.Scanner;
public class A2Q2 {
   int real;
   int img;
   void input() {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the value : ");
	   real = sc.nextInt();
	   img = sc.nextInt();
	   
   }
   void display() {
	   System.out.println(" real = " + real);
	   System.out.println(" img = " + img);
   }
   
   

public  A2Q2 add(A2Q2 c1,A2Q2 c2) {
	A2Q2 c3 = new A2Q2();
	c3.real = c1.real + c2.real;
	c3.img = c1.real + c2.img;
	return c3;
}
public static void main(String []args) {
	A2Q2 c1 = new A2Q2();
	A2Q2 c2 = new A2Q2();
	A2Q2 c3 = new A2Q2();
    c1.input();
    c2.input();
    c1.display();
    c2.display();
    c3 = c3.add(c1, c2);
    System.out.println("Sum of two complex number : ");
    c3.display();
    
}
}