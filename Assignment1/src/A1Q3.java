/*Write a java program to check whether a number is a spy number or not.*/
import java.util.Scanner;

public class A1Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        int n = sc.nextInt();
        int a = 0, b = 1, c;
        while(n != 0) {
        c = n % 10;
        a = a + c;
        b = b * c;
        n = n /10;
      
	}
	if(a == b) {
		System.out.println(" the number is spy");
	}
	else {
		System.out.println(" the number is not spy");
	}

		}

}
