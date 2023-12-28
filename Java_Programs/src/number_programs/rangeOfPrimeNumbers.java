package number_programs;

import java.util.Scanner;

public class rangeOfPrimeNumbers {
	
	public static boolean checkPrime(int a) {
		int count=0;
		for (int i = 2; i <a; i++) {
			if (a%i==0) {
				count++;
				break;
			}
		}
		if (count==0) {
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
				if (checkPrime(i)) {
					System.out.println(i);
				}
				else {
					break;
				}
				sc.close();
			}
		}
	}
