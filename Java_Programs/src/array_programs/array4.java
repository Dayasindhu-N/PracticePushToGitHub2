package array_programs;

import java.util.Scanner;

public class array4 {

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
		System.out.println("The elements in the array are: ");
		for (int x : arr) {
			System.out.println(x);
		}
		sc.close();
	}
}