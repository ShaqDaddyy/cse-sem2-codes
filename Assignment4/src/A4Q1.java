package trycode;

import java.util.Scanner;
class Node {
	protected int regd_no;
	protected float mark;
	protected Node next;
}
public class prac {
	static Scanner sc = new Scanner(System.in);
	static Node start = null;
	
	public static void create(Node p) {
		p = new Node();
		System.out.println("Enter your registration number : ");
		p.regd_no = sc.nextInt();
		System.out.println("Enter your marks obtained : ");
		p.mark = sc.nextFloat();
		p.next = null;
		start = p;
		
		System.out.println("Do you want to create another code (y/n) ? ");
		char c = sc.next().charAt(0);
		
		while(c == 'y') {
			Node q = new Node();
			System.out.println("Enter your registration number : ");
			p.regd_no = sc.nextInt();
			System.out.println("Enter your marks obtained : ");
			p.mark = sc.nextFloat();
			p.next = null;
			start = p;
			p = q;
			
			System.out.println("Do you want to create another code (y/n) ? ");
			c = sc.next().charAt(0);
		}
	}
	
	public static void display(Node temp) {
		while(temp != null) {
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
		System.out.println("Enter your regd no to increase your marks : ");
		int r = sc.nextInt();
		while(temp != null) {
			if(temp.regd_no == r) {
				System.out.println("Enter the marks to be increased : ");
				int m = sc.nextInt();
				temp.mark = temp.mark + m;
				pos = 1;
			}
			temp = temp.next;
		}
		if(pos == 0) {
			System.out.println("Student information is not available. ");
		}
	}
	
	public static Node insBeg(Node temp) {
		Node q = new Node();
		System.out.println("Enter your regd no : ");
		q.regd_no = sc.nextInt();
		System.out.println("Enter your marks obtained : ");
		q.mark = sc.nextFloat();
		q.next = start;
		return q;
	}
	
	public static void insEnd(Node temp) {
		Node q = new Node();
		System.out.println("Enter your regd no : ");
		q.regd_no = sc.nextInt();
		System.out.println("Enter your marks obtained : ");
		q.mark = sc.nextFloat();
		q.next = null;
		if(start == null)
			start = q;
		while(temp.next != null) {
			temp = temp.next;
			temp.next = q;
		}
	}
	
	public static void delBeg(Node temp) {
		if(start == null) {
			System.out.println("underflow");
			return;
		}
		start = start.next;
	}
	
	public static void delEnd(Node temp) {
		if(start == null) {
			System.out.println("underflow");
			return;
		}
		if(start.next == null) {
			delBeg(temp);
		}
		else {
			while(temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
		}
	}
	
	public static void insLoc(Node temp) {
		System.out.println("Enter the node location");
		int loc = sc.nextInt();
		int C = count(temp);
		if(loc <= C + 1) {
			if(loc == 1)
				insBeg(temp);
			else if(loc == C + 1)
			    insEnd(temp);
			else {
				Node q = new Node();
				q.regd_no = sc.nextInt();
				System.out.println("Enter your marks obtained : ");
				q.mark = sc.nextFloat();
				temp = start;
				int cnt = 1;
				while(cnt < loc - 1) {
				cnt++;
				temp = temp.next;
			}
			q.next = temp.next;	
			temp.next = q;
		}
	}
	}
	public static void delLoc(Node temp) {
		System.out.println("Emter the node location");
		int loc = sc.nextInt();
		int c1 = count(temp);
		if(loc <= c1 + 1) {
			if(start ==  null) {
				System.out.println("underflow");
				return;
			}
			if(loc == 1)
				delBeg(temp);
			else if(loc == c1 + 1)
				delBeg(temp);
			else {
				temp = start;
				int cnt = 1;
				while(cnt < loc -1 ) {
					cnt++;
					temp = temp.next;
				}
				temp.next = temp.next.next;
			}
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
			System.out.println("5 : Insert a node at begining");
			System.out.println("6 : insert a node at end");
			System.out.println("7 : delete a node at Begining");
			System.out.println("8 : delete a node at end");
			System.out.println("9 : insert a node at any loc");
			System.out.println("10 : delete a node at any location");
			System.out.println("Enter the choice");
			choice = sc.nextInt();
			switch(choice) {
			case 0 :
				System.exit(0);
			case 1 :
				Node p = null;
				create(p);
			case 2 :
				display(start);
		        break;
			case 3 :
				int c = sc.nextInt();
				System.out.println("no pf nodes are : " + c);
				break;
			case 4 :
				search(start);
				break;
			case 5 :
				insBeg(start);
				break;
			case 6 :
				insEnd(start);
				break;
			case 7 :
				delBeg(start);
				break;
			case 8 :
				delEnd(start);
				break;
			case 9 :
				insLoc(start);
				break;
			case 10 :
				delLoc(start);
				break;
			}
		}
	}
}
