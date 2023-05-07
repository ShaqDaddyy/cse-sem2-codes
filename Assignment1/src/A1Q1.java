
public class A1Q1 {

	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		System.out.println(" the positive number greater than is " + a);
		int n = 0;
		while(a > 2) {
			a = a/2;
			n++;
		}
    System.out.println("the number of the times one must repeatedly divide by number 2 before getting a value less than 2 is " + n);
	}

}
