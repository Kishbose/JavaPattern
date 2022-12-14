package JavaPatterns;

public class Prime_Between_Numbers {

	public static void main(String[] args) {

		int count = 0;

		for (int n = 2; n <= 100; n++) {

			int condition = 0;

			for (int i = 2; i < n; i++) {

				if (n % i == 0) {
					condition++;
				}
			}
				if (condition == 0) {
					System.out.println(n + " is prime");
					count++;
				}
			}
		
	System.out.println("Total number of Prime numbers: " + count);
	}
}
