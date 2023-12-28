package array_programs;

import java.util.Scanner;

public class evenNumbersOfArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		int a=1;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the "+a+++" element");
			arr[i] = sc.nextInt();
		}
		System.out.println("The even numbers in the array are: ");
		for (int x : arr) {
			if (x%2==0) {
				System.out.println(x);
			}
		}
		sc.close();
	}
}