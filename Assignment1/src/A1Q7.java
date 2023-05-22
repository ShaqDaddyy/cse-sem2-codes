/*Write a java program to find the maximum and minimum and how many times they both occur
in an array of n elements. Find out the positions where the maximum first occurs and the
minimum last occurs.*/
import java.util.Scanner;

public class A1Q7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of elements  :");
        int r = sc.nextInt();
        
        int []a = new int[r];
        System.out.println("Enter the elements");
        for(int i = 0; i < r; i++) {
        	 
        		a[i] = sc.nextInt();
        	
        }
	
        System.out.println("Displaying the elements");
        for(int i = 0; i < r; i++) {
        	
        		System.out.print(a[i] + " ");
        	}
        int max = a[0], cl = 0, posl= 0;
        int min = a[r-1], sl = r-1, poss = 0;
        for(int i = 0; i < r; i++) {
        	if(a[i] > max) {
        		max = a[i];
        		cl = i + 1;
        	}
        }
        for(int i = 0; i < r; i++) {
        	if(a[i] < min) {
        		min = a[i];
        		sl = i + 1;
        	}
        	
        }
        int maxc = 0, minc = 0;
        for(int i = 0; i < r; i++) {
        	if(a[i] == max) {
        		maxc++;
        	}
        	if(a[i] == min) {
        		minc++;
        	}
        }
        System.out.println(" maximum : " + max);
        System.out.println(" minimum : " + min);
        System.out.println(" position of maximum : " + maxc);
        System.out.println(" position of minimum : " + minc);
	}

}
