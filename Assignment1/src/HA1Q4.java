/*Write a method to add two matrices. The header of the method is as follows:
 * public static double[][] addMatrix(double[][] a, double[][] b)
In order to be added, the two matrices must have the same dimensions and the same or
compatible types of elements
 */
import java.util.Scanner;
public class HA1Q4 {
	public static double[][] addMatrix(double[][] a, double[][] b){
		int row = a.length;
		int column = a[0].length;
		double sum[][] = new double[row][column];
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of row and column : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		double x[][] = new double[a][b];
		double y[][] = new double[a][b];
		double z[][] = new double[a][b];
		System.out.println("Enter element of first element : ");
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				x[i][j] = sc.nextDouble();
			}
		}
		System.out.println("Enter element of second element : ");
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				y[i][j] = sc.nextDouble();
			}
		}
		System.out.println("The addition of two array is : ");
		z = addMatrix(x, y);
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				System.out.print(z[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
