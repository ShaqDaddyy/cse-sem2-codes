/*Write a Java program that takes as input three integers, a, b, and c, from the Java console
and determines if they can be used in a correct arithmetic formula (in the given order), like
“a + b = c,” “a = b − c,” or “a * b = c.”*/
import java.util.Scanner;
public class HA1Q1 {
    public static void main(String[]args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter 1st integer : ");
    	int a = sc.nextInt();
    	System.out.println("Enter 2nd integer : ");
    	int b = sc.nextInt();
    	System.out.println("Enter 3rd integer : ");
    	int c = sc.nextInt();
    	if(a+b == c && b-c == a && a*b == c) {
    		System.out.println("the no.s can be used in a correct arithmetic formula");
    	}
    	else
    		System.out.println("the no.s cannot be used in a correct arithmetic formula");
    	
    }
}
