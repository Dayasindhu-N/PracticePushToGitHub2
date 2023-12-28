package number_programs;

import java.util.Scanner;

public class productOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int product=1;
		while (n!=0) {
			int rem=n%10;
			product*=rem;
			n=n/10;
		}
		System.out.println("Product of a given number digits="+product);
		sc.close();
	}
}
