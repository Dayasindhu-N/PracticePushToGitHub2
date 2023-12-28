package number_programs;

import java.util.Scanner;

public class automorphicNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int sq=n*n;
		System.out.println("Square of a given number="+sq);
		boolean b=true;
		while (n!=0) {
			if (n%10!=sq%10) {
				b=false;
				break;
			}
			n=n/10;
			sq=sq/10;
		}
		if (b) {
			System.out.println("It is a automorphic number");
		} else {
			System.out.println("It is not a automorphic number");
		}
		sc.close();
	}
}
