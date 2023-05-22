/*Write a method that sums all the numbers in the major diagonal in an n * n matrix of double
values using the following header:*/
import java.util.Scanner;
public class A1Q9 {
    public static double sumMajorDiagonal(double[][] m) {
    	double sum =0;
    	for(int i = 0; i < 4; i++) {
    		for(int j = 0; j < 4; j++) {
    			if(i == j)
    				sum += m[i][j];
    		}
    	}
		return sum;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a[][] = new double[4][4];
        System.out.println("Enter a 4-by-4 matrix row by row : ");
        for(int i = 0; i < 4; i++) {
        	for(int j = 0; j < 4; j++) {
        		a[i][j] = sc.nextDouble();
        	}
        }
        System.out.println("sum of major diagonal is " + sumMajorDiagonal(a));
       sc.close(); 
	}

}
