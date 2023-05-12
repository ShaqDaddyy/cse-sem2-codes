/*Define a class Deposit. The instance variable of the class Deposit are mentioned below.
Instance variable Datatype
Principal Long 
Time Integer
rate Double
Total_amt Double
Initialize the instance variables Principal, Time, rate through constructors. Constructors are 
overloaded with the following prototypes. 
Constructor1: Deposit ( )
Constructor2: Deposit (long, int, double)
Constructor3: Deposit (long, int)
Constructor4: Deposit (long, double)
Apart from constructor, the other instance methods are (i) display ( ): to display the 
value of instance variables, (ii) calc_amt( ) to calculate the total amount. 
Total_amt = Principal + (Principal×rate×Time)/100;*/


import java.util.Scanner;
class Deposit{
	long Principal;
	int Time;
	double Rate;
	double Total_amt;

Deposit(){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value : ");
	Principal = sc.nextLong();
	Time = sc.nextInt();
	Rate = sc.nextDouble();
	
}
Deposit(long P, int T, double R ){
	Principal = P;
	Time = T;
	Rate = R;
}
Deposit(long P, int T){
	Principal = P;
	Time = T;
	Scanner sc = new Scanner(System.in);
	System.out.println();
	Rate = sc.nextDouble();
}
Deposit(long P, double R){
	Principal = P;
	Rate = R;
	Scanner sc = new Scanner(System.in);
	System.out.println();
	Time = sc.nextInt();
}
void calc_amt(){
	Total_amt = Principal + (Principal * Rate * Time)/100;
}
void Display() {
	System.out.println("Total  amount = " + Total_amt );
}
}
public class A2Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("constructot1 call");
		Deposit D = new Deposit();
		D.calc_amt();
		D.Display();
		Scanner sc1 = new Scanner(System.in);
		System.out.println("constructot2 call");
		long P = sc.nextLong();
		int T = sc.nextInt();
		double R = sc.nextDouble();
		Deposit D1 = new Deposit(P,T,R);
		D1.calc_amt();
		D1.Display();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("constructot3 call");
		P = sc.nextLong();
	        T = sc.nextInt();
		Deposit D2 = new Deposit(P, T);
		D2.calc_amt();
		D2.Display();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("constructot1 call");
		P = sc.nextLong();
		R = sc.nextDouble();
		Deposit D3 = new Deposit(P, R);
		
		
		
		
		D3.calc_amt();
		D3.Display();
	}

}
