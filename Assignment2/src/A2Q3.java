import java.util.Scanner;
public class A2Q3 {
	String name;
	long roll;
    int dsamarks;
    void getdata() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter your information : ");
    	name = sc.nextLine();
    	roll = sc.nextLong();
    	dsamarks = sc.nextInt();
    	
    }
    void showdata() {
    	System.out.println("Roll = " + roll );
    	System.out.println("Name = " + name );
    	System.out.println("dsa mark = " + dsamarks);
    }
    
	public static void main(String[] args) {
		A2Q3 []a = new A2Q3[5];
		for(int i = 0; i < 5; i++) {
			a[i] = new A2Q3();
			a[i].getdata();
			a[i].showdata();
		}
	A2Q3 topper = new A2Q3();
    int l = a[0].dsamarks, index = 0;
    for(int i = 0; i < 5; i++) {
    	if(a[i].dsamarks > topper.dsamarks) {
    		topper = a[i];
    		
    	}
    }
    System.out.println();
    System.out.println();
    System.out.println("The topper in Dsa ");
    topper.showdata();
    
	}

}
