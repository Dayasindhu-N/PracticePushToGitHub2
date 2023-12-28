package number_programs;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the value");
		int n=obj.nextInt();
		int sum=0;
		while (n!=0) {
			int rem=n%10;
			sum+=rem;
			n=n/10;
		}
		System.out.println("Sum of a given number="+sum);
		obj.close();
	}
}