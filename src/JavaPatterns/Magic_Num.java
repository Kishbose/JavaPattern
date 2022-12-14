package JavaPatterns;

import java.util.Scanner;

public class Magic_Num {
	   // method to find sum of digits
	   // of a given number
	   public static int sumOfDigits(int number) {

	      int sum = 0;

	      while(number != 0) {
	         // find last digit
	         // add last digit to sum
	         sum += (number % 10);

	         // remove last digit
	         number = number / 10;
	      }

	      // return sum of digits of the number
	      return sum;
	   }

	   // method to check number is magic number
	   public static boolean isMagic(int number) {

	      int result = number;

	      // find sum of digits until
	      // number having single digit
	      while(result / 10 != 0) {
	        result = sumOfDigits(result);
	      }

	      return (result==1) ? true : false;
	   }

	   public static void main(String[] args) {

	      // declare variables
	      int number = 0;

	      // read the input 
	      Scanner scan =  new Scanner(System.in);
	      System.out.print("Enter an integer number:: ");
	      number = scan.nextInt();

	      // check the number is magic number or not
	      if(isMagic(number))
	      System.out.println(number+" is a"
	        + " magic number");
	      else
	      System.out.println(number+" is not a"
	              + " magic number");

	      // close Scanner class object
	      scan.close();
	   }
	}


