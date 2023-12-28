package number_programs;

public class recurrsion {
	
	static int a=1;
	
	public static void m1() {
		if (a<=10) {
			System.out.println("Hi");
			a++;
			m1();
		}
	}

	public static void main(String[] args) {
		m1();
	}
}
