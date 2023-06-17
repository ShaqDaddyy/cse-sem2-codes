import java.util.Scanner;
public class A3Q8 {
    static int a = 0;
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		System.out.println("Reverse number is : ");
		reverse_number(n);
	}
    public static void reverse_number(int n) {
    	if(n < 10) {
    		System.out.println(n);
    		return;	
    	}
    	else
    		System.out.print(n % 10);
    	reverse_number(n / 10);
    }
}
