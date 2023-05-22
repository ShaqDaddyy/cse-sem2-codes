/*Write a java method using Generics to count the occurrence of an element in an array of any
type. The signature of count method is given below.
public static <T> int count(T[] array, T item)*/

import java.util.Scanner;
public class A3Q5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		Integer[] array = new Integer[5];
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.print("elements are : ");
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("Enter the element to be search : ");
		int a = sc.nextInt();
		int c = count(array, a);
		System.out.println("Number of times " + a + " present int the array is " + c);
		sc.close();

	}
	public static <T> int count(T[] array, T item) {
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i].equals(item))
				count++;
			
		}
		return count;
	}
}
