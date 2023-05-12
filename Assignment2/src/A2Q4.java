/*Define a class called product. Two instance variables of the class are pid (product-id) and 
price (product price). It consists of one static variable tot_price (total price). Initialize the value 
of instance variables through parameterized constructor. It consists of a display ( ) method to 
display the value of instance variables. A person went to market and purchase 5 different 
products. Using the above mentioned class, display the details of products that the person has 
purchased. Also, determine how much total amount the person will pay for the purchase of 5 
products.*/

import java.util.Scanner;
class Product{
	int pid;
    double price;
    static double totalpr = 0;
    Product(int p, double pr){
    	pid = p;
    	price = pr;
    	
    }
    void display() {
    	System.out.println("pid  = " + pid +  ", "  +  "price = " + price);
    }
}
public class A2Q4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of the pid and price ");
    
    Product[]obj = new Product[5];
    for(int i = 0; i < 5; i++) {
    	int pid = sc.nextInt();
        double price = sc.nextDouble();
    	obj[i] = new Product(pid, price);
    	
    }
    for(int i = 0; i < 5; i++) {
    	System.out.println();
    	System.out.println();
    	System.out.println("Product details = " + (i+1));
    	
    	obj[i].display();
    	Product.totalpr += obj[i].price;
    	
    }
    System.out.println("\n\nTotal Price = " + Product.totalpr);
	}

}
