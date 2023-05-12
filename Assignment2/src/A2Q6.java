/*Create an abstract class Shape and the derived classes Square, Triangle and Circle. Write a
java program to display area of different shapes.*/

import java.util.Scanner;
abstract class Shape{
	public abstract double area();
}
class Square extends Shape{
	public double area() {
		
	
	Scanner sc = new Scanner(System.in);
	 System.out.print("Enter the side value : ");
	 int s = sc.nextInt();
	 return(double)s*s;
	} 
}

class Circle extends Shape{
	public double area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the readius : ");
		int r = sc.nextInt();
		return(Math.PI * r * r);
	}
}
class Triangle extends Shape{
	public double area() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height : ");
		int h =  sc.nextInt();
		System.out.println("Enter the breadth : ");
		int b = sc.nextInt();
		return((h*b)/2);
	}
}
public class A2Q6 {

	public static void main(String[] args) {
		
    Shape obj = new Square();
    System.out.println("Area of the square is " + obj.area());
    obj = new Circle();
    System.out.println("Area of circle is " + obj.area());
    obj  = new Triangle();
    System.out.println("Area of triangle  is " + obj.area());
	}

}
