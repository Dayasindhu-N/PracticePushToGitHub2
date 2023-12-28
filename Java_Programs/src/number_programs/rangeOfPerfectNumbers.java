package number_programs;

import java.util.Scanner;

public class rangeOfPerfectNumbers {
	
	public static boolean checkPerfect(int a) {
		int sum=0;
		for (int i = 1; i <a; i++) {
			if (a%i==0) {
				sum+=i;
			}
		}
		if (sum==a) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value1");
		int n1 = sc.nextInt();
		System.out.println("Enter the value2");
		int n2 = sc.nextInt();
			for (int i = n1; i <=n2; i++) {
				if (checkPerfect(i)) {
					System.out.println(i);
				}
				sc.close();
			}
	}
}
