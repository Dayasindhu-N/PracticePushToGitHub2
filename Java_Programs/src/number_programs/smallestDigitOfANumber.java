package number_programs;

import java.util.Scanner;

public class smallestDigitOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int min=(n%10);
		while (n!=0) {
			int rem=(n%10);
			if (min>rem) {
				min=rem;
			}
			n=n/10;
		}
		System.out.println("Smallest Digit="+min);
		sc.close();
	}

}
