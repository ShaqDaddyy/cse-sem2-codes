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
	public static void display(Node temp){
		while(temp != null){
			System.out.println(temp.regd_no + " " + temp.mark);
			temp = temp.next;
		}
	}

	public static int count(Node temp) {
		int c = 0;
		while(temp != null) {
			c++;
			temp = temp.next;
		}
		return c;
	}
	public static void search(Node temp) {
		int pos = 0;
		System.out.println("Enter your regd no to increase the marks");
		int r = sc.nextInt();
		while(temp != null) {
			if(temp.regd_no == r {
				System.out.println("enter the marks to increase");
				int m = sc.nextInt();
				temp.mark = temp.mark + m;
				pos = 1;
			}
			temp = temp.next;
		}
		if(pos == 0) {
			System.out.println("Student info is not available");
		}
	}
	
	public static void main(String[] args) {
	int choice;
	while(true) {
		System.out.println("*****MENU*****");
		System.out.println("0 : EXIT");
		System.out.println("1 : Create");
		System.out.println("2 : display");
		System.out.println("3 : count nodes ");
		System.out.println("4 : search element");
		System.out.println("Enter the choice");
		choice = sc.nextInt();
		switch(choice) {
		case 0:
			System.exit(0);
		case 1:
			Node p = null;
			create(p);
		case 2:
			display(start);
			break;
		case 3:	
			int c = sc.nextInt();
			System.out.println("No of nodes are : " + c);
			break;
		case 4:
			search(start);
			break;
		default:
			System.out.println("WRONG CHOICE");
	    }
	}

	}

}
