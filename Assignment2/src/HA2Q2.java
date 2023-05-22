/*Define a class called Book with instance variables BName, BEdition, BPrice. Use constructor to 
initialize the instance variables of the class. Another instance method display ( ) to display the book 
information. A person purchase 5 different books. Display the book details which has the maximum 
price.*/
import java.util.Scanner;
class Book{
	String name;
	int Ed;
	double price;
    Book(String name, int Ed, double price){
    	this.name = name;
    	this.Ed = Ed;
    	this.price = price;
    }
    void display() {
    	System.out.println(this.name + "\t" + this.Ed + "\t" + this.price);
    }
    public double getPrice() {
    	return this.price;
    }
    void displaymax() {
    	System.out.println(this.name + " Book having price " + this.price  + " has maximum price. ");
    	
    }
}
public class HA2Q2 {

	public static void main(String[] args) {
		Book[] books = new Book[5];
		books[0] = new Book("JAVA DSA " , 5, 499.99);
		books[1] = new Book("Calculas II ", 2, 799.);
		books[2] = new Book("Economics ", 8, 649.99);
		books[3] = new Book("University PHY ", 9, 699.99);
		books[4] = new Book("Garph Theory ", 5, 459.99);
		System.out.println("Book Name\tEdition\tBook price");
		Book max = books[0];
		for(int i = 1; i < books.length; i++) {
			books[i].display();
			if(books[i].getPrice()>max.getPrice())
				max = books[i];
		}
		max.displaymax();
	}

}
