package number_programs;

import java.util.Scanner;

public class factorialRecurrsion {
	static int fact=1;
	public static int factorial(int a) {
		if (a>0) {
			fact=fact*a;
			factorial(--a);
		}
		return fact;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println(factorial(n));
		sc.close();
	}
}
