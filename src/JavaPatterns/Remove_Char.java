package JavaPatterns;

public class Remove_Char {
	
	public static void main(String[] args) {
		
		String input="heloo038r03rjsfjo";
		System.out.println(input);
		System.out.println(input.replaceAll("[^0-9]",""));
	}

}
