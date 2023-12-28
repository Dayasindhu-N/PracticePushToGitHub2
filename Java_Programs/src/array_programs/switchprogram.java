package array_programs;

import java.util.Scanner;

public class switchprogram {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int[] arr = new int[n];
		int a=1;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the "+a+++" element");
			arr[i]=sc.nextInt();
		}
		boolean b=true;
		while (b) {
			System.out.println("1.Sum of Elements");
			System.out.println("2.Product of Elements");
			System.out.println("3.Summ ofn even elements");
			System.out.println("4.Product of even elements");
			System.out.println("5.Sum ofn odd elements");
			System.out.println("6.Product of odd elements");
			System.out.println("7.Exit");
			int n2=sc.nextInt();
			switch (n2) {
			case 1:{
				int sum=0;
				for (int x : arr) {
					sum+=x;
				}
				System.out.println("Sum of elements= "+sum);
			}break;
			case 2:{
				int pro=1;
				for (int x : arr) {
					pro*=x;
				}
				System.out.println("Product of the elements= "+pro);
			}break;
			case 3:{
				int sum=0;
				for (int x : arr) {
					if (x%2==0) {
						sum+=x;
					}
				}
				System.out.println("Sum of even elements="+sum);
			}break;
			case 4:{
				int pro=1;
				for (int x : arr) {
					if (x%2==0) {
						pro*=x;
					}
				}
				System.out.println("Product of even elements= "+pro);
			}break;
			case 5:{
				int sum=0;
				for (int x : arr) {
					if (x%2!=0) {
						sum+=x;
					}
				}
				System.out.println("Sum of odd elements="+sum);
			}break;
			case 6:{
				int pro=1;
				for (int x : arr) {
					if (x%2!=0) {
						pro*=x;
					}
				}
				System.out.println("Product of odd elements= "+pro);
			}break;
			case 7:{
				b=false;
				System.out.println("Thank You");
			}break;
			default:{
				System.out.println("Entry Invalid");
			}
			}
		}
		sc.close();
	}
}
