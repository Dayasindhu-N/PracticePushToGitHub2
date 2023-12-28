package array_programs;

import java.util.Scanner;

public class linearSearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the element to search");
		int key=sc.nextInt();
		int count=0;
		for (int x : arr) {
			if (key==x) {
				count++;
				System.out.println("Element= "+x);
			}
		}
		if(count==0) {
			System.out.println("Not found");
		}
		sc.close();
	}
}