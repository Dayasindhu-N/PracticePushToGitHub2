package number_programs;

import java.util.Scanner;

public class neonNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int square=n*n;
		System.out.println("Square of a given number="+square);
		int sum=0;
		while (square!=0) {
			int rem=square%10;
			sum+=rem;
			square=square/10;
		}
		System.out.println("Sum of a given square number="+sum);
		if (n==sum) {
			System.out.println("It is a NEON number");
		} else {
			System.out.println("It is not a NEON number");
			}
		sc.close();
	}
}
