package number_programs;

import java.util.Scanner;

public class evenNumber {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=obj.nextInt();
		if (n%2==0) {
			System.out.println("It is an even number");
		} else {
			System.out.println("It is an odd number");
		}
		obj.close();
	}
}