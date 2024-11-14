package day3;

public class Question6 {
	/*
	 * Write a program to check whether a number is a Strong number or not.
	 * Strong number is a special number whose sum of factorial of digits is equal to the original number. 
	 * For example: 145 is a strong number. Since, 1! + 4! + 5! = 145
	 */
	
	static int fact(int num) {
		if(num==1) {
			return num;
		}
		return num*fact(num-1);
		
	}
	
	static int ans = 0;
	static int strong(int num) {
		if(num>0 && num<10) {
			return num;
		}
		return fact(num%10) + strong(num/10);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strong(145));

	}

}
