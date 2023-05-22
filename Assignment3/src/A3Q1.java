/*Write a Java program to read your lucky number from keyboard. Treat –ve no. as
NumberFormatException. Write appropriate Exceptional handler.*/
import java.util.Scanner;
public class A3Q1 {
     public static void main(String []args) {
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("Enter Your Lucky Number : ");
    	 int luckyno = sc.nextInt();
    	 try {
    		 if(luckyno < 0) {
    			 throw new NumberFormatException("Negative Number");
    		 }
    		 System.out.println("Lucky Number is : " + luckyno);
    	 }
    	 catch(NumberFormatException n ) {
    		 System.out.println(n);
    	 }
    	 sc.close();
     }
}
