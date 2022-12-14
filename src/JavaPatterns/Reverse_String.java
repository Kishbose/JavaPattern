package JavaPatterns;

public class Reverse_String {
	static String str = "hello java";

	public static String reverse(String word) {

		String output = new String();

		char[] value = word.toCharArray();

		for (int i = value.length - 1; i >= 0; i--) {
			System.out.print(value[i]);
		}

		return output;

	}

	public static void main(String[] args) {

		System.out.println(reverse(str));
	}
}
