package number_programs;

import java.util.Scanner;

public class sumOfOddDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int n=sc.nextInt();
		int sum=0;
		while (n!=0) {
			int rem=n%10;
			if (rem%2!=0) {
				sum+=rem;
			}
			n=n/10;
		}
		System.out.println("Sum of a given number="+sum);
		sc.close();
	}

}
