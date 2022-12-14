package JavaPatterns;

public class Palindrom_Num {
	
	public static void main(String[] args) {
		
		// 151 = 1 + 5 = 15

		int n = 152;
		int i, j = 0;
		int a = n;

		while (a > 0) {
			i = a % 10; 	//1	   5	 1
			j = (j*10)+i;   //1    15    150+1
			a = a / 10;     //15   1     0
		}

		if (n == j) {
			System.out.println(n+" is a Palindrom Number");
		} else {
			System.out.println(n+" is not a Not Palindrom");
		}
	}

}



