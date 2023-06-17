import java.util.Scanner;
public class A3Q7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Choose any mathematical operation : ");
			System.out.println("0 : Exit");
			System.out.println("1 : Determine  the factoriaL of a number");
			System.out.println("2 : Determine  X^N for two numbers");
			System.out.println("3 : Determine  the GCD of two number");
			System.out.println("4 : Determine the binary equivalent of a decimal number");
			System.out.println("5 : Determine the product of two number");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
			     System.out.println("Enter a number");
			     int f = sc.nextInt();
			     System.out.println("Factorial of "+ f + " is " + calcf(f));
			     break;
			case 2: 
				System.out.println("Enter X and N");
				int x = sc.nextInt();
				int n = sc.nextInt();
				System.out.println(calcpower(x, n));
				break;
			case 3:
				System.out.println("Enter the a and b");
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println(calcgcd(a, b));
				break;
			case 4:
				System.out.println("Ewnter  a decimal number ");
				int d = sc.nextInt();
				String bi = decimaltobinary(d);
				System.out.println(d + " in binary is " + bi);
				break;
			case 5:
				System.out.println("Enter two number" );
				int p = sc.nextInt();
				int q = sc.nextInt();
				System.out.println(p + " * " + q + " = ");
				System.out.println((p < 0 ^ q < 0) ? -1 * calcPro(Math.abs(p),
						Math.abs(q)): calcPro(Math.abs(p), Math.abs(q)));
				break;
				case 0:
					System.out.println("Thank you");
					break;
				default:
					System.out.println("Inavaild choice");
		}
			System.out.println();
		}while(choice != 0);
		}
		public static int calcf(int n) {
			if(n == 0)
				return 1;
			else
				return(n*calcf(n-1));
		}
		public static int calcpower(int x, int n) {
			if(n == 0)
				return 1;
			else
				return (x*calcpower(x, n-1));
		}
		public static int calcgcd(int a, int b) {
			if(b == 0)
				return a;
			else
				return calcgcd(b, a%b);
		}
		public static String decimaltobinary(int n) {
			if(n == 0)
				return "0";
			else if(n == 1)
				return "1";
			else
				return decimaltobinary(n/2) + String.valueOf(n % 2);
		}
        public static int calcPro(int x, int y) {
        	if(y != 0)
        		return (x + calcPro(x, y-1));
        	else
        		return 0;
        }
	
	}


