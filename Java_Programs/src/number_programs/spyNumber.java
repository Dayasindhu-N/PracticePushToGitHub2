package number_programs;

import java.util.Scanner;

public class spyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int sum=0;
		int product=1;
		while (n!=0) {
			int rem=n%10;
			sum+=rem;
			product*=rem;
			n=n/10;
		}
		System.out.println("Sum of a given number="+sum);
		System.out.println("Product of a given number digits="+product);
		if (sum==product) {
			System.out.println("It is a SPY number");
		} else {
			System.out.println("It is not a SPY number");
			}
		sc.close();
	}
}
