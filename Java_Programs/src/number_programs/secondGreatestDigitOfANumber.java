package number_programs;

import java.util.Scanner;

public class secondGreatestDigitOfANumber {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the value");
	int n = sc.nextInt();
	int max=0;
	int temp=n;
	while (n!=0) {
		int rem=(n%10);
		if (max<rem) {
			max=rem;
		}
		n=n/10;
	}
	System.out.println("Greatest Digit="+max);
	int max2=0;
	while (temp!=0) {
		int rem=(temp%10);
		if (max2<rem && rem!=max) {
			max2=rem;
		}
		temp=temp/10;
	}
	System.out.println("Second Greatest Digit="+max2);
	sc.close();
	}
}
