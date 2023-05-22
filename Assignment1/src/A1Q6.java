/*Write a Java method, isOdd( ), that takes an int i and returns true if and only if i is odd. Your
method can't use the multiplication, modulus, or division operators, The method signature is 
as follows.*/
import java.util.Scanner;

public class A1Q6 {
    public static boolean isOdd(int n) {
    	int r = n & 1;
    	if(r == 1)
    		return true;
    	else
    		return false;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no   :");
        int n = sc.nextInt();
        boolean r = isOdd(n);
        System.out.println(n + " is odd " + r);

	}

}
