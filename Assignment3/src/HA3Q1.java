/*Create a class Bank with instance variables account_no, name, and balance of the customer.
If the input balance is less than or equal to zero then create an Exception called “Invalid
BalanceException” and throw it using Java. Display the custom message “Balance cannot be 
less than 0”*/
import java.util.Scanner;
class InvalidBalanceException extends Exception{
	InvalidBalanceException(String message){
		super(message);
	}
}
class Bank{
	long account_no;
	String name;
	double balance;
	public Bank(int account_no, String name, double balance) throws InvalidBalanceException{
		if(balance < 0) {
			throw new InvalidBalanceException("Balance cannot be less than 0");
		}
		this.account_no = account_no;
		this.name = name;
		this.balance = balance;
	}
	public void withdraw(double amount) throws InvalidBalanceException{
		if(amount > balance) {
			throw new InvalidBalanceException("Sorry, Your Balance is low ! ");
		}
		balance -= amount;
	}
	public long getAccountNo() {
		return account_no;
	}
	public String getName() {
		return name;
	}
	public double getBalance() {
		return balance;
	}
}
public class HA3Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name : ");
		String name = sc.nextLine();
		System.out.println("Enter account number : ");
		int account_no = sc.nextInt();
		System.out.println("Enter balance : ");
		double balance = sc.nextDouble();
		try {
			Bank bank = new Bank(account_no, name, balance);
			System.out.println("Details of the account holder : ");
			System.out.println("Name : " + bank.getName());
			System.out.println("Account Number : " + bank.getAccountNo());
			System.out.println("Balance : " + bank.getBalance());
			System.out.println("Enter the money to withdraw : ");
			double amount = sc.nextDouble();
			bank.withdraw(amount);
			System.out.println("After withdraw, Balance = "  + bank.getBalance());
		}
        catch(InvalidBalanceException e) {
        	System.out.println(e);
        }
	}

}
