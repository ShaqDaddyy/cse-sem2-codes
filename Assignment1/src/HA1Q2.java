import java.util.Scanner;
public class HA1Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number of lies for input : ");
    	int a = sc.nextInt();
    	sc.nextLine();
    	String[] s = new String[a];
    	System.out.println("Enter the lines : ");
    	for (int i = 0; i < a; i++) {
    		s[i] = sc.nextLine();
    	}
    	System.out.println("Lines in reverse ordered are : ");
    	for(int j = a-1; j >= 0; j--) {
    		System.out.println(s[j]);
    	}

	}

}
