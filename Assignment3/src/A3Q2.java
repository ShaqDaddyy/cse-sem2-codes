/*Assign your favourite colours in an array. Identify 2 exceptions that may be generated & write
exceptional handler in Java. Also, display the four colours after handling any 2 exceptions.*/
import java.util.Scanner;
public class A3Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] c = new String[4];
		System.out.println("Enter four Colours");
        for(int i = 0; i < c.length; i++) {
        	c[i] =sc.nextLine();
        }
        try {
        	Integer.parseInt(c[0]);
        }
        catch(NumberFormatException e){
        	System.out.println(e);
        }
        try {
        	System.out.println("Enter one more colour : ");
        	c[5] = sc.nextLine();
        }
        catch(ArrayIndexOutOfBoundsException f) {
        	System.out.println(f);
        }
        System.out.println("The Colours eneterd are ");
        for(int i = 0; i < c.length; i++) {
        	System.out.println(c[i]);
        }
        sc.close();
	}

}
