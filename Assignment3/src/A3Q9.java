import java.util.Scanner;
public class A3Q9 {
    
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number : ");
	int n = sc.nextInt();
	System.out.println("Fibonacci number at position " + n + " is " + fibonacci(n));
	}
    public static int fibonacci(int n) {
    	if(n <= 1)
    		return n;
    	else
    		return (fibonacci(n-1) + fibonacci(n-2));
	
	}

}
