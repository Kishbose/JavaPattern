package JavaPatterns;

public class Odd_Or_Even {

	public static void oddorEven() {
		System.out.println("Odd Num");
		System.out.println("==========");
		for (int i = 0; i<10; i++) {
			if (i % 2 != 0)
			System.out.println(i);
		}
		System.out.println("Even Num");
		System.out.println("==========");
		for (int i = 0; i<10; i++) {
			if (i % 2 == 0)
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		oddorEven();
	}

}
