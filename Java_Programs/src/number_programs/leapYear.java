package number_programs;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int n1 = sc.nextInt();
		if (n1%4==0 && n1%100!=0 || n1%400==0) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("It is not a leap year");
		}
		sc.close();
	}

}
