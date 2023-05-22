/*Write a Java program that outputs all possible strings formed by using the characters 'c', 'a', 'r', 
'b', 'o', and 'n' exactly once.*/
import java.util.Scanner;
public class A1Q5 {
    public static int sum_of_Digits(int n) {
    	int sum = 0;
    	while(n > 0) {
    		int r = n % 10;
    		sum += r;
    		n /= 10;
    	}
    	if(sum >= 10) {
    		return sum_of_Digits(sum);
    	}
    	else
    		return sum;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int x = sc.nextInt();
		System.out.println("Sum of digits of " + x + " until the number is a " + "single digit is " + sum_of_Digits(x));
		sc.close();

	}

}
