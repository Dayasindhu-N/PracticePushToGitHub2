package number_programs;

import java.util.Scanner;

public class armstrongNumber {

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
			int pro=1;
			for (int i = 1; i <=count; i++) {
				pro=pro*rem;
			}
			sum+=pro;
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
