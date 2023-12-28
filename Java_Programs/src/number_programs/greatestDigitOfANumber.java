package number_programs;

import java.util.Scanner;

public class greatestDigitOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int max=(n%10);
		while (n!=0) {
			int rem=(n%10);
			if (max<rem) {
				max=rem;
			}
			n=n/10;
		}
		System.out.println("Greatest Digit="+max);
		sc.close();
	}
}
