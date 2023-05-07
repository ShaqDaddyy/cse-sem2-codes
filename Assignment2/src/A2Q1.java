import java.util.Scanner;
public class A2Q1 {
    int areacode, exchange, number;
    void input() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the information : ");
    	areacode = sc.nextInt();
    	exchange = sc.nextInt();
    	number = sc.nextInt();
    	
    }
    void display() {
    	System.out.println( " ("+areacode+")" + " " +  exchange + " - " + number );
    }
    public static void main(String[] args) {
		A2Q1 phone1 = new A2Q1();
		A2Q1 phone2 = new A2Q1();
		phone1.areacode = 212;
		phone1.exchange = 767;
		phone1.number = 8900;
		phone2.input();
		System.out.print("My number is : ");
		phone1.display();
		System.out.print("Your number is : ");
		phone2.display();
}	
}