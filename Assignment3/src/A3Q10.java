import java.util.Scanner;
public class A3Q10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the character : ");
		String s = sc.nextLine();
		String reversed = reverse(s);
		System.out.println("Reversed character : " + reversed);

	}
	public static String reverse(String s) {
		if(s.isEmpty()) {
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}

}
