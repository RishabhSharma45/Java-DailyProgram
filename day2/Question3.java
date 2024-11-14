package day2;

import java.util.Scanner;
import java.util.function.Predicate;

public class Question3 {
	
	//Write a program to declare two variables num and n 
	//and take an input during compilation time to check whether the nth bit of the given number is set (1) or not (0).
	static String s ="";
   static String toBinary(int num) {
	   //100
	   /*100%2 = 0
	    * 50%2 = 0
	    * 25%2 = 1
	    * 12%2 = 0
	    * 6%2 = 0
	    * 3%2 = 1
	    * 1
	    */
	   if(num==1) {
		   return 1+s;
	   }
	   s = toBinary(num/2)+num%2;
	   return s;
	   
   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		System.out.println("Enter the nth position of the no. to check weather it is 0 or 1");
        int n = sc.nextInt();
        
        //to check the length of no. if n>num.length return error
        String num1 = toBinary(num);
       Predicate<Integer> p = x-> x>num1.length()-1; 
      if(!p.test(n)) {
    	  System.out.println(num1);
    	  System.out.println(num1.charAt(n));
      }
      else {
    	  System.out.println("Ente valid nth bit as no. doesn't having " + n+ " th bit");
      }
	}
}
