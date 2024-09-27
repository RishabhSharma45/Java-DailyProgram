package com.hello;

import java.util.Scanner;

public class Calculator {
	
	public static int add(int a , int b) {
		return a+b;
	}
	public static double add(double a , int b) {
		return a-b;
	}
	public static float add(float a , float b) {
		return a*b;
	}
	public static double add(double a ,  double b) {
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no.");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double c = sc.nextDouble();
		float d = sc.nextFloat();
		Calculator c1 = new Calculator();
		System.out.println(add(a, b));
		System.out.println(add(c, b));
		System.out.println(add(d, d));
		System.out.println(add(c, b));
		

	}

}
