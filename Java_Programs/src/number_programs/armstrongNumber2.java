package number_programs;

import java.util.Scanner;

public class armstrongNumber2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int n = sc.nextInt();
		int temp1=n;
		int temp2=n;
		int count=0;
		int sum=0;
		while (n!=0) {
			count++;
			n=n/10;
		}
		while (temp1!=0) {
			int rem= temp1%10;
			sum+=(int)Math.pow(rem, count);
			temp1=temp1/10;
		}
		if (sum==temp2) {
			System.out.println("It is a armstrong number");
		} else {
			System.out.println("It is not a armstrong number");
		}
		sc.close();
	}
}
