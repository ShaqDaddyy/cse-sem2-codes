/*Write a java program to print M-by-N array in the tabular format. Also, display the sum of 
elements of the array*/
import java.util.Scanner;

public class A1Q8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows and columns  :");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][]a = new int[r][c];
        System.out.println("Enter the elements");
        for(int i = 0; i < r; i++) {
        	for(int j = 0; j < c; j++) { 
        		a[i][j] = sc.nextInt();
        	
        }
	}
        System.out.println("Enter the elements");
        for(int i = 0; i < r; i++) {
        	for(int j = 0; j < c; j++) {
        		System.out.print(a[i][j] + " ");
        	}
        	System.out.println();
}
        
        int sum = 0;
        for(int i = 0; i < r; i++) {
        	for(int j = 0; j < c; j++) {
        		sum += a[i][j];
        	}
        		System.out.println("sum = " + sum);
        	}
	}
}
