package array_programs;

public class primeNumbersInArray {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		for (int x : arr) {
			int count=0;
			if (x==1) {
				continue;
			}
			for(int i=2;i<x;i++) {
			if(x%i==0) {
				count++;
				break;
			}
		}
			if (count==0) {
				System.out.println(x);
			}
		}
	}
}
