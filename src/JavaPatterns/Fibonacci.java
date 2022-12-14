package JavaPatterns;

public class Fibonacci {
	public static void main(String[] args) {
		
	
		//print first 10 fibo number
				//0,1,1,2,3,5,8,13....
				
				int a=0;
				int b=1;
				int c = 0;
				System.out.print(a+" "); //0
				System.out.print(b+" "); //1
				
				for (int i = 1; i <15; i++) {
					c=a+b; //1+1=2
					System.out.print(c+" "); //1
					a=b; //1
					b=c; //2
				
				}
				
			}

		}

