package JavaPatterns;

public class Swap_Only_Two {
	
	public static void main(String[] args) {
			
			int a=90;
			
			int b=20;
			
			//without 3rd variable
			
			a=a+b; //30
			b=a-b; //10
			a=a-b; //20
			
			System.out.println("a="+a+"  b="+b);
	}

}
