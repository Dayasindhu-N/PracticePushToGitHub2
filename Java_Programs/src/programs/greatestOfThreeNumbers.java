package programs;

public class greatestOfThreeNumbers {

	public static void main(String[] args) {
		int a=100;
		int b=23;
		int c=300;
		if (a>b) {
			if (a>c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		} else if (b>c) {
			System.out.println(b);
		} 
		else {
			System.out.println(c);
		}
	}

}
