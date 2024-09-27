package question2;

import java.util.Scanner;

public class Maximumnum {
   Maximumnum(int a , int b){
	   String result;
	  result = a==b ? "both no. are equal" : ( result = a>b ? a + " is greater than " + b : b + " is greater than "+ a);
	   System.out.println(result);
   }
   public static void main (String args[]) {
	   System.out.println("Please enter two no. to check wheather maximum one");
	   Scanner sc = new Scanner(System.in);
	   System.out.print("first no. :- ");
	   int a = sc.nextInt() ;
	   System.out.print("second no. :- ");
	   int b = sc.nextInt() ;
	   Maximumnum m = new Maximumnum(a,b);
	   
	   
	   
   }
}
