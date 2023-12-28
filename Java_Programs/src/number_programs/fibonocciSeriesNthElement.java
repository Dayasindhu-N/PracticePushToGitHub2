package number_programs;

import java.util.Scanner;

public class fibonocciSeriesNthElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n1 = sc.nextInt();
		System.out.println("Enter the nth element");
		int n2=sc.nextInt();
		int a=0;
		int b=1;
		for (int i =3; i<=n1; i++) {
			int c=a+b;
			if (i==n2) {
			System.out.print(c+" ");
			}
			a=b;
			b=c;
		}
		sc.close();
	}
}
