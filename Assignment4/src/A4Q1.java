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
	 public static Node ins_Beg(Node q) {
    	q = new Node();
    	System.out.print("Enter the your regd_no : ");
    	q.regd_no = sc.nextInt();
    	System.out.print("Enter the mark : ");
    	q.mark = sc.nextFloat();
    	q.next = start;
    	return q;
    }
    
    public static void insEnd(Node temp) {
    	Node q = new Node();
    	System.out.print("Enter the your regd_no : ");
    	q.regd_no = sc.nextInt();
    	System.out.print("Enter the mark : ");
        q.mark = sc.nextFloat();
        q.next = null;
        if(start == null)
        	start = q;
        else
        	
        while(temp.next != null) {
        	temp = temp.next;
        	temp.next = q;
        }
    }
    public static void DelBeg() {
    	if(start == null) {
    		System.out.println("underflow");
    		return;
    	}
    	start = start.next;
    }
    
    public static void delEnd() {
        if (start == null) {
            System.out.println("Underflow: Linked list is empty.");
            return;
        }

        if(start.next == null) {
        	DelBeg();
        }
        else {
        	Node temp = start;
        	while(temp.next.next != null) {
        		temp = temp.next;
        	}
        	temp.next = null;
        }
    }
    
    public static void insLoc() {
    	System.out.println("Enter the node location");
    	int loc = sc.nextInt();
    	int c1 = count(start);
    	if(loc <= c1++) {
    		if(loc == 1) {
    			start = ins_Beg(start);
    		}
    		else if(loc == c1 +1)
    		    insEnd(start);
    		else {
    			Node q = new Node();
    			q.regd_no = sc.nextInt();
    	    	System.out.print("Enter the mark : ");
    	        q.mark = sc.nextFloat();
    	        Node temp = start;
    	        int cnt = 1;
    	        while(cnt < loc - 1) {
    	        	cnt++;
    	        	temp = temp.next;
    	        }
    	        
    	        temp.next = temp.next.next;
    		}
    	}	
    }
    
    public static void delLoc(Node start) {
        if (start == null) {
            System.out.println("Underflow: Linked list is empty.");
            return;
        }

        System.out.println("Enter the node location");
        int loc = sc.nextInt();
        int c = count(start);

        if (loc <= c) {
            if (loc == 1) {
                DelBeg();
            } else {
                Node temp = start;
                int cnt = 1;

                while (cnt < loc - 1) {
                    temp = temp.next;
                    cnt++;
                }

                temp.next = temp.next.next;
                System.out.println("Node at location " + loc + " deleted from the list.");
            }
        } else {
            System.out.println("Invalid location.");
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
		case 5 :
			ins_Beg(start);
			break;
		case 6 :
			insEnd(start);
			break;
		case 7 :
			DelBeg();
			break;
		case 8 :
			delEnd();
			break;
		case 9 :
			insLoc();
			break;
		case 10 :
			delLoc(start);
			break;
		default:
			System.out.println("WRONG CHOICE");
	    }
	}

	}

}
