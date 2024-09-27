package question3;

import java.util.Scanner;

public class NumAndN {
	
	public static String toBinary(int num) {
		String s="";
		int divident = 20;
		int remainder =0;
		
		while((divident/2)!=1) {
		    remainder = divident - ((divident/2) * 2);
			s = s + remainder;
			divident = divident/2;
			remainder = 0;
		}
		if((divident/2)==1) {
		    remainder = divident - ((divident/2) * 2);
			s = s + remainder;
			divident = divident/2;
			remainder = 1;
			s = s + remainder;
		}
		
		//StringBuilder sb = new StringBuilder(s);
		 //s = sb.reverse().toString();
       return s;
	}

	public static void main(String[] args) {
		
		System.out.print("Enter the number :-  ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("Enter the no. of bit which you want to check wheather it is 0 or 1 :-  ");
		int n = sc.nextInt();
		String output = toBinary(num);
		if(n>output.length()) {
			System.out.println("number have only " +output.length() + "bits");
		}
		else {
			System.out.println("nth bit is " + output.charAt(n-1));
		}
		
		
}
}
