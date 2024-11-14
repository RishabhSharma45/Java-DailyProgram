package day2;

import java.util.Scanner;

public class Question2 {
	
	//Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number ");
		int num1 = sc.nextInt();
		System.out.println("again enter a number to find the maximum  ");
		int num2 = sc.nextInt();
		int greater = num1>num2 ? num1 : num2;
		String msg = num1==num2 ? "both no. are equal" : "the greater no. is "+ greater ; 
		System.out.println(msg);
		

	}

}
