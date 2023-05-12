/*A phone number can be thought of as having three parts: the area code, the exchange code and 
the number
Example A phone number, such as (212) 767-8900, can be thought of as having three parts: 
the area code (212), the exchange (767) and the number (8900).
Define a class Phone to store these three parts of a phone number separately as instance 
variable (area_code, exchange, number). The class consists of two member methods: input ( )
and display ( ). Create two class objects of type phone. Initialize one directly (by using dot (.) 
operator and instance variable with value area_code: 212, exchange: 767, 
number: 8900), and initialize other from the user through member method input ( ). Display 
both the numbers.
Sample Run:
My number is (212) 767-8900
Your number is (415) 555-1212*/




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
