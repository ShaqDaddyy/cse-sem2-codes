import java.util.Scanner;
class Node{
	protected int regd_no;
	protected float mark;
	protected Node next;
}
public class A4Q1 {
    static Scanner sc = new Scanner(System.in);
    static Node start = null;
    
    public static void create(Node p) {
    	p =new Node();
    	System.out.print("Enter the your regd_no : ");
    	p.regd_no = sc.nextInt();
    	System.out.print("Enter the mark : ");
    	p.mark = sc.nextFloat();
    	p.next = null;
    	start = p;
    	System.out.println("Want to create more nodes???(y/n");
    	char ch = sc.next().charAt(0);
    	
    	while(ch != 'n') {
    		Node q =new Node();
        	System.out.print("Enter the your regd_no : ");
        	System.out.print("Enter the your regd_no : ");
        	p.regd_no = sc.nextInt();
        	System.out.print("Enter the mark : ");
        	p.mark = sc.nextFloat();
        	p.next = null;
        	start = p;
        	p = q;
        	System.out.println("Want to create more nodes???(y/n");
        	ch = sc.next().charAt(0);
    	}
    	if(ch == 'n') {
    		System.out.println("THANK YOU");
    	}
    }
	public static void main(String[] args) {
	int choice;
	while(true) {
		System.out.println("*****MENU*****");
		System.out.println("0:EXIT");
		System.out.println("1:Create");
		System.out.println("Enter the choice");
		choice = sc.nextInt();
		switch(choice) {
		case 0:
			System.exit(0);
		case 1:
			Node p = null;
			create(p);
		default:
			System.out.println("WRONG CHOICE");
	    }
	}

	}

}
