package number_programs;

import java.util.Scanner;

public class secondSmallestDigitOfANumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int min=9;
		int temp=n;
		while (n!=0) {
			int rem=(n%10);
			if (min>rem) {
				min=rem;
			}
			n=n/10;
		}
		System.out.println("Smallest Digit="+min);
		int min2=9;
		while (temp!=0) {
			int rem=(temp%10);
			if (min2>rem && rem!=min) {
				min2=rem;
			}
			temp=temp/10;
		}
		System.out.println("Second Smallest Digit="+min2);
		sc.close();
	}

}
