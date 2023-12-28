package number_programs;

import java.util.Scanner;

public class swappingOfNumbers2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value1");
		int n1 = sc.nextInt();
		System.out.println("Enter the value2");
		int n2 = sc.nextInt();
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("n1="+n1);
		System.out.println("n2="+n2);
		sc.close();
	}

}
