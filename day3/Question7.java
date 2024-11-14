package day3;

public class Question7 {
	/*
	 * Write a program to check leap year using if else. 
	 * How to check whether a given year is a leap year or not. 
	 * [Hint:Take an input of any number. Store it in some variable say year. 
	 * If a year is exactly divisible by 4 and not divisible by 100, then it is a leap year.
	 *  Or if a year is exactly divisible by 400 then it is a leap year.]
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 1600;
		if(year%4==0 || year%100!=0 || year%400==0) {
			System.out.println(year+" is leap yaer");
		}
		else {	
			System.out.println(year+" is not a leap yaer");
		}
		

	}

}
