/*Define a class called Student with instance variables Roll, Name, DSA_Mark. Also, the class 
consists of instance methods getdata( ), showdata( ) to provide input to the instance variable 
and to display the value of instance variable. Write a program to create the details of 5 students. 
Display the information of the students who has secured the highest DSA_Mark.*/

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
