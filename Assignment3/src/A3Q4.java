/*Write a java program to print an array of different type using a single Generic method. The
signature of printArray method is given below.
public static < E > void printArray( E[] inputArray)*/

import java.util.Scanner;
public class A3Q4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array Elements");
        Integer[] intarr = new Integer[5];
        for(int i = 0; i < 5; i++) {
        	intarr[i] = sc.nextInt();
        }
        System.out.print("Enter array contains : ");
        printArray(intarr);
        System.out.println("Enter double array elements");
        Double[] doubarr = new  Double[5];
        for(int i = 0; i < 5; i++) { 
        	doubarr[i] = sc.nextDouble();
        }
        System.out.print("Enter double array contains : ");
        printArray(doubarr);
        
	}
	public static < E > void printArray( E[] inputArray) {
		for(int i = 0; i < inputArray.length; i++) {
			System.out.println(inputArray[i] + " ");
			System.out.println();
		}
	}

}
